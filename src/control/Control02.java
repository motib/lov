// Learning Object Control02
//    conditional expressions
public class Control02 {
    public static void main(/*String[] args*/) {
        int year = 2001;
        int month = 2;
        int days;
        if (month == 2)
            days = (year % 4 == 0) ? 28 : 29;
        else if (month == 4 || month == 6 ||
                month == 9 || month == 11)
            days = 30;
        else
            days = 31;
        System.out.println(days);
    }
}
