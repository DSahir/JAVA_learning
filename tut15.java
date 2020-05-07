
public class tut15 {
    public static void main(String[] args) {
        tut15Vehicle car= new tut15Vehicle(4, 80);
        System.out.println("Speed  max " + car.getspeed());
        System.out.println("Wheel max " + car.getWheel());
        
        car.setCarStrong(50);
        System.out.println(car.getStrong());

    }


}