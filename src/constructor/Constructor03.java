// Learning Object Constructor03
//    overloading constructors
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
        name = n;
        seconds = s;
        pricePerSecond = DEFAULT_PRICE;
        price = computePrice();
    }

    private double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor03 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song("Waterloo", 164, 0.01);
        Song song2 = new Song("Fernando", 253);
    }
}
