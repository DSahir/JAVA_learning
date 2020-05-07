
import java.util.Arrays; 
import java.util.LinkedList;

public class tut12 {
    public static void main(String[] args){
        LinkedList One = new LinkedList();
        LinkedList<String> names = new LinkedList<String>();
        names.add("om");
        names.add("tanu");

        for (String i : names){
            System.out.println(i);
        }

        names.addLast("Ahir");
        names.addFirst("hi");

        for (String i : names){
            System.out.println(i);
        }
        //set(index , "newelt")---to replace
        //get(index)
        //getLast()----retrives the last value
        //remove(elt)--or --- remove(index no)

        names.remove(0);
        names.remove("om");
        for (String i : names){
            System.out.println(i);
        }
        //copy list

        LinkedList<String> newList = new LinkedList<String>(names);

        System.out.println("----"+newList.get(1));

        if(names.contains("Tanu")){
            System.out.println("Its present.");
        }
        if (names.containsAll(newList)){
            System.out.println("All copied");
        }
        //names.indesOf("Ahir")
        //names.isEmpty()
        //names.size()
        //names.clear()
        //names.peek();---
        //names.poll()---same like pop--remove from front
        //names.pollLast()
        //push("__")    pop()

        names.push("HI");
        names.push("HEllo");
        System.out.println(names);
        System.out.println(names.peek());
        
        System.out.println(names);
        System.out.println(names.peekLast());
        
        System.out.println(names);
        System.out.println(names.poll());
        
        System.out.println(names);
        System.out.println(names.pollLast());
        
        System.out.println(names);
        System.out.println(names.pop());
        
        System.out.println(names);
        names.push("Radhu");
        names.push("hi");
        //to array

        Object[] arr = new Object[5];
        arr = names.toArray();
        System.out.println(Arrays.toString(arr));





    }
}