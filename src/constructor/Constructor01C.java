// Learning Object Constructor01C
//    what are constructors for?
class Song {
    String name;
    int seconds;
    double pricePerSecond;
    
    Song(String n, int s, double p) {
        name = n;
        seconds = s;
        pricePerSecond = p;
    }

    public double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor01C {
    public static void main(/*String[] args*/) {
        Song song1 = new Song("Waterloo", 164, 0.01);        
        double price = song1.computePrice();
    }
}
