
public class tut17 {
    public static void main(String[] args) {
        Thread var = new tut17GetTime();
        Runnable var2 = new tut17GetMail(6);
        
        Runnable var3 = new tut17GetMail(4);
        
        Runnable var4 = new tut17GetMail(6);
        var.start();
        new Thread(var2).start();
        new Thread(var4).start();
        new Thread(var3).start();
        //the order doesnt matter
    }
}