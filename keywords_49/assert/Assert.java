/**
 * assert [2]  - Certificate if the predicated is always true! if not an exception will be thrown
 *  needs enabling to be used.
 *  use javac to compile Assert into a bytecode (.class)
 *  use java -ea Assert (-enableassertions) to run the code
 *  the following exception will throw: java.lang.AssertionError within the message "Value is less than 10"
 *
 */
public class Assert {
    public static void main(String[] args){

        int value = -5;

        assert value > 0 : "Value is less than 10";

        System.out.println(String.format("Ok value %d", value));
    }
}
