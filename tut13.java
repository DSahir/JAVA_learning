import java.util.Arrays;
public class tut13 {
    public static void main(String[] args){
        String str = "Hi , there you .";
        String strNew = "Escape\\ char\bacter\"s.";
        System.out.println(str + " " +strNew);

        int num = 2;

        String uppCase = "BIG";
        String lowCase = "big";

        if(uppCase.equals(lowCase)){
            System.out.println("They are equal."); // not equal 

        }
        if(uppCase.equalsIgnoreCase(lowCase)){
            System.out.println("They are nonCasely equal."); // not equal 
            
        }

        //Indexing
        //str.charAt()
        //.contains
        //.length()
        //.endsWith("abc")
        //.startsWith("xyz")
        //indexOf("cd")---returns c is at index 5
        //.indexOf(search ,Startfrom ) --INCLUDES STARTINDEX
        //str.compareTo(strNew)----like strcmp---negative(stR< strNew)

        String D = "Dhanashri";
        System.out.println(D.indexOf('s' , 4));

        System.out.println(D.lastIndexOf('a')); //same aas abv
       
        System.out.println(D.replace( "shri" , "u"));
    
        //Split in an array  -- string array -- char array(DArr)
        //Directly same by D.toCharArray()
        String[] DArr  = D.split("");
        System.out.println(Arrays.toString(DArr));  
        System.out.println(D.substring(1 , 4)); // substring(begin index ,endindex{excluded})
        System.out.println(D.lastIndexOf('a')); //gives index of very last occurence
        
        //toUpperCase----toLowerCase
        //str.trim()----trims white space from start and end not in betn

        //STRING BUILDERS BECAUSE---string is immutable i.e every change made creates a new string , so strbuilder makes changes to same sring i.e mutable
        StringBuilder strB = new StringBuilder("A random value");
        System.out.println(strB.append(" again."));
        System.out.println(strB.delete(3 , 11)); //(from index , to index{EXCLUDED})
        System.out.println(strB.capacity());//how much total space in memory
        strB.ensureCapacity(60);    //gaurantee at least 60 ---increases capacity
        System.out.println(strB.capacity());
        System.out.println(strB.length());
        strB.trimToSize();
        //REDUCES CAPACITY TO ITS LENGTH
        System.out.println(strB.capacity()); 
        System.out.println(strB.insert(1 , "nother"));
        String oldSB = strB.toString();
        //CONVERT STRING BUILSER TO STRING

        //THIS FUNC ARE SAME FOR STRING N STRINGN BUILDER
        //charAt
        //indexOf()
        //lastIndexOf
        //subString()

        
        
        




    }

}