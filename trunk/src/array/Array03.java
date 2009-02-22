// Learning Object Array03
//    passing arrays as parameters
public class Array03 {
    static void reverse(int[] a) {
        int temp,j;
        for (int i = 0; i < a.length / 2; i++) {
            j = a.length-i-1;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(/*String[] args*/) {
        int[] fib = {0, 1, 1, 2, 3, 5, 8};
        reverse(fib);
    }
}


