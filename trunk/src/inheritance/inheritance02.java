// Learning Object Inheritance02
//    inheriting and overriding methods
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

class Inheritance02 {
    public static void main(/*String[] args*/) {
        Particle  p = new Particle(10);
        AParticle a = new AParticle(10, 2.0);
        BParticle b = new BParticle(10, 3);
        CParticle c = new CParticle(10, 4, true);
        
        p.newPosition(10);
        int pPosition = p.position;
        a.newPosition(10);
        int aPosition = a.position;
        b.newPosition(10);
        int bPosition = b.position;
        c.newPosition(10);
        int cPosition = c.position;
    }
}
