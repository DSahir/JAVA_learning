import java.util.Arrays;

//import jdk.nashorn.internal.parser.TokenStream;
public class tut9 {
    public static void main(String[] arg){
        
        //size is must ---array is an object
        int[] arr;
        arr = new int[10];

        float[] arr2 = new float[5];

        //adding values

        arr[1] = 2;
        // declare w/o size
        String[] strarr = {"hi","in","arr"};

        // array elt using loops

        for(int i =0 ; i < arr.length; i++){
            arr[i] = i;
        }

        int k=1;
        while(k<50){System.out.print("-");k++;}
        System.out.println();

        for(int i =0 ; i < arr.length; i++){
            System.out.print("| "+ arr[i] + " ");
        }
        System.out.println("|");

        k=1;
        while(k<50){System.out.print("-");k++;}
        System.out.println();

        //multi dim array
        
        String[][] A = new String[5][10];
        
        for (int i = 0; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                A[i][j] = i + " " +j ;
                System.out.print("| " + A[i][j] + " ");
            }
            System.out.print(" |");
            System.out.println();
        }
        k=1;
        while(k<50){System.out.print("-");k++;}
        System.out.println();

        //Another way
        //for(datatype[] varForRow : arrName)
        for (String[] Rw : A){
            //for(datatype-- not a array varForCol : varForRow)
            for(String col : Rw){
                System.out.print("| " + col +" ");

            }
            System.out.println(" |");
        }
        //Arrays.copyOf
        //Arrays.copyOfRange
        //Arrays.fill
        //Arrays.toString
        //Arrays.sort
        //Arrays.binarySearch
        int[] num = Arrays.copyOf(arr, 5);//copy first 5 elts from Array arr to num
        for(int R : num){
            System.out.print("  "+R+ "\n");
        }

        int[] num2 = Arrays.copyOfRange(arr, 3, 9);
        for(int R : num2){
            System.out.print("  "+R);
        }
        System.out.println(Arrays.toString(num) + "\n ");
        int[] moreN = new int [7];
        Arrays.fill(moreN , 0);
        System.out.println(Arrays.toString(moreN));
        //fill in multi dim

        char[][] mat = new char [3][3];
        for(char[] row : mat){
            Arrays.fill(row , '@');
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.binarySearch(arr, 0));
        //returns the index of searched no ....negative value if not found
    }
}