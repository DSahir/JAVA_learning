//threads--same time other func also run
  
import java.util.*;
import java.text.DateFormat;
// ALLOWS TO USE ALL DIFF METHDS THAT COME IN THREAD CLASS
// getTime is Subclass pf thred
public class tut17GetTime extends Thread{
    //ALL THAT THREAD EXECUTES MUST BE UNDER RUN METHOD
    public void run(){
        Date rn;
        Locale curLocale;
        DateFormat timeFormat;
        DateFormat dateFormat;
        String timeOP;
        String dateOP;

        for( int i = 1 ; i <=20 ; i++){
            rn = new Date();
            curLocale = new Locale("ind");

            timeFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT , curLocale);
            dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT , curLocale);
            
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

}