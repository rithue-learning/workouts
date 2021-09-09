/**

 * Write a program to enter a two digit number and find out its first factor excluding 1 (one). 
 * The program then find the second factor (when the number is divide by the first factor) and finally displays both the factors.

 * Hint: Use a non-return type function as void fact(int n) to accept the number.

 * Sample Input: 21

 * The first factor of 21 is 3

 * Sample Output: 3, 7

 * Sample Input: 30

 * The first factor of 30 is 2

 * Sample Output: 2, 15

 */

import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a two digit  number to find its  factors ");
        int num = in.nextInt();
        Factors f = new   Factors();
        f.fact(num);

    }
    public  void fact(int num){
        int f1 =1;
        int f2 = 1 ;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                f1 = i;
                break;

            }

        }
        f2 = num/f1 ;  

        System.out.println(" factors of the two digit number are "+f1 +" and  "+f2);

    } 

}