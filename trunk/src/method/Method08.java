// Learning Object Method08
//    returning objects
class Song {
    int seconds;
    
    Song(int s) {
        seconds = s;
    }

    double computePrice(double pricePerSecond) {
       return seconds * pricePerSecond;
    }
}

public class Method08 {

    static Song longer(Song s1, Song s2) {
        if (s1.seconds > s2.seconds) 
            return s1;
        else
            return s2;
    }

    public static void main(/*String[] args*/) {
        Song song1 = new Song(164);
        Song song2 = new Song(103);
        Song longerSong  = longer(song1, song2);
        double price2 = longerSong.computePrice(0.01);
        System.out.println(price2);
    }
}
