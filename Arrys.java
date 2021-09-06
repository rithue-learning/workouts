
/**
 * Write a program in Java to store 20 temperatures in °F in a Single Dimensional Array (SDA) 
 * and display all the temperatures after converting them into °C.
 * Hint: (c/5) = (f - 32) / 9
 */
import java.util.*;

public class Arrys
{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double temp[] = new double [20];
        double tempc[] = new double [20];
        System.out.println("Enter 20 degrees in °F ");

        for( int a=0 ; a < temp.length ; a++){
            temp[a] = in.nextDouble();

        }

        System.out.print("°F to °C value :");
        for (int a =0;a<temp.length; a++) {
            double c = 5*((temp[a] - 32 )/ 9 );
            tempc[a] = c;
            System.out.println( temp[a] +" ==> "+ tempc[a] );

            
        }

    
    
    }
}
 