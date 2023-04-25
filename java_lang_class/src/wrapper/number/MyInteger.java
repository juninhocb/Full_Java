package wrapper.number;

public class MyInteger {

    public static void runMe() {
        Integer myint =  10;
        int myint2 = 150;
        int myint3 = 1500;
        int myint4 = 150000;
        int myint5 = 10;
        long mylong = 10;
        Long mylong2 = 10L;
        System.out.println(" (base 2 complement) Int count: " +
                "\n 10: "+ Integer.bitCount(myint) +
                "\n 150: " + Integer.bitCount(myint2) +
                "\n 1500: "+ Integer.bitCount(myint3) +
                "\n 15000: " + Integer.bitCount(myint4));

        System.out.println("Comparison between 10 (Unboxed) and 10 (Boxed): " + Integer.compare(myint5, myint)); //0
        System.out.println("Comparison between 150 (Unboxed) and 10 (Unboxed): " + Integer.compare(myint2, myint5)); //1
        System.out.println("Comparison between 150 (Unboxed) and 1500 (Unboxed): " + Integer.compare(myint2, myint3)); // -1
        System.out.println("Converting: " + Integer.decode("1"));
        try{
            System.out.println("Converting: " + Integer.decode("a1")); //java.lang.NumberFormatException
        } catch (Exception ex){
            System.out.println("Get exception: " + ex.getMessage() + " " + ex.getClass());
        }
        System.out.println("Comparison between 10 (Box) and 10 (Unboxed): " + myint.equals(myint5)); // box first, true
        System.out.println("Comparison between 10 (Box) and 10 (Unboxed): " + myint.equals(mylong)); // box first, false
        System.out.println("Comparison between 10 (Box) and 10 (Unboxed): " + myint.equals(mylong2)); //false

    }


}
