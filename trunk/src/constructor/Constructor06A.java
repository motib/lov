// Learning Object Constructor06A
//    constructors for subclasses
class Song {
    String name;
    int seconds;
    double pricePerSecond;
    double price;
    
    Song(String n, int s, double p) {
        name = n;
        seconds = s;
        pricePerSecond = p;
        price = computePrice();
    }

    private double computePrice() {
        return seconds * pricePerSecond;
    }
}

class DiscountSong extends Song {
    double discount;
    
    DiscountSong(String n, int s, double p, double d) {
        super(n, s, p);
        discount = d;
    }

    private double computePrice() {
        return seconds * pricePerSecond * discount;
    }
}

public class Constructor06A {
    public static void main(/*String[] args*/) {
        DiscountSong song1 = new DiscountSong("Waterloo", 164, 0.01, 0.8);
        double price = song1.price;
    }
}
