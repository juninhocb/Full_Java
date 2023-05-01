import events.TimerTests;
import object.MyString;
import wrapper.number.MyByte;
import wrapper.number.MyInteger;
import wrapper.number.MyShort;
import object.MyObject;
import object.*;
import generics.Tests;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException, IOException {

        /**
         * Java Class
         * Provides classes that are fundamental to the design of the Java programming language.
         * The most important classes are Object, which is the root of the class hierarchy, and Class, instances of which represent classes at run time.
         * Frequently it is necessary to represent a value of primitive type as if it were an object.
         *
         * The wrapper classes Boolean, Character, Integer, Long, Float, and Double serve this purpose.
         * An object of type Double, for example, contains a field whose type is double,
         * representing that value in such a way that a reference to it can be stored in a variable of reference type.
         * These classes also provide a number of methods for converting among primitive values,
         * as well as supporting such standard methods as equals and hashCode.
         * The Void class is a non-instantiable class that holds a reference to a Class object representing the type void.
         *
         * The class Math provides commonly used mathematical functions such as sine, cosine, and square root.
         * The classes String, StringBuffer, and StringBuilder similarly provide commonly used operations on character strings.
         *
         * Classes ClassLoader, Process, ProcessBuilder, Runtime, SecurityManager, and System
         * provide "system operations" that manage the dynamic loading of classes, creation of external processes,
         * host environment inquiries such as the time of day, and enforcement of security policies.
         *
         * Class Throwable encompasses objects that may be thrown by the throw statement. Subclasses of Throwable represent errors and exceptions.
         *
         * https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html
         *
         */

        //MethodsRetriever.printMethodsOfThisClass(new Object());
        //MyBoolean.runMe();
        //MyByte.runMe();
        //MyShort.runMe();
        //MyInteger.runMe();
        //MyObject.runMe();
        //MyString.runMe();
        //MyString mString = new MyString();
        //mString.runMe();
        //MyChar.runMe();
        /*
        Tests mInstTest = new Tests();
        mInstTest.runMe();*/
        TimerTests timerTests = new TimerTests();
        timerTests.runMe();


    }

}