
//Cats class inherits all methods/features of animals class
public class tut14Cats extends tut14Animals{
    //add new field to cats

    public String favToy = "yoyo";
    public void play(){
        System.out.println(" <3 "+ this.favToy);
    }
    // overwrite walk becouse final is not written
    public void walk(){
        System.out.println(this.getName() +" stalks");
    }
    public String gettoy(){
        return this.favToy;
    }
    //COnstr
    public tut14Cats(){

    }
    public tut14Cats(String name , String food , String toy){
        //this.chngName(name);
        //this.favfood  = food;
        //ATTERANTE IS: super class figures out 
        super (name , food);
        //but favToy is added feild so handled here
        this.favToy = toy;
    }

}