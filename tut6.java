// Exception Handling
//Arithmetic    Class not found     InedxOutOfBound InpMismatch     IpOpException     Illegal{Method Passed in illlegal argu}
//java.lang.RunTimeException---running
//java.lang.Exception ---compilersimport java.io.*; // For ip the file 
import java.io.*;
import java.util.*;

public class tut6 {

    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        divbyzero(2);
        System.out.println("Enter age");
        int age = getage();
        getfile("./a.txt");

        //throws return exp on func call
        try {
            getdiffile("a.txt");
        }catch(IOException e){
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void getdiffile(String filenm) throws IOException,FileNotFoundException {
        //throws Exp1 , Exp2 
        FileInputStream file = new FileInputStream(filenm);

    }

    public static void getfile(String filenm) {
        try{
            FileInputStream file = new FileInputStream(filenm);

            //in File handing
        }
        catch(FileNotFoundException e){
            System.out.println("Not found");

        }catch(IOException e){ 

            System.out.println(e.toString());

        }catch(InputMismatchException e){} 
        
        //{} means that exception is ignored--do nothing--- | is or that handles both exp.  

        catch(Exception e){
            
            System.out.println(e.toString());
             
        }finally{
            // fianlly is executed in all cases 

            System.out.println("THE END");
        }
    }

    public static int getage(){
        try{
            return inp.nextInt();

        }catch( InputMismatchException e){
            System.out.println(e.toString());
            
            System.out.println("thats not ggod");

            return -1;  
        }
    }

    public static void divbyzero (int a){
        try{
            System.out.println(a/0);
        }catch(ArithmeticException e){
            System.out.println("Cant do that");
            
            //System.out.println(e.getMessage());            
            // System.out.println(e.toString());

            e.printStackTrace();    // complete stack in details
        }
    }
}