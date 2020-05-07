import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class tut8game {
    public static void main(String[] args) {
        //calls method is called
        tut8.buildBoard();

        //char[][] tempBoard = new char[7][7];
        
        //ObjNmae[] ArrayName = new ObjName[4];----four mOnsters

        tut8[] MonArr = new tut8[4];   //four times constructor is called
       
        //tut8(hlth , ack , mv ,name) -- constructer

        MonArr[0] = new tut8(1000 , 20 , 1 ,"Lolo");
        MonArr[1] = new tut8(2000 , 40 , 2 ,"Om");
        MonArr[2] = new tut8(500 , 20 , 1 ,"Tanu");
        MonArr[3] = new tut8(1000 , 30 , 1 ,"Dhanu");
        
        //drawing with monsters

        tut8.draw() ;
    }

    //move Mons arnd
    for(tut8 m : MonArr){
        if(m.getalv()){
            int arrItemIndex = ArrayUtils.indexOf(MonArr , m);
            m.moveMon(MonArr , arrItemIndex);

        }
    }
    
}