// Learning Object Array09
//    arrays of objects
class Access {
    String name;
    int level;
    Access(String u, int l) {
        name = u; level = l;
    }
}

public class Array09 {
    static void swap(Access[] a, int i, int j) {
        Access temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(/*String[] args*/) {
        Access[] accesses = new Access[2];
        accesses[0] = new Access("Bob", 3);
        accesses[1] = new Access("Alice", 4);
        swap(accesses, 0, 1);
    }
}
