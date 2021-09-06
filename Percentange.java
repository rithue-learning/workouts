
/** * Write a program in Java using arrays: * (a) To store the Roll No., Name and marks in six subjects for 100 students. 
 * (b) Calculate the percentage of marks obtained by each candidate. The maximum marks in each subject are 100. 
 * (c) Calculate the Grade as per the given criteria: *  * ============================================== *
 * |    Percentage      | Marks         | Grade | * |============================================| * | 
 *   From            | 80 to 100     | A     | *
 * |    From            | 60 to 79      | B     | *
 * |    From            | 40 to 59      | C     | *
 * |    Less            | than 40       | D     | * ============================================== */

import java.util.*; 

public class Percentange
{
    public static void main(String[] args ){
        final int totalstudent = 3;
        Scanner in = new Scanner(System.in);
        int rollnum[]=new int [totalstudent];
        String name[] = new String [totalstudent];
        int submark1[]= new int [totalstudent];
        int submark2[]= new int [totalstudent];
        int submark3[]= new int [totalstudent];
        int submark4[]= new int [totalstudent];
        int submark5[]= new int [totalstudent];

        int submark6[]= new int [totalstudent];
        double percentage[] = new double [totalstudent];
        char g[] =new char[totalstudent];
        for(int i = 0 ; i<totalstudent;i++){
            System.out.println("Enter Student's name "+ (i+1)+ "details");
            System.out.println(" Enter name of the student   ");

            name[i]= in.nextLine();

            System.out.println(" Enter Roll number of the student ; ");
            rollnum[i]= in.nextInt();
            in.nextLine(); 

            System.out.println( " Enter sub 1 mark of the student : " );
            submark1[i]= in.nextInt();
            System.out.println("Enter sub 2 mark of the student :" );
            submark2[i]= in.nextInt();
            System.out.println("Enter sub 3 mark of the student :" );
            submark3[i]= in.nextInt();
            System.out.println("Enter sub 4 mark of the student :" ); 
            submark4[i]= in.nextInt();
            System.out.println( "Enter sub 5 mark of the student :" ); 
            submark5[i]= in.nextInt();
            System.out.println("Enter  sub 6 mark of the student :" );
            submark6[i]= in.nextInt();

            percentage[i]=(((submark1[i]+submark2[i]+submark3[i]+submark4[i]+submark5[i]+submark6[i])/600)*100);
            if (  percentage[i]<40 ) 
                g[i]='D';

            else if ( percentage[i]<60)
                g[i]='C';

            else if ( percentage[i] < 80)
                g[i]='B';
            else 
                g[i]= 'A';}
                System.out.println();
                for(int i = 0 ; i<totalstudent;i++){
                    System.out.println(rollnum[i]+name[i]+percentage[i]+g[i]);
                }

             

    }

}

