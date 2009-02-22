// Learning Object Inheritance06
//    abstract classes
abstract class Particle {
    int position;

    Particle(int p) {
        position = p;
    }
    abstract void newPosition(int delta);
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

class Inheritance06 {
    public static void main(/*String[] args*/) {
        Particle[] p = new Particle[3];
        p[0] = new AParticle(20, 2.0);
        p[1] = new BParticle(30, 3);
        p[2] = new CParticle(40, 4, true);
        int i = 0;
        p[i++].newPosition(10);
        p[i++].newPosition(10);
        p[i].newPosition(10);
    }
}
