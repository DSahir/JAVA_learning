//ABTRACT CLASS WHENEVER EVERY MOTHOD ISNT COMPULSASY EXECUTED 
public abstract class tut15Crash {

    //var/ feild not forced to const
    boolean canDrive = true; 
    public void youCrashed(){
        this.canDrive = false;
    }
    // can create abstact classees
    //since its interface "abstract " is necesary
    public abstract void setCarStrong(int strong);
    public abstract int getStrong();

}