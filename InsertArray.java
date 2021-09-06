
import java.util. *;
public class InsertArray
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of the array ");
        int size = in.nextInt();
        int arr[] = new int[size +1 ];
        System.out.println("enter list of numbers for the array "); 
        
        for(int i=0 ; i < size ;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("enter index ");
        int index = in.nextInt();
        System.out.println("enter value to be inserted ");
        int value = in.nextInt();
        for (int i= size -1; i>= index ; i--){
            arr[ i+1] = arr[i];
            
            
        }
        arr[index]=value;
        for( int i =0;i<arr.length;i++){
             System.out.println(arr[i]);
            
        }
        
        
    

      
    }
}
