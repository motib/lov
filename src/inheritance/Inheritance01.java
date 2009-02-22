// Learning Object Inheritance01
//    inheriting fields
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

class Inheritance01 {
    public static void main(/*String[] args*/) {
        Particle  p = new Particle(10);
        AParticle a = new AParticle(20, 2.0);
        BParticle b = new BParticle(30, 3);
        CParticle c = new CParticle(40, 4, true);
        
        int pPosition = p.position;
        int aPosition = a.position;
        double aSpin  = a.spin;
        int bPosition = b.position;
        int bCharge = b.charge;
        int cPosition = c.position;
        int cCharge = c.charge;
        boolean cStrange = c.strange;
    }
}
