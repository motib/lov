// Learning Object Inheritance07C
//    equality (robust overriding)
class Particle {
    int position;

    Particle(int p) {
        position = p;
    }
    
    void newPosition(int delta) {
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
    
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof CParticle)) return false;
        CParticle c = (CParticle) obj;
        return this.position == c.position && this.charge == c.charge &&
               this.strange == c.strange;
    }
}

class Inheritance07C {
    public static void main(/*String[] args*/) {
        BParticle b1 = new BParticle(20, 2);
        CParticle c1 = new CParticle(20, 2, false);
        CParticle c2 = new CParticle(20, 2, true);
        CParticle c3 = new CParticle(20, 2, false);
        boolean eqc1null = c1.equals(null);
        boolean eqc1b1 = c1.equals(b1);
        boolean eqc1c2 = c1.equals(c2);
        boolean eqc1c3 = c1.equals(c3);
    }
}
