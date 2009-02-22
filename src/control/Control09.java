// Learning Object Control09
//    switch statements
public class Control09 {
    public static void main(/*String[] args*/) {
        int year = 2001;
        int month = 4;
        int days;
        switch (month) { 
            case 2: 
                days = (year % 4 == 0) ? 28 : 29;
                break;
            case 4: 
            case 6:
            case 9: 
            case 11:
                days = 30;
            default:
                days = 31;
        }
        System.out.println(days);
    }
}
