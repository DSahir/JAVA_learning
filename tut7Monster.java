
public class tut7Monster {
    public static void main(String[] args){
        tut7 lolo = new tut7();
        System.out.println(lolo.name);
        //System.out.println(lolo.ack); ---err thrown --as ack is private ,so cant be accessed from other class
        lolo.name  = "LOLO";
        System.out.println(lolo.name +" is acked to " + lolo.getack());

        //we need a public fun to access the private var
    }
}