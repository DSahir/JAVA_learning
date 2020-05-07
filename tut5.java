import java.util.Scanner;
public class tut5 {
    
    static double gpi = 3.1415;         //This is a class variable
     static int rand;
     static Scanner inp = new Scanner(System.in);
    public static void main(final String[] args) {
        // accessModifier static RETtype methodname(parameters)
        // static for execute method that isnt part of class defination
        add(4, 5);
        System.out.println(getrandnum());
        while(guessnum() != -1){
            
        }

    }
    public static int getrandnum(){
        rand = (int)(Math.random() * 50);
        return rand;
    }

    public static int add(final int a, final int b) {
        final double lpi = 3.14; // local pi
        System.out.println(lpi);
        System.out.println(gpi); 
        final double gpi = 4.455;
        System.out.println(gpi); // local gpi ---by overwitting global
        return 1;
    }
    public static int guessnum(){
        System.out.println("Check for no.");
        int g = inp.nextInt();
        if(g == rand){
            return -1;
        }
        else{
            return 0;
        }
    }
}