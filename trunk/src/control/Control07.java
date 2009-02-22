// Learning Object Control07
//    General for statements
public class Control07 {
    static final int N = 100;
    public static void main(/*String[] args*/) {
        int sum = 0;
        for (int i = 0; i < Math.sqrt(N); i = i + 3)
            sum = sum + i;
        System.out.println(sum);
    }
}
