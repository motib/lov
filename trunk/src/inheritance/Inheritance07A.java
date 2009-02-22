// Learning Object Inheritance07A
//    equality (== vs. equals)
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
}

class Inheritance07A {
    public static void main(/*String[] args*/) {
        AParticle a1 = new AParticle(20, 2.0);
        AParticle a2 = a1;
        AParticle a3 = new AParticle(20, 2.0);
        boolean eqop12 = a1 == a2;
        boolean eqop13 = a1 == a3;
        boolean eqmethod = a1.equals(a3);
    }
}
