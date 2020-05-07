import java.util.regex.*;

public class tut19 {
    public static void main(String[] args) {
        
        String longStr = " Om Ahit uA 12345 RA (432)555-6676 dsahir@gmail.com 432-555-6789 432 555-6789" ;
        String strange = "1Z aaa ** **** {{{ {{ { "; 
        
        regCheck("\\s[A-Za-z]{2,20}\\s" , strange);
        System.out.println("=====================");
        /*  [A-Za-z] [0 -9] -- any char you want
            [^A-G] -- not from A - G 
            \\s --- ehite space
            \\S -- not white sapce
            {n,m}---{minimun , maximum}
            {n,} --- from n to unbound
        */

        //2 - 20 length of word - A-Z && a-z
        //[A-Za-z]{2,20}   
        // \\w{2,20} ---"w" for any character s.t [A-Za-z0-9_]
        //\\W --ISNT IN W
        
        regCheck("\\s\\d{5}", longStr);
        System.out.println("=====================");
        
        /* \\d -- digit or num.
            \\D -- non digit or num
            {5} -- 5 number of times
        */

        // zip code -5 digit long

        regCheck("R\\w|u[A-Z]", longStr);
        System.out.println("=====================");
        
        //2 leter word starts with u or R
        //K[A-Za-z] ---or symbol |---C\\w
         
        regCheck("\\{{3,}", strange);
        regCheck("\\{+", strange);
        System.out.println("=====================");
        
        //+ --- 1 or more of preceedin
        //  ^ + * ? {} [ ] \ | () -- need back slash
        
        regCheck(".{3}", strange);
        System.out.println("=====================");
        
        // . --- anything(charac) 
        //.{3} -- 3 of them 

        regCheck("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longStr);
        System.out.println("=====================");
        
        //checking for email
        
        //( abcd)? -- / for whethrer or not present
        //1-(123)333-4444   (123)333-4444   123-333-4444 132 333-4444
        regCheck("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longStr);
        System.out.println("=====================");

        regReplace(longStr);
    }
        public static void regCheck(String reg , String str) {
            Pattern var = Pattern.compile(reg);

            Matcher matches = var.matcher(str);
            while (matches.find()){
                if(matches.group().length() != 0 ){
                    System.out.println(matches.group().trim());
                }

                System.out.println("Sstart index " + matches.start());
                System.out.println("End index " + matches.end() + "\n");
            }
        }

    public static void regReplace(String x) {

        //Pattern rep = Pattern.compile("[A-Z]" , Pattern.CASE_INSENSITIVE)
        Pattern rep = Pattern.compile("\\s+");
        Matcher matches = rep.matcher(x.trim());
        System.out.println(matches.replaceAll(", "));

    }


    
}