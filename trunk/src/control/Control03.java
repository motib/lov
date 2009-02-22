// Learning Object Control03
//    while loops
public class Control03 {
    static int LIMIT = 100;
    public static void main(/*String[] args*/) {
        int factorial = 1;
        int n = 1;
        while (factorial < LIMIT) {
            System.out.println(factorial);
            n++;
            factorial = factorial * n;
        }
    }
}
