// Learning Object Control01
//    if statements
public class Control01 {
    public static void main(/*String[] args*/) {
        int year = 2000;
        int month = 6;
        int days;
        if (month == 2)
            if (year % 4 == 0)
                days = 28;
            else
                days = 29;
        else if (month == 4 || month == 6 ||
                month == 9 || month == 11)
            days = 30;
        else
            days = 31;
        System.out.println(days);
    }
}
