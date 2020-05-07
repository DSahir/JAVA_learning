//Create a game board --using multi dim arrays

import java.util.Arrays;

public class tut8 { 

    static char [][] board = new char[7][7];

    public static void buildBoard(){
        for(char[] row : board){
            Arrays.fill(row , '*');
        }
    }
    public static void draw() {
        int k =1;
        while(k <= 30 ){System.out.print("-");k++;}
        System.out.println();
        for(int i = 0 ; i < board.length; i++){
             for(int j = 0 ; j < board[i].length; j++){
                System.out.print("|" + board[i][j] + "|");
            }
        System.out.println();
        }

        k =1;
        while(k <= 30 ){System.out.print("-");k++;}
        System.out.println();
    }

    public void moveMon(tut8[] mons , int arrayItemIndex){
        boolean isSpaceOpen = true;
        int maxXSpace = board.length - 1;
        int maxYSpace = board[1].length -1;
        while(isSpaceOpen){
            int randMvDirection = (int)(Math.random()*4);
            int randMvDistance = (int)(Math.random() * (this.getmv()));

            System.out.print(randMvDistance +" " + randMvDirection);
            board[this.xp][this.yp] = '*';
            if(randMvDirection == 0){
                if ((this.yp - randMvDistance) < 0){
                    this.yp = 0;
                }else{
                    this.yp = this.yp - randMvDistance;
                }
            }else if(randMvDirection == 1){
                if ((this.xp + randMvDistance) > maxXSpace){
                    this.xp = maxXSpace;
                }else{
                    this.xp = this.xp + randMvDistance;
                }
            }else if(randMvDirection == 2){
                if ((this.yp + randMvDistance) > maxYSpace){
                    this.yp = maxYSpace ;
                }else{
                    this.yp = this.yp + randMvDistance;
                }
            }else {
                if ((this.xp - randMvDistance) < 0){
                    this.xp = 0;
                }else{
                    this.xp = this.xp - randMvDistance;
                }
            }
            for(int i = 0 ; i <mons.length; i++){
                //eg for  lolo
                if(i == arrayItemIndex){
                    continue;

                }
                if(onMySpace(mons , i , arrayItemIndex)){
                    isSpaceOpen =true;
                    break;

                }else{
                    isSpaceOpen = false;
                }
            }
        }
    

        board[this.yp][this.xp] = this.first; 
    }

    public boolean onMySpace(tut8[] mons , int indexToCheck1 , int indexToCheck2){
        if((mons[indexToCheck1].xp == mons[indexToCheck2].xp) && (mons[ indexToCheck1].yp == mons[indexToCheck2].yp)){
            return true;
        }else{
            return false;
        }
    }

    public final String Tomb = "Heres a dead monster";

    //class vari == field----only obj can chnge value of private var
    private int hlth = 500;
    private int ack = 20;
    private int mv = 2;
    private boolean alv = true;

    //few public
    public String name ="Bongo";
    public int xp = 0 , yp = 0 ;
    public char first;   
    public int noMons = 0;

    public int getack(){
        return ack;
    }
        
    public int getmv(){
        return mv;
    }
    public int gethlth(){
        return hlth;
    }
    public boolean getalv(){
        return alv;
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

    public tut8( int hlth , int ack ,int mv , String name){
        //same name of constructor as class--its bluprint
        this.hlth = hlth;
        this.ack = ack;
        this.mv = mv;
        this.name = name;

        int maxXSpace = board.length - 1;
        int maxYSpace = board[0].length - 1;
        int randX , randY;

        do{
            randX = (int)(Math.random()*maxXSpace);
            randY = (int)(Math.random() * maxYSpace);
        }while(board[randX][randY] != '*');

        this.xp = randX;
        this.yp = randY;
        this.first = this.name.charAt(0);
        board[this.xp][this.yp] = this.first;
        noMons++;


        //no return 
    }
    public tut8(){
        noMons ++;
    }

}