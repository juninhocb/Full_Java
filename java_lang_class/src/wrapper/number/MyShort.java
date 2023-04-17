package wrapper.number;

/**
 * Has most of impl like Byte
 *
 */
public class MyShort {
    public static void runMe(){
        // 00000000
        System.out.println("Reversing: " + Short.reverseBytes((short) 4)); // 1024
        // Constants
        String string = "\nMax Short: " + Short.MAX_VALUE +
                "\nMin Short: " + Short.MIN_VALUE +
                "\nType: " + Short.TYPE +
                "\nSize: " + Short.SIZE +
                "\nShort usage: " + Short.BYTES;

        System.out.println("\nInformation about constants " + string);

    }


}
