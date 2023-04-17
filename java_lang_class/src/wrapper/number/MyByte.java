package wrapper.number;

import utils.MethodsRetriever;

public class MyByte {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     * Once Java do not support method to retrieve data usage such sizeOf (of C), we can estimate it
     * The values for usage can vary spending of the situation and JVM configuration
     *
     */
    public static void runMe(){


        Byte myByte = 127; // 8 Bytes on stack (reference), 1 Byte for byte primitive + 7 Bytes for padding = 16 Bytes usage
        byte myPrimByte = 15; // 1 Byte
        Byte myOtherByte = new Byte("3"); //Byte constructors allows it

        //Byte myByte2 = new Byte("test"); //java.lang.NumberFormatException

        MethodsRetriever.printMethodsOfThisClass(myByte);

        // Some methods are like Boolean. See Boolean.
        System.out.println("Byte hashCode: " + myByte.hashCode());
        System.out.println("Byte value: " + myByte.byteValue()); //return primitive
        System.out.println("Int value: " + myByte.intValue()); //return int primitive the same for others
        System.out.println("Value of byte: " + Byte.valueOf("127")); //throws java.lang.NumberFormatException
        System.out.println("Decoding byte: " + Byte.decode("2")); // this method analise range, throw with message
        System.out.println("To unsigned int: " + Byte.toUnsignedInt( (byte) -15)); //takes primitive value | result is: 241
        System.out.println("To unsigned long: " + Byte.toUnsignedLong(myPrimByte)); // 15

        // Constants
        String string = "\nMax Byte: " + Byte.MAX_VALUE +
                "\nMin Byte: " + Byte.MIN_VALUE +
                "\nType: " + Byte.TYPE +
                "\nSize: " + Byte.SIZE +
                "\nBytes usage: " + Byte.BYTES;

        System.out.println("\nInformation about constants " + string);

    }

}
