// Learning Object Inheritance04
//    downcasting
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

class Inheritance04 {
    public static void main(/*String[] args*/) {
        Particle  p = new Particle(10);
        AParticle a = new AParticle(20, 2.0);
        
        int pPosition = p.position;
        p = a;
        int paPosition = p.position;
        a = (AParticle) p;
        int aPosition = a.position;
        double sSpin = a.spin;
    }
}
