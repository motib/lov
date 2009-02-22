// Learning Object Constructor02
//    computation within constructors
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

public class Constructor02 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song("Waterloo", 164, 0.01);        
    }
}
