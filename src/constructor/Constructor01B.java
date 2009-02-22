// Learning Object Constructor01B
//    what are constructors for?
class Song {
    String name;
    int seconds;
    double pricePerSecond;

    Song() {
        name = "Waterloo";
        seconds = 164;
        pricePerSecond = 0.01;
    }
    
    public double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor01B {
    public static void main(/*String[] args*/) {
        Song song1 = new Song();        
        double price = song1.computePrice();
    }
}
