package wrapper.number;

public class MyInteger {

    public static void runMe() {
        Integer myint =  10;
        int myint2 = 150;
        int myint3 = 1500;
        int myint4 = 150000;
        int myint5 = 10;
        int myint6 = -10;
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

        System.out.println("Get system property: " + Integer.getInteger("teste")); //null because not exists
        System.out.println("Get all properties: " + System.getProperties()); //null because not exists
        System.setProperty("MyProp", "123");
        System.out.println("Get System property: " + Integer.getInteger("MyProp")); // 123, this is useful because set property does not accept integer values directly
        System.out.println("Get the max 1500 x 150: " + Integer.max(myint2, myint3));
        System.out.println("Get the min 1500 x 150: " + Integer.min(myint2, myint3));
        System.out.println("Parsing Int: " + Integer.parseInt("123"));
        System.out.println("Parsing Int base 10: " + Integer.parseInt("123", 10)); //123 decimal
        //System.out.println("Parsing Int base 2: " + Integer.parseInt("123", 2)); //NumberFormatException
        System.out.println("Parsing Int base 10: " + Integer.parseInt("11", 2)); //3 binary representation
        System.out.println("Parsing Int base 16: " + Integer.parseInt("01FFC", 16)); //8188 hexa representation
        System.out.println("Parsing Int base 16: " + Integer.parseInt("FF", 16)); //255 hexa representation
        System.out.println("Verify signal 0: " + Integer.signum(0)); // 0
        System.out.println("Verify signal -10: " + Integer.signum(myint6)); // -1
        System.out.println("Verify signal 10: " + Integer.signum(myint)); // 1
        System.out.println("Sum function: " + Integer.sum(myint, myint)); //20
        System.out.println("To string: " + myint.toString().getClass().getName()); //java.lang.String
        System.out.println("ValueOf: " + Integer.valueOf("123")); //this method use parseInt with base 10, but returns an Object
        System.out.println("Parse int " + Integer.parseInt("10"));
        System.out.println("ValueOf int " + Integer.valueOf("10").getClass().getName());

    }


}
