package src.utils;

public class Formatter {

    public static void printDefaultValue(Object value){
        System.out.println(String.format("The default value of a non initialized %s is %s", value.getClass().getName(), value.toString()));
    }

    public static void getObjectFromPrimitive(Object value){
        System.out.println(String.format("The primitive wrapped class is %s. ", value.getClass().getName()));
    }


}
