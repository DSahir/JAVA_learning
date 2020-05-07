import java.util.ArrayList;
import java.util.Arrays ;
import java.util.Iterator ;
public class tut11 {

    
    public static void main(String[] args){

        ArrayList arrone;
        arrone = new ArrayList();
        //NO size needed 10 mostly ---by default any type of eltts

        ArrayList arrtwo = new ArrayList();
        
        //say arr of string ----STRING not STRINGS
        ArrayList<String>  myNames = new ArrayList<String>();
        //add func
        myNames.add("om");
        myNames.add("TAnu");
        myNames.add("Dhanu");

        myNames.add(2 , "LOLO");    //add at an index

        //get(index) method to retrive names/elts
        //size to get size of array list
        for(int i= 0; i< myNames.size();i++ ){
            System.out.println(myNames.get(i));
        }

        //replace a value using set()
        myNames.set(0, "John");
        
        System.out.println(myNames);      //printing is easy

        //remove(index) items ---also removeRange(from(excluding) , to)
        myNames.remove(2);

        for(String i : myNames){    //datatype of arrayList
            System.out.println(i);
        }
        //myNames.removeRange(0,1);

        //creater iterator obj
        Iterator individual = myNames.iterator(); 
        
        //iterator value obj
        while(individual.hasNext()){
            System.out.println(individual.next());
        }

        /*copy arrList---addAll is the func
        clear it
        contains--any elt
        containsAll --sublist
        isEmpty
        */
        //list w/o any type be arrtwo;

        arrtwo.addAll(myNames);
        String Radhu = "Radhika";

        myNames.add(Radhu);
        if (myNames.contains(Radhu)){
            System.out.println("Yes radhu in here.");
        }
        //mainlst.containsAll(sublist)
        if(myNames.containsAll(arrtwo)){
            System.out.println("  ALl ARRTWO.(sublist) from myName(main LIst)");
        }   
        arrtwo.clear();
        if(arrtwo.isEmpty()){
            System.out.println("arrtwo is empty");
        }

        // Convert an arraylist to an array
        //here type of arr was unknown , so Object
        Object[] notArrList = new Object[4];
        notArrList = myNames.toArray();
        System.out.println(Arrays.toString(notArrList));

    }

}