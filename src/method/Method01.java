// Learning Object Method01
//    void methods
public class Method01 {
    static void printMax(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        System.out.println(max);
    }
    
    public static void main(/*String[] args*/) {
        int x = 10, y = 20;
        printMax(x, y);
        Method01.printMax(10, y);
    }
}
