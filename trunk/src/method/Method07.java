// Learning Object Method07
//    objects as parameters
class Song {
    int seconds;
    
    Song(int s) {
        seconds = s;
    }

    double computePrice(double pricePerSecond) {
       return seconds * pricePerSecond;
    }
}

public class Method07 {

    static double getPrice(Song s, double ppS) {
        return s.computePrice(ppS);
    }

    public static void main(/*String[] args*/) {
        Song song1 = new Song(164);
        Song song2 = new Song(103);
        double price1 = getPrice(song1, 0.01);
        double price2 = getPrice(song2, 0.02);
        System.out.println(price1);
        System.out.println(price2);
    }
}
