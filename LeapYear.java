import java.util.Scanner;
public class LeapYear
{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year to know whether its a leap year  :" );
        int a = in.nextInt();

        if ( a%4==0){
            System.out.println("The year is a leap year ");
        }
        else
            System.out.println("The year is not a leap year");

    }
}