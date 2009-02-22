// Learning Object Array05
//    array assignment can create garbage
public class Array05 {
    static int[] first(int[] a) {
        int[] b = new int[a.length/2];
        for (int i = 0; i < a.length / 2; i++)
            b[i] = a[i];
        return b;
    }

    public static void main(/*String[] args*/) {
        int[] fib = {0, 1, 1, 2, 3, 5, 8};
        fib = first(fib);
    }
}
