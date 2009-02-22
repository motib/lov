// Learning Object Constructor05
//    explicit default constructors
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

    Song() {
        this("No song", 0, 0.0);
    }

    private double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor05 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song();
    }
}
