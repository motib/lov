// Learning Object Inheritance08
//    clone
class Particle implements Cloneable {
    int position;

    Particle(int p) {
        position = p;
    }
    
    void newPosition(int delta) {
        position = position + delta;
    }
    
    protected Object clone() {
        try {
            Particle p = (Particle) super.clone();
            p.newPosition(10);
            return p;
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new Error();
        }
    }
}

class Inheritance08 {
    public static void main(String[] args) {
        Particle p1 = new Particle(20);
        Particle p2 = p1;
        p1.newPosition(10);
        System.out.println(p1.position);
        System.out.println(p2.position);

        Particle p3 = (Particle) p1.clone();
        System.out.println(p1.position);
        System.out.println(p3.position);

        p3.newPosition(10);
        System.out.println(p1.position);
        System.out.println(p3.position);
    }
}
