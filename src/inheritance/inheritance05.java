// Learning Object Inheritance05
//    heterogeneous data structures
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

class BParticle extends Particle {
    int charge;

    BParticle(int p, int c) {
        super(p);
        charge = c;
    }
}

class CParticle extends BParticle {
    boolean strange;

    CParticle(int p, int c, boolean s) {
        super(p, c);
        strange = s;
    }

    void newPosition(int delta) {
        if (strange) 
            position = position * charge;
    }
}

class Inheritance05 {
    public static void main(/*String[] args*/) {
        Particle[] p = new Particle[4];
        p[0] = new Particle(10);
        p[1] = new AParticle(20, 2.0);
        p[2] = new BParticle(30, 3);
        p[3] = new CParticle(40, 4, true);
        int i = 0;
        p[i++].newPosition(10);      
        p[i++].newPosition(10);      
        p[i++].newPosition(10);      
        p[i].newPosition(10);      
    }
}
