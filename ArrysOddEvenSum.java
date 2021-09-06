
import java.util.*;
public class ArrysOddEvenSum
{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        
        System.out.println("Enter 20 Numbers: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        
        int oddSum = 0, evenSum = 0;
        
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(evenSum += arr[i]);
            else
                System.out.print(oddSum += arr[i]);
                
                
            
        }
        
}
}
