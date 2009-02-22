// Learning Object Constructor08
//    constructors with subclass object parameters
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

class DiscountSong extends Song {
    double discount;

    DiscountSong(String n, int s, double p, double d) {
        super(n, s, p);
        discount = d;
    }

    public double computePrice() {
        return seconds * pricePerSecond * discount;
    }
}

class SongSet {
    public Song track1, track2;

    public SongSet(Song t1, Song t2) {
        track1 = t1; track2 = t2;
    }
}

public class Constructor08 {
    public static void main(/*String[] args*/) {
        Song song1 = new Song("Waterloo", 164, 0.01);        
        DiscountSong song2 = new DiscountSong("Fernando", 253, 0.01, 0.8);
        SongSet set = new SongSet(song1, song2);        
        double price1 = set.track1.computePrice();
        double price2 = set.track2.computePrice();
    }
}
