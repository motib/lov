// Learning Object Method03
//    calling a method from a method
public class Method03 {
    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    
    static void printMax(int a, int b) {
        int max;
        max = Method03.maximum(a, b);
        System.out.println(max);
    }
    
    public static void main(/*String[] args*/) {
        printMax(10, 20);
    }
}
