package wrapper;

import com.sun.org.apache.xpath.internal.operations.Bool;
import utils.MethodsRetriever;

public class MyBoolean {

    /**
     * Note
     * Class<Boolean> Represents the Class Boolean itself.
     * It provides methods to access information about the Boolean class,
     * such as its name, superclass, implemented interfaces, constructors, methods, and fields.
     * java.lang.Boolean Represents an instance of Boolean Class
     *
     */
    public static void runMe(){



        Boolean bool = false;  // stack (pointer) -> heap (obj)
        boolean bool2 = false; //primitive directly to stack
        Boolean bool3 = true;
        boolean bool4 = Boolean.TRUE;  //Boolean.TRUE act as primitive but needs to Load the static method of Boolean


        MethodsRetriever.printMethodsOfThisClass(bool);

        /**
         * public boolean java.lang.Boolean.equals(java.lang.Object)
         * equals: compare instance and value
         *
         */
        System.out.println("\nStart equals");
        System.out.println("Compare primitive boolean with Class<Boolean> result is: " + bool.equals(bool2)); //boxing process
        System.out.println("Compare new primitive boolean with Class<Boolean> result is: " + bool.equals(false)); //boxing process
        System.out.println("Compare literal string with Class<Boolean> result is: " + bool.equals("false"));
        System.out.println("End equals \n");

        /**
         * public java.lang.String java.lang.Boolean.toString()
         * public static java.lang.String java.lang.Boolean.toString(boolean)
         * toString: convert Object to String
         *
         */
        System.out.println("Start toString");
        System.out.println("Bool as string: " + bool.toString().getClass()); //Unbox to primitive first
        System.out.println("Bool as string using static method of Class<Boolean> " + Boolean.toString(bool).getClass()); //Unbox 'bool' than process
        System.out.println("Primitive bool as string [1]: " + Boolean.toString(bool2).getClass()); //goes directly
        System.out.println("Primitive bool as string [2]: " + String.valueOf(bool2).getClass()); //box 'bool2' than toString()
        System.out.println("End toString \n");

        /**
         * public static int java.lang.Boolean.hashCode(boolean)
         * public int java.lang.Boolean.hashCode()
         * hashCode: give the equivalent hashCode to the value!
         *
         */
        System.out.println("Start hashCode");
        System.out.println("Hash code from Class<Boolean> is: " + bool.hashCode()); //1237
        System.out.println("Hash code from primitive is: " + Boolean.hashCode(bool2)); // box first, 1237
        System.out.println("Hash code from of true boolean in Java is: " + Boolean.hashCode(true)); //1231
        System.out.println("End hashCode\n");

        /**
         * public int java.lang.Boolean.compareTo(java.lang.Boolean)
         * public int java.lang.Boolean.compareTo(java.lang.Object)
         * possible return -1,0 or 1
         *
         */
        System.out.println("Start compareTo");
        System.out.println("Comparing Class<Boolean> with the same primitive: " + bool.compareTo(false)); // Box primitive first, 0
        System.out.println("Comparing Class<Boolean> false with not the same primitive: " + bool.compareTo(true)); //Box primitive first, -1
        System.out.println("Comparing Class<Boolean> true with not the same primitive: " + bool3.compareTo(false)); //Box primitive first, 1
        System.out.println("Comparing Class<Boolean> taking an object: " + bool.compareTo(new Boolean(bool2))); //Box explicitly first, 0
        System.out.println("End compareTo\n");

        /**
         * public static boolean java.lang.Boolean.getBoolean(java.lang.String)
         * public boolean java.lang.Boolean.booleanValue()
         * Used to catch values from system properties, if true returns true other different result will return false.
         *
         */
        System.setProperty("myapp.debug", "true");
        System.out.println("Start getBoolean");
        System.out.println("System property of myapp debug: " + Boolean.getBoolean("myapp.debug"));
        System.out.println("End getBoolean\n");

        /**
         * public static java.lang.Boolean java.lang.Boolean.valueOf(boolean)
         * public static java.lang.Boolean java.lang.Boolean.valueOf(java.lang.String)
         * convert Class<String> or boolean primitive to Class<Boolean>
         *
         */
        System.out.println("Start valueOf");
        System.out.println("Converting a primitive and print it class. " + Boolean.valueOf(true).getClass());
        System.out.println("Converting a string and print it class. " + Boolean.valueOf("true").getClass());
        System.out.println("Converting a Class<String> and print it class. " + Boolean.valueOf(new String("false")).getClass());
        System.out.println("Converting a Class<String> and print value. " + Boolean.valueOf(new String("blabla"))); //false
        System.out.println("End valueOf\n");


        /**
         * public static int java.lang.Boolean.compare(boolean,boolean)
         * Compare two primitives value and returns an integer.
         * is a part of compareTo method
         *
         */
        System.out.println("Start compare");
        System.out.println("Compare result: " + bool.compare(true, false)); //1
        System.out.println("Compare result: " + bool.compare(false, false)); //0
        System.out.println("Compare result: " + bool.compare(false, true)); // -1
        System.out.println("End valueOf\n");

        /**
         * public static boolean java.lang.Boolean.logicalAnd(boolean,boolean)
         * And Logical with primitives.
         *
         */
        System.out.println("Start logicalAnd");
        System.out.println("Result: " + Boolean.logicalAnd(true, true)); //true
        System.out.println("Result: " + Boolean.logicalAnd(false, true)); //false
        System.out.println("Result: " + Boolean.logicalAnd(false, false)); //false
        System.out.println("End logicalAnd\n");

        /**
         * public static boolean java.lang.Boolean.logicalOr(boolean,boolean)
         * Or Logical with primitives.
         *
         */
        System.out.println("Start logicalOr");
        System.out.println("Result: " + Boolean.logicalOr(true, true)); //true
        System.out.println("Result: " + Boolean.logicalOr(false, true)); //true
        System.out.println("Result: " + Boolean.logicalOr(false, false)); //false
        System.out.println("End logicalOr\n");

        /**
         * public static boolean java.lang.Boolean.logicalXor(boolean,boolean)
         * XOr Logical with primitives.
         *
         */
        System.out.println("Start logicalXor");
        System.out.println("Result: " + Boolean.logicalXor(true, true)); //false
        System.out.println("Result: " + Boolean.logicalXor(false, true)); //true
        System.out.println("Result: " + Boolean.logicalXor(false, false)); //false
        System.out.println("End logicalXor\n");

        System.out.println("Nested logical result: " + Boolean.logicalAnd(Boolean.logicalXor(true, false), Boolean.logicalAnd(true, true))); // (true, true) and true => true

        /**
         * public static boolean java.lang.Boolean.parseBoolean(java.lang.String)
         * parses string to boolean (primitive or Class<Boolean>)
         */
        System.out.println("Parsing string: " + Boolean.parseBoolean("whatever")); //false
        System.out.println("Parsing string: " + Boolean.parseBoolean("true")); //true






    }

}
