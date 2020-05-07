
public class HelloWorld{

    //static variables can be used in all the classes and final is for constants

    static String var1 = "678" ;
    static final double var2 = 5.6567;

    public static void main(String[] args){
        System.out.println(var2);
        int One = 3;
        int two = One + 1;
        System.out.println(two);

        //to print max possible values for an datatype

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // lower case true and false

        //boolean var3= true;
        
        //The ascii for the char is printed 

        char var4 = 'w';
        char var5 = 66;
        System.out.println(var4);
        System.out.println(var5);
        
        System.out.println(var4 +"" + var5);

        //Escape charac:
        // \b \f \n \r \t \" \' \\
        
         // to convert var to string

         String Stwo = Integer.toString(two);
         String Svar2 = Double.toString(var2);
        //U can use here -Float - Short - Boolean-Long-Byte
        System.out.println(Stwo + " " + Svar2);

        // to convert stirng to int
        // parseShort --parseLong ---etc

        int Ivar1 = Integer.parseInt(var1);
        


        //Type casting
        //new var holds max possible value in case of overflow
        // (byte) (short) (long) (double)  works
        // float -- cahr --boolean ----dont
        int newvar = (int)var2 ;
        System.out.print(newvar + "  " + Ivar1);


    }
} 

//byte bigByte = 127
//short bigShort  = 32767 -----this are the size 
//int bigInt = 2100000000
//long bigLong = 922000000000000L
//float bigFloat = .31468907F
//double = bigDouble = 6.34567894567890D