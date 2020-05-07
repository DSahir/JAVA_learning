
public class tut14Animals {


    private String name = "Animal";
    //Only axcess to Animal class itself
    public String favfood = "Food";
    //whole world has access
    //protected 
    //Subclass {copy of superclass Animals} has access 
    
    //Subclass can have same name methods but different
    //USing fianl --abv case-- cannot be changed by subclasses
    protected final void chngName(String x){
        this.name = x;
    }

    protected final String getName(){
        return this.name ;
    }
    
    public void eat(){
        System.out.println("yum " + this.favfood);
    }

    public void walk(){
        System.out.println(this.name +" walks");
    }

    // constructer

    public tut14Animals(){

    }
    public tut14Animals(String n , String f){
        this.chngName(n);
        this.favfood = f;
    }



}

