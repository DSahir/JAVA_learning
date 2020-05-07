
//Relational operators n switch statement
public class tut3 {
    public static void main(String[] args){
        int rand = (int)(Math.random() * 50);

        if (rand < 25){
            System.out.println("No is less than 25");

        }
        else if(rand > 40){
        System.out.println("No is more than 40");
        }
        else if( rand == 18){
            System.out.println("No. is 18");
        }
        System.out.println("Rand num is " + rand);

        // Ternary oper:
        int var= 33;
        int big = (rand >= var) ? rand : var ;
        System.out.println("MAX IS  " + big);

        // SWITCH STATEMENT

        char grade = 'b';
        switch(grade){
            case 'a':       //this is to neglect capital n small
            case 'A':
               System.out.print("Great");
                break;
            case 'b':
            case 'B':
                System.out.print("GOOD");
                break;
            default :
                System.out.print("Defaulter");
        }

    }

}

/* ! -- NOT for boolean
    &&---short circuit      &---no short circuit 
    ||                      |
    ^ -- XOR
*/