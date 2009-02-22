// Learning Object Array01A
//    array objects
public class Array01A {
    public static void main(/*String[] args*/) {
        int[] fib;
        fib = new int[7];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i-1] + fib[i-2];
    }
}
