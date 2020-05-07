
public class tut7 { 

    public final String Tomb = "Heres a dead monster";

    //class vari == field----only obj can chnge value of private var
    private int hlth = 500;
    private int ack = 20;
    private int mv = 2;
    private int xp = 0 , yp = 0 ;
    private boolean alv = true;

    //few public
    public String name ="Bongo";

    public int getack(){
        return ack;
    }
        
    public int getmv(){
        return mv;
    }
    public int gethlth(){
        return hlth;
    }
    public void sethlth(int a){
        hlth = hlth - a;
        if(hlth < 0){
            alv = false;
        }
    }
    //method overloading both int n double are handles--only argu are diff compulsary
    public void sethlth(double a){
        int inta = (int) a;
        hlth = hlth - inta;
        if(hlth < 0){
            alv = false;
        }
    }
    // constructor is the first func called whenever new obj of class is created
    //executed once n never agn

    public tut7( int newhlth , int newack ,int newmv){
        //same name of constructor as class--its bluprint
        hlth = newhlth;
        ack = newack;
        mv = newmv;

        //no return 
    }

    /*  BETTER WAY
        public void tut7( int hlth , int ack ,int mv){
        //same name of constructor as class--its bluprint
        this.hlth = newhlth;    ----refer to private hlth var
        this.ack = newack;
        this.mv = newmv
    }
    */
    // constructor overloading ---This is the defalt const.--if any other is not created.
    public tut7(){

    }
    public tut7(int newhlth){
        hlth = newhlth;
    }
    //below one calls above const.
    public tut7( int newhlth , int newack) {
        this(newhlth);
        // this keyword calls abv as const. overloading --"this" refers to the constructers of class
        ack = newack;
     
    }
    public static void main(String[] args) {

        tut7 frank = new tut7();    //called the constructer file.
        System.out.println(frank.ack);
    
        // it is inside of the class tut7--the private var ack.
        
    }
}