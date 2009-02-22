// Learning Object Array04
//    returning an array from a method
public class Array04 {
    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int j;
        for (int i = 0; i < a.length / 2; i++) {
            j = a.length-i-1;
            b[j] = a[i];
            b[i] = a[j];
        }
        return b;
    }

    public static void main(/*String[] args*/) {
        int[] fib = {0, 1, 1, 2, 3, 5, 8};
        int[] reversedFib = reverse(fib);
    }
}
