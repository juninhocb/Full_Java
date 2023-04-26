package object;

import java.awt.*;
import java.io.PrintStream;

public class MyString {

    public static void runMe() {
        String mString = "Hello World!";
        String mOtherstring = "Palmeiras Campe\u00E3o";
        System.out.println(String.format("Using scape: \"My scape with %s\"", mString));
        System.out.println("The secret password is on: C:\\Users\\Secret\\password.txt");
        System.out.println("Using unicode to represent character: " + mOtherstring);
        System.out.println("Using methods from string directly: " + "testMeCounting".length());
        // the above line means that "whatever" is a String Class itself, the same not occurs with primitives




    }

}
