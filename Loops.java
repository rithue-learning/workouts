// sum of ten natural numbers 
import java.util.*;
public class Loops
{

   public static void main (String [] args ){
        Scanner in = new Scanner(System.in);
        int a,n,sum=0;
        for(a=1; a<=10;a++){
            System.out.println ("enter a number :");
           n= in.nextInt();
            sum = sum+n;
        }
        
         System.out.println("the sum of numbers :"+sum);   
        
        
    }
    
    }