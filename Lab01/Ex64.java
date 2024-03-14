package Java.Lab01;
import java.util.Scanner;

public class Ex64 {
    static int leapyear(int year){
        if (year %4 == 0){
            if (year % 100 == 0 && year % 400 !=0) return 0;
            return 1;
        } else return 0;
    }
    public static void main(String[] args) {

        Scanner inpp = new Scanner(System.in);

        System.out.print("Month: ");
        String month = inpp.nextLine();
        System.out.print("\n");
        System.out.print("Year: ");
        int year = inpp.nextInt();
        inpp.close();
        switch (month) {
            case "Jan","Jan.","January","1",
                 "March","Mar","Mar.","3",
                 "May", "5", "July", "7", 
                 "Jul","August","Aug.","Aug", "8", 
                 "October", "Oct.", "Oct", "10", 
                 "December", "Dec.", "Dec", "12"  : {
                    System.out.println("Days of this month : 31");
                    break;
                 }
            case "April", "Apr.", "Apr", "4", 
                 "June", "Jun.","Jun","6", 
                 "September", "Sep.", "Sep", "9", 
                 "November", "Nov.", "Nov", "11"  : {
                    System.out.println("Days of this month : 30");
                    break;
                 }  
            case "February", "Feb.", "Feb","2" : {
                if (leapyear(year) == 1){
                    System.out.println("Days of this month : 29");
                    break;
                } else {
                    System.out.println("Days of this month : 28");
                    break;
                }

            } 
            default : System.out.println("Invalid month");      
        }

    }
}
