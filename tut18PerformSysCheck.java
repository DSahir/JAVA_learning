import java.util.concurrent.locks.ReentrantLock ;
//this lib protects from locks when 2 diff threds call simuntaneously 

public class tut18PerformSysCheck implements Runnable {

    private String check;

    ReentrantLock keylock = new ReentrantLock();

    public tut18PerformSysCheck(String x){
        this.check = x;

    }
    // protect run methods from accessing by 2 diff threads at same time
    //snyc --during one thread no other thread can access
    //but slows down java
    //synchronized public void run(){}

    //ALTERNATE

    public void run(){
        keylock.lock();
        System.out.println("Checking" + this.check);

        keylock.unlock();
    }

}