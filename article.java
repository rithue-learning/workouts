/**
 * Write a program to 
 * * input the cost price and the selling price of an article. 
 * * if the selling price is more than cost price then 
 * * * calculate and diaplay actual profit and profit percent
 * * if cost price and the selling price are equal, 
 * * * the program displays the message 'Neither profit nor loss'
 */
import java.util.Scanner;
public class article

{
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        int sellingprice,costprice ;
        System.out.println("enter selling price:");

        sellingprice = in.nextInt();
        System.out.println("enter costprice : " );
        costprice = in.nextInt();

        if (costprice>sellingprice){
            System.out.println("loss");

        }
        else if (costprice<sellingprice){
            System.out.println("profit");

        }
        else {
            System.out.print("neither loss nor profit ");

        }

    }
}