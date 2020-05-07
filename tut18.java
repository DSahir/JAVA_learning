//pre defined times scheduled
import java.util.concurrent.ScheduledThreadPoolExecutor;
//mport java.util.concurrent.TimeUnit;
//throw all threads in pool then use
import java.util.concurrent.TimeUnit;
public class tut18 {

    public static void main(String[] args) {
        addThreadtoPool();
    }

    //allows 
    public static void addThreadtoPool(){
        ScheduledThreadPoolExecutor evtPool = new ScheduledThreadPoolExecutor(5);
        
        evtPool.scheduleAtFixedRate(new tut18CheckSysTime(), 0, 2, TimeUnit.SECONDS);
        evtPool.scheduleAtFixedRate(new tut18PerformSysCheck("MAIL"), 5, 5, TimeUnit.SECONDS);
        evtPool.scheduleAtFixedRate(new tut18PerformSysCheck("CALENDER"), 1, 8, TimeUnit.SECONDS);
    
        System.out.println("no. of active threads " + Thread.activeCount());
        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads);
        
        //threadName.setPriority to set priority;---
        //10 is of highest priority
        listOfThreads[2].setPriority(8);
        
        for(Thread i : listOfThreads){
            System.out.println(i.getName());

        }
        for(Thread i : listOfThreads){
            System.out.println(i.getPriority());
        }
        
       
        //shut all threads
        evtPool.shutdown();

         //dotn want thread to run 
        try{
            Thread.sleep(3000);

        }catch(InterruptedException e){

        }
        
        

    }

}