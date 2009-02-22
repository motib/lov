// Learning Object Constructor01A
//    what are constructors for?
class Song {
    String name;
    int seconds;
    double pricePerSecond;
    
    public double computePrice() {
        return seconds * pricePerSecond;
    }
}

public class Constructor01A {
    public static void main(/*String[] args*/) {
        Song song1 = new Song();
        song1.name = "Waterloo";
        song1.seconds = 164;
        song1.pricePerSecond = 0.01;        
        double price = song1.computePrice();
    }
}
