
public class tut14 {
    public static void main(String[] args){
        tut14Animals genAnimals = new tut14Animals();
        System.out.println(genAnimals.getName());
        System.out.println(genAnimals.favfood);

        tut14Cats lily = new tut14Cats("LILI" , "TUNA" , "BALL");
        System.out.println(lily.favfood);
        System.out.println(lily.getName());
        System.out.println(lily.favToy);

        tut14Animals toby = new tut14Cats("TOBI" , "FISH" , "BAT");

        /*polymorphism :
        animal toby is identified as cat to java
        if walk is in both animal and cat --then cats wala methods is chosen
        but now favToy isnt in aniamls , so java is dumb n dont know / find its also in Cats--thus its err
        OVERCOME
        typecasting aniamls to cat explicitly*/
        
        toby.walk();
        //System.out.println(toby.favToy);       // --err
        tut14Cats temp = (tut14Cats)toby;
        System.out.println(temp.favToy);
        System.out.println(((tut14Cats)toby).favToy);
        
        //IS INSTANCE OF-- HAS ABILITY TO ACCESS FEILDS OF SAME CALSS
        if(toby instanceof tut14Animals){
            System.out.println("IS OF ANIMAL");
        }
        if(toby instanceof tut14Cats){
            System.out.println("IS OF CATS");
        }

    }

}