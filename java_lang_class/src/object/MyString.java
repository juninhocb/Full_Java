package object;

/**
 * Class for execute tests within the String Class.
 *
 */
public class MyString {

    /**
     * Static method that will be called by entry point (main) to execute tests.
     *
     */
    public void runMe() {
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




    }

    public class MyOtherString {

    }

}
