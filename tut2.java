import java.util.Scanner;
public class tut2 {
    static Scanner inp = new Scanner(System.in); //it is string 

    public static void main(String[] args){
        System.out.print("Enter no.     ");
        if (inp.hasNextInt()) { // if user enters / types integer 
                                // hasNextDouble -- FLoat--Short--Byte--Long--Boolean
            int newvar = inp.nextInt();       // expect user to enter the integer n store it in newvar.... nextFloat()--nextDouble()---nextLine() for string---exceptations
            //System.out.println(inp);        // THROWS ERROR
            System.out.println(newvar);

            int twiceinp= newvar * 2 ;
            System.out.println(twiceinp + 2); 

            // Math functions

/*            int abNum = Math.abs(newvar);   // RETURNS ABSOLUTE VALUE ENTERED
            int bigger  =Math.max(4, 7);    //7
            int samller = Math.min(4, 1);   //1
            int ceilnm = (int)Math.ceil(4.53);   //5
            int floornm = (int)Math.floor(4.56);    //4
            
            double Squareroot = Math.sqrt(6.45);
            double rndNum = Math.random() * 5 ;     //RANDOM VALUE BETN 0 TO 0.999999 THEN MUL BY 5

*/
        }else{
            System.out.println("Only integers excepted");
        }

    }
}