// Learning Object Array01B
//    array objects
public class Array01B {
    private final static int SIZE = 7; 
    public static void main(/*String[] args*/) {
        int[] fib = new int[SIZE];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i-1] + fib[i-2];
    }
}
