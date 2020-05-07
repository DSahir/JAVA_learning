
public class tut16 {
    public static void main(String[] args) {
        //object class : defn - all obj inherits every method of class 
        Object audi = new tut15Vehicle();

        //audi as of type Obj--inherit all obj methods ---but cant access vehicle methods
        //so , typecasting

        System.out.println(((tut15Vehicle)audi).getspeed());
        tut15Vehicle truck = new tut15Vehicle();

        // built in equals method
        System.out.println(audi.equals(truck));
        //each obj has unique identifier{hash code}
        System.out.println(audi.hashCode());
        System.out.println(truck.hashCode());
        //fianlise -- obj cleaning by java garabage collection when no longer needed in mem
        System.out.println(audi.getClass());  
        //  samrt tho audi was "Object"
        System.out.println(audi.getClass().getName());
        //only anme of class  
        if(audi.getClass() == truck.getClass()){
            System.out.println("SAME");
        }

        System.out.println(audi.getClass().getSuperclass());
        System.out.println(audi.toString());
        //toString can  also be overwritten---so that audi.toSrting is diff from Integer.toString()

        //CLONING -- LIKE COPYING BUT HAS DIFF HASH I.E AARE DIFF  
        //set vehicle class to clonable
        truck.setWheel(7);
        tut15Vehicle truck2 = (tut15Vehicle)truck.clone();
        System.out.println(truck.getWheel());
        System.out.println(truck2.getWheel());
        System.out.println(truck.hashCode());
        System.out.println(truck2.hashCode());
        
        
        /*obj a
           subobj b
           
           then you dont copy / clone subobj b */
        

    
    
    }

}