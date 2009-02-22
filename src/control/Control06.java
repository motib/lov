// Learning Object Control06
//    counting with for statements
public class Control06 {
    static final int N = 6;
    public static void main(/*String[] args*/) {
        int factorial = 1;
        for (int i = 0; i < N; i++)
            factorial = factorial * (i+1);
        System.out.println(factorial);
    }
}
