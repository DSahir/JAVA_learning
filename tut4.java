import java.util.Scanner;
public class tut4 {
    static Scanner inp = new Scanner(System.in);
        public static void main(String[] args){
            int i = 1;
            while(i < 6){
                if (i == 3){
                  i = i+2;
                  continue;
                
                }
                System.out.println(i);
                i++;
            }

            //flaot and pi

            double mypi = 4.0;
            double j =  3.0;

            // 4 - 4/3 + 4/5 - 4/7
            while(j < 11){
                mypi = mypi -(4/j) + (4/(j+2));
                j+= 4;
                System.out.println(mypi);
            }
            
            //untill user says stop

            System.out.println("Enter :");
            String yorn = "y";
            int h =1 ;
            while(yorn.equalsIgnoreCase("y")){  //equalsIgnoreCase is for strings
                System.out.println(h);
                h++;
                System.out.println("yes or no");
                yorn = inp.next();          //.nextLine a;lso works -- inp. is from Static Scanner 
            }

            // do while loop while(condn);
            //for loop also with multiple condn in same.
        }
}