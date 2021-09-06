import java.util.*;
public class EBBillWithFunctions
{
    public void printBill( String name ,int units,double billAmount){
        System.out.println("----------------------------------");
        System.out.println("Eb bill generation");
        System.out.println("----------------------------------");
        System.out.println("Bill generates for Mr/Mrs"+" "+name );
        System.out.println("You have consumed:"+units+" "+"units");
        System.out.println("Your Bill amount is : Rs." +billAmount +" "+"only");
        System.out.println("----------------------------------");

    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        EBBillWithFunctions eb=new EBBillWithFunctions();

        System.out.print(" Enter your name :");

        String type ;
        type = in.nextLine();

        System.out.println("M:"+" "+"Metero Lights");
        System.out.println("C:"+" "+"Light Commercial");
        System.out.println("I:"+" "+"Cottage & Tiny Industries");
        System.out.println("L:"+" "+"Power Looms");
        System.out.println("T:"+" "+"Temporary Supply");
        System.out.println("W:"+" "+"Public Light Town");
        System.out.println("G:"+" "+"Govt Schools");
        System.out.println("H:"+" "+" Private Hospital Institution ");
        System.out.println("P:"+" "+"Public Workshop");

        System.out.print("Enter connection type:");
        char option;
        option= in.next().charAt(0);

        System.out.print("Enter total consumed units :" );

        int b= in.nextInt();

        switch (option){
            case 'M':

            double a = 6.35*b;

            eb.printBill(type,b,a);

            break;
            case 'I':


            if (b<=500){
                double c = 4.00*b;
                eb.printBill(type,b,c);
            }
            else{
                double c = (500*4.00) + (b-500)*4.6;
                eb.printBill(type,b,c);
            }

            break;
            case 'C':
            if (b<=100){
                double d = 5.00*b;
                eb.printBill(type,b,d);
            }
            else{
                double d = 8.05*b;
                eb.printBill(type,b,d);
            }

            
            break;
            case 'L':

            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.print("You have consumed:"+b);
            System.out.println(" "+"units");
            if (b<=750){

                double e = 0*b;
                System.out.println("Your Bill amount is : Rs." +e +" "+"only");}
            else if(b==751 && b <=1000)
            {
                double e = 2.3*b;
                System.out.println("Your Bill amount is : Rs." +e +" "+"only");

            }
            else if(b==1001 && b <= 1500)
            {
                double e = 3.45*b;
                System.out.println("Your Bill amount is : Rs." +e +" "+"only");

            }
            else
            {
                double e = 4.6*b;
                System.out.println("Your Bill amount is : Rs." +e +" "+"only");

            }

            System.out.println("----------------------------------");
            break;
            case 'T':
            double f = 12*b;
            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.print("You have consumed:"+b);
            System.out.println(" "+"units");

            System.out.println("Your Bill amount is : Rs." +f +" "+"only");
            System.out.println("----------------------------------");

            break;
            case 'W':
            double g = 6.35*b;
            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.print("You have consumed:"+b);
            System.out.println(" "+"units");

            System.out.println("Your Bill amount is : Rs." +g +" "+"only");
            System.out.println("----------------------------------");
            break;
            case 'G':
            double h = 5.75*b;
            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.print("You have consumed:"+b);
            System.out.println(" "+"units");
            System.out.println("Your Bill amount is : Rs." +h +" "+"only");
            System.out.println("----------------------------------");

            break;
            case 'H' :
            double i = 7.5*b;
            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.print("You have consumed:"+b); 
            System.out.println(" "+"units");
            System.out.println("Your Bill amount is : Rs." +i +" "+"only");
            System.out.println("----------------------------------");

            break;
            case 'P':

            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Eb bill generation");
            System.out.println("----------------------------------");
            System.out.println("Bill generates for Mr/Mrs"+" "+type);
            System.out.println("You have consumed:"+b +" "+"units");

            if (b<=120){

                double k = 2.85*b;
                System.out.println("Your Bill amount is : Rs." +k +" "+"only");}
            else{
                double k = 5.75*b;
                System.out.println("Your Bill amount is : Rs." +k +" "+"only");

            }
            System.out.println("----------------------------------");
            break;
            default :
            System.out.println("Choose from the option");
            break;

        }
    }

}