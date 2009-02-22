// Learning Object Inheritance07B
//    equality (overloading equals)
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
    
    public boolean equals(BParticle b) {
        return  this.position == b.position && 
                this.charge == b.charge;
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
    
    public boolean equals(CParticle c) {
        return    this.position == c.position && 
                this.charge == c.charge &&
                  this.strange == c.strange;
    }
}

class Inheritance07B {
    public static void main(/*String[] args*/) {
        BParticle b1 = new BParticle(20, 2);
        BParticle b2 = new BParticle(20, 2);
        CParticle c1 = new CParticle(20, 2, false);
        CParticle c2 = new CParticle(20, 2, true);
        boolean eqb1b2 = b1.equals(b2);
        boolean eqc1c2 = c1.equals(c2);
        boolean eqb1c1 = b1.equals(c1);
        boolean eqc1b1 = c1.equals(b1);
    }
}
