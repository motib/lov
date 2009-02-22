// Learning Object Inheritance09
//    overloading vs. overriding
class Particle {
    int position;

    Particle(int p) {
        position = p;
    }
    
    void newPosition(int delta) {
        position = position + delta;
    }
}

class AParticle extends Particle {
    double spin;

    AParticle(int p, double s) {
        super(p);
        spin = s;
    }

    void newPosition(int delta) {
    if (spin < delta)
            position = position + delta;
    }

    void newPosition(double delta) {
    if (position < delta)
            spin = spin + delta;
    }
}

class Inheritance09 {
    public static void main(/*String[] args*/) {
        Particle  p = new Particle(10);
        AParticle a1 = new AParticle(20, -1.0);
        AParticle a2 = new AParticle(20, -1.0);
        
        p.newPosition(10);
        int pPosition = p.position;
        a1.newPosition(10);
        int a1Position = a1.position;
        a2.newPosition(10.0);
        int a2Position = a2.position;
    }
}
