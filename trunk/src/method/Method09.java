// Learning Object Method09
//    returning locally instantiated objects
class Song {
    int seconds;
    
    Song(int s) {
        seconds = s;
    }

    double computePrice(double pricePerSecond) {
       return seconds * pricePerSecond;
    }
}

public class Method09 {

    static Song doubleSong(Song s1) {
        Song d = new Song(s1.seconds*2);
        return d;
    }

    public static void main(/*String[] args*/) {
        Song song1 = new Song(164);
        Song longSong  = doubleSong(song1);
    }
}
