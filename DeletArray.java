
import java.util.*;                          
public class DeletArray
{ 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of the array ");
        int i;
        int size = in.nextInt();
        int arr[] = new int[size +1 ];
        int index;

        System.out.println("Enter list of numbers or the array;");
        for(i=0 ; i< size ; i ++){

            arr[i]=in.nextInt();

        }
        System.out.println("Enter index to be deleted;");
        index = in.nextInt();
        for (i=index+1;i<size; i++){
            arr[i-1]= arr[i];
            size--;
            System.out.println("Array with deleted index;");{
                for(i=0;i<size;i++)
                    System.out.println(arr[i]);

            }
            
        }
    }
}

         
        

