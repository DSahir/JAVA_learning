//here we implimant the interface

public class tut15Vehicle extends tut15Crash implements tut15Drivable , Cloneable{
    //can define new fields / methods
    //RULE: MUST DEFINE ALL THAT IS IN INTERFACE

    int noWheel = 2;
    double speed = 0;
    int carStrength = 0;


    //ALL METHODS IN INTERFACE ARE PUBLIC BY DEFAULT
    public int getWheel(){
        return this.noWheel;
    }

    public void setWheel(int num){
        this.noWheel = num;
    }
    public double getspeed(){
        return this.speed;
    }
    public void setspeed(double x){
        this.speed = x;
    }

    //  constr\
    public tut15Vehicle(){}

    public tut15Vehicle(int w , double s){
        this.noWheel = w;
        this.speed = s;

    }

    //implement abstact methods
    public void setCarStrong(int strong){
        this.carStrength = strong;
    }
    public int getStrong(){
        return   this.carStrength;
    }
public Object clone(){
    tut15Vehicle x;
    try{
        x = (tut15Vehicle)super.clone();
    }
    //WHY SUPER?? 
    catch(CloneNotSupportedException e){
        return null;
    }
    return x;
}

}