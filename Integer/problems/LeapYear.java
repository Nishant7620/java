public class LeapYear{


    public String year(int year){
        if (year % 400 == 0 &&  year % 100!=0 || year % 4 == 0){
            return "leap year";
        }
        else {
            return "not a leap year";
        }
    }
    public static void main(String[] args){
        LeapYear year = new LeapYear();
       System.out.println(year.year(2000));
    }
}