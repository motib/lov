// Learning Object Method06B
//    calling a method on the same object
class Song {
    int seconds;
    
    Song(int s) {
        seconds = s;
    }

    static int level(int n) {
        return n * 100;
    }

    boolean discount(int s) {
        return s > level(3);
    }

    double computePrice(double pricePerSecond) {
        double price = seconds * pricePerSecond;
        if (discount(seconds)) 
            price = price * 0.9;
        return price;
    }
}

public class Method06B {
    public static void main(/* String[] args */) {
        Song song1 = new Song(164);
        Song song2 = new Song(403);
        double price1 = song1.computePrice(0.01);
        double price2 = song2.computePrice(0.01);
        System.out.println(price1);
        System.out.println(price2);
    }
}
