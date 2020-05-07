

//Runnable is a interface
public class tut17GetMail implements Runnable{
    private int srtTime;
    
    
    //constr
    public  tut17GetMail(int srtTime){
        this.srtTime = srtTime;
    }

    public void run(){
        try{
            Thread.sleep(srtTime * 1000);
        }catch(InterruptedException e){}
        System.out.println("Checkin Mail");
    }
}