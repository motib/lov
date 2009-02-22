// Learning Object Constructor06C
//    constructors for subclasses
class Song {
    String name;
    int seconds;
    double pricePerSecond;
    
    Song(String n, int s, double p) {
        name = n;
        seconds = s;
        pricePerSecond = p;
    }

    public double getPrice() {
        return seconds * pricePerSecond;
    }
}

class DiscountSong extends Song {
    double discount;
    
    DiscountSong(String n, int s, double p, double d) {
        super(n, s, p);
        discount = d;
    }

    public double getPrice() {
        return seconds * pricePerSecond * discount;
    }
}

public class Constructor06C {
    public static void main(/*String[] args*/) {
        Song song1 = new DiscountSong("Waterloo", 164, 0.01, 0.8);
        double price = song1.getPrice();
    }
}
