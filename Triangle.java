/**
 * Write a program to 
 * * input three angles of a triangle
 * * check whether a triangle is possible or not
 * * if possible check 
 * * * whether it is an acute-angled triangle
 * * * right angled triangle
 * * Triangle not Possible
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
    int a,b,c;
    a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
       int sum = a+b+c;
       System.out.println(sum);
       if(sum == 180){
       
       System.out.println("Triangle is possible");
    if(a<90 && b < 90 && c <90 ){
        System.out.println("acute angle triangle");
}
else if (a == 90 || b ==90  || c ==90){
System.out.println("right angle triangle");
}
else if (a > 90 || b > 90 || c > 90){
System.out.println(" obtuse angle triangle ");
}

    
    } 
    
    else {
    System.out.println("Triangle not possible");
    }
    
    }
}