// Learning Object Control08
//    continue statements
public class Control08 {
    static final int N = 10;
    public static void main(/*String[] args*/) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) 
                    continue;
                else
                    sum = sum + i;
            }
            else if (i % 3 == 0)
                sum = sum + i;
            else
                continue;
        }
        System.out.println(sum);
    }
}
