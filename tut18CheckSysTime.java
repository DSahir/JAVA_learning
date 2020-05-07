//threads--same time other func also run
import java.util.*;
import java.text.DateFormat;
    
public class tut18CheckSysTime implements Runnable{

    public void run(){
        Date rn;
        Locale curLocale;
        DateFormat timeFormat;
        DateFormat dateFormat;
        String timeOP;
        String dateOP;

        
            rn = new Date();
            curLocale = new Locale("ind");

            timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM , curLocale);
            dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM , curLocale);
            
            timeOP = timeFormat.format(rn);
            dateOP = dateFormat.format(rn);
            System.out.println(timeOP);
            System.out.println(dateOP);
            System.out.println();

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}


        }

    


}