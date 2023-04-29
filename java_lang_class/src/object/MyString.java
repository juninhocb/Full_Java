package object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;

/**
 * Class for execute tests within the String Class.
 *
 */
public class MyString {

    /**
     * Static method that will be called by entry point (main) to execute tests.
     *
     */
    public void runMe() throws IOException {
        //String objects are stored in a special memory area known as the "string constant pool".
        //Important: Class String has different methods of Object String itself. Like Format,Join and Others....
        String mString = "Hello World!";
        String mOtherstring = "Palmeiras Campe\u00E3o";
        System.out.println(String.format("Using scape: \"My scape with %s\"", mString));
        System.out.println("The secret password is on: C:\\Users\\Secret\\password.txt");
        System.out.println("Using unicode to represent character: " + mOtherstring);
        System.out.println("Using methods from string directly: " + "testMeCounting".length());
        // the above line means that "whatever" is a String Class itself, the same not occurs with primitives

        Object obj = new String("teste");

        String var1 =  obj.toString();
        String var2 = obj.toString();

        System.out.println(String.format("var1 %s | var2 %s", var1, var2));

        MyOtherString mOther = new MyOtherString();
        System.out.println("All up: " + mString.toUpperCase());
        System.out.println("All down: " + mString.toLowerCase());
        System.out.println("Get world: " + mString.substring(6,11));
        System.out.println("Another way to get World: " + mString.split(" ")[1].replace("!", ""));

        float mFloat = 2.2345207F;
        float mOtherFloat = 2.1F;
        System.out.println("My float print: " + mFloat);
        System.out.println(String.format("My float print again: %.2f", mFloat));
        NumberFormat formatter = NumberFormat.getInstance(); //default is 3 numbers after dot (.)
        NumberFormat formatter2 = NumberFormat.getInstance();
        System.out.println(formatter);
        System.out.println(formatter2); //singleton pattern
        MyOtherString mOther2 = new MyOtherString();
        System.out.println(mOther2);
        System.out.println(mOther);
        formatter.setMinimumFractionDigits(1);
        formatter.setMaximumFractionDigits(2);
        System.out.println("Float formatted again: " + formatter.format(mFloat));
        NumberFormat formatter3 = NumberFormat.getInstance();
        System.out.println("Format float within formatter3: " + formatter3.format(mFloat));
        System.out.println(formatter3.equals(formatter2)); //true, but using formatter 3 has a different result
        System.out.println(formatter.getMaximumFractionDigits()); //2
        System.out.println(formatter3.getMaximumFractionDigits()); //3, once this is the same object, is difficult to understand
        //myReader();
        //proving that String are array of characters
        char[] listChars = {'h', 'e', 'l', 'l', 'o'};
        String myStrFromChars = new String(listChars);
        System.out.println("Print: " + myStrFromChars);
        //taking element
        char mChar = myStrFromChars.charAt(1);
        System.out.println(mChar); //e
        //creating literal string
        String a = "Welcome";
        String b = "Wilkome";
        String c = "Welcome"; //just ref, Java use string pool and does not instance another "String"
        System.out.println("Objects:  " + a + b + c);
        String trimMe = "     Im a problematic String      ";
        System.out.println("original: " + trimMe);
        System.out.println("trim:" + trimMe.trim());

        String s = new String("Origin");//creates two objects and one reference variable
        //In such case, JVM will create a new string object in normal (non-pool) heap memory,
        // and the literal "Origin" will be placed in the string constant pool.
        // The variable s will refer to the object in a heap (non-pool).
        //This is because we use things like StringBuilder and StringBuffer.
        String sCompare = "Origin";
        String sCompare2 = "Origin";
        System.out.println("Comparison below!!! ");
        System.out.println(s == sCompare); //false
        System.out.println(sCompare == sCompare2); //true
        String mText = "I have this text to test the contain value, is it work?";
        String mOtherTeext = "I have this another test to prove the same thing";
        CharSequence findKey = "contain";
        System.out.println("The result for the first String: " + mText.contains(findKey));
        System.out.println("The result for the second String: " + mOtherTeext.contains(findKey));
        String test = "contain";
        System.out.println("Is the same? " + test.equals(findKey)); //true
        String[] clubs = {"Palmeiras", "Chelsea", "Manchester United", "Manchester City"};
        System.out.println("Join string: " + String.join(", ", clubs)); //Palmeiras, Chelsea, Manchester United, Manchester City
        System.out.println("Is emptyString method: " + "".isEmpty() + " " + "asfuhsd".isEmpty()); //true false
        System.out.println("Lets replace: " + "thisClubs".replace("s","w")); //thiwClubw
        System.out.println("This is good to work with extern data: " + test.equalsIgnoreCase("CONTAIN")); //true
        System.out.println("Using intern method: " + test.intern()); //Returns:a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
        //String are immutable in Java:

        String s1 = "MyString";
        String s2 = s1.concat("AnotherString"); //creates another string to pool
        System.out.println("S1: " + s1 + " S2: " + s2);
        System.out.println("Lets check end and start: " + "PalmeirasDDD".startsWith("S") + "PalmeirinhaHehehe".endsWith("hehe")); //false true
        System.out.println("Converting with ValueOf: " + String.valueOf(823492373).replace("8", "letras")); //letras23492373
        StringBuffer sbuff = new StringBuffer();
        sbuff.append("Lets ");
        sbuff.append("Change ");
        sbuff.append("A ");
        sbuff.append("String!");
        System.out.println(sbuff);
        System.out.println("We can also reverse this!!! " + sbuff.reverse());
        StringBuilder sbuilder = new StringBuilder(); //to async tasks, is more speed than buff
        sbuilder.append("Lets ");
        sbuilder.append("Change ");
        sbuilder.append("A ");
        sbuilder.append("String!");
        System.out.println(sbuilder);
        System.out.println("We can also reverse this!!! " + sbuilder.reverse());
        /*
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Time taken with StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
        */
        /**
         * Results
         * Time taken with String: 57717ms
         * Time taken with StringBuffer: 10ms
         * Time taken with StringBuilder: 6ms
         */

        String input = "Palmeiras are always champions! ";
        String[] words = input.split("\\s+");
        for (String word : words){
            System.out.println(word);
        }

    }

    public static String concatWithString()    {
        String t = "Palmeiras";
        for (int i=0; i<100000; i++){
            t = t + "Undeca";
        }
        return t;
    }

    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Palmeiras");
        for (int i=0; i<100000; i++){
            sb.append("Undeca");
        }
        return sb.toString();
    }public static String concatWithStringBuilder(){
        StringBuilder sb = new StringBuilder("Palmeiras");
        for (int i=0; i<100000; i++){
            sb.append("Undeca");
        }
        return sb.toString();
    }

    public static void myReader() throws IOException {
        InputStream b = System.in;
        System.out.println("catch this when i digit 'c': " + b.read());  //99 equals \u0063
        System.out.println("System in type: " + System.in.getClass());  //BufferedReader
        InputStreamReader reader1 = new InputStreamReader(System.in); //read receives input stream type
        //reader1 is still a buffer because has the end "Line feed"
        System.out.println("catch the end file: " +  reader1.read()); //10
        //instead reading line by line
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Reading all lines at once: " + br.readLine());
    }
    public class MyOtherString {

    }

}
