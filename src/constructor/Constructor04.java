// Learning Object Constructor04
//    invoking one constructor from another
class Song {
    String name;
    int seconds;
    double pricePerSecond;
    double price;
    final static double DEFAULT_PRICE = 0.005;
    
    Song(String n, int s, double p) {
        name = n;
        seconds = s;
        pricePerSecond = p;
        price = computePrice();
    }

    Song(String n, int s) {
        this(n, s, DEFAULT_PRICE);
    }

    private double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor04 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song("Waterloo", 164);
    }
}
