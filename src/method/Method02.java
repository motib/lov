// Learning Object Method02
//    methods returning a value
public class Method02 {
    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    
    public static void main(/*String[] args*/) {
        int x = 10, y = 20;
        int max;
        max = maximum(x, y);
        System.out.println(max);
    }
}
