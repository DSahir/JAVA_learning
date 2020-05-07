//JAVA DOESNT ALLOW INHERITANCE
//ABSTRACT CLASSSES / METHODS-- USED TO ADD ADDITIONAL FUNC TO CALSS  INHERITED FROM ANOTHER CLASS
// TO DEFINE INTERFACE
public interface tut15Drivable {
    // anology: --obj : noun :: interfaces : adjectives
    // basically const 


    //no fields in interface but only final 
    double PI = 3.14;
    // methods must be implimanted if they use this interface
    int getWheel();
    //same as public abstact int getWheel()

    void setWheel(int num);
    double getspeed();
    void setspeed(double x);

}