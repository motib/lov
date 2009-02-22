// Learning Object Method05
//    calling methods on an object
class Song {
    int seconds;
    
    Song(int s) {
        seconds = s;
    }

    double computePrice(double pricePerSecond) {
       return seconds * pricePerSecond;
    }
}

public class Method05 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song(164);
        Song song2 = new Song(103);
        double price1 = song1.computePrice(0.01);
        double price2 = song2.computePrice(0.02);
        System.out.println(price1);
        System.out.println(price2);
    }
}
