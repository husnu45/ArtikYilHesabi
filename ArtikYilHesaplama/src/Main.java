
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getYearFromUser = new Scanner(System.in);
        
        System.out.println("Please Enter a Year : ");
        
        int isLeapYear = getYearFromUser.nextInt();
        
        if((isLeapYear % 4 == 0 && isLeapYear % 100 != 0) || (isLeapYear % 400 == 0)){
            
            System.out.println("The year you entered" + isLeapYear + " is a leap year");
            
        }
        
        
        
    }
    
}
