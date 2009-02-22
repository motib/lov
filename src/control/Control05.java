// Learning Object Control05
//    break statements
public class Control05 {
    public static void main(/*String[] args*/) {
        int input;
        int sum = 0;
        while (true) {
            input = Input.nextInt();
            if (input < 0) break;
            sum = sum + input;
        }
        System.out.println(sum);
    }
}
