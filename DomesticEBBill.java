import java.util.*;
public class DomesticEBBill
{
    public void printBill( String name ,int b,double charges ,double fixedCharge, double total){
        System.out.println("----------------------------------");
        System.out.println("Eb bill generation");
        System.out.println("----------------------------------");
        System.out.println("Bill generates for Mr/Mrs"+" "+name );
        System.out.println("You have consumed:"+b+" "+"units");
        System.out.println("Charged for consumed units : Rs."+charges +" "+"only");
        System.out.println("Fixed charges per month :Rs."+fixedCharge);
        System.out.println("----------------------------------");
        System.out.println("Your Total Bill amount is : Rs." +total+" "+"only");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        DomesticEBBill eb = new DomesticEBBill();

        System.out.print(" Enter your name :");

        String name ;
        name  = in.nextLine(); 

        System.out.print("Enter total consumed units :" );

        int b= in.nextInt();
        System.out.println("Enter Domestic units:");
        int a = in.nextInt();

        if ( a<=100&&a>=0&& b<=100&&b>=0){

            double charges=b*0;
            double fixedCharges=0;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        }
        else if(a <= 200 &&  a >= 101 && b <= 100 && b>=0){
            double charges=b*0;
            double fixedCharges=20;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        }
        else if(a <= 200 &&  a >= 101 && b <= 101 && b>=200){
            double charges=b*1.5;
            double fixedCharges=20;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        }
        else if   (a <= 500 &&  a >= 201 && b <= 100 && b>=0){

            double charges=b*0 ;
            double fixedCharges=20;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        }
        
        else if   (a <= 500 &&  a >= 201 && b <= 101 && b>=200){

            double charges=b*2;
            double fixedCharges=30 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }
        else if   (a <= 500 &&  a >= 201 && b <= 201 && b>=500){

            double charges=b*3;
            double fixedCharges=30 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }
          else if   (a >500 && b <= 100 && b >= 0){

            double charges=b*0;
            double fixedCharges=50 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }
         else if   (a >500 && b <= 200 && b >= 101 ){

            double charges=b*3.5;
            double fixedCharges=50 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }
         else if   (a >500 && b <= 500&& b >= 201 ){

            double charges=b*4.6;
            double fixedCharges=50 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }
         else if   (a >500 && b > 500 ){

            double charges=b*6.6;
            double fixedCharges=50 ;
            double total= charges+fixedCharges;

            eb.printBill(name,b,charges , fixedCharges,total);

        
        }



    }

}