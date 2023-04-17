package utils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MethodsRetriever {

    public static void printMethodsOfThisClass(Object obj){
        int counter = 0;
        Method[] methods = obj.getClass().getMethods();
        List<Method> methodList = Arrays.asList(methods);
        Iterator<Method> iterator = methodList.iterator();
        while(iterator.hasNext()){
            Method method = iterator.next();
            if(method.getDeclaringClass().equals(obj.getClass())){
                counter ++;
                System.out.println(String.format("Method [%d] name: %s", counter, method.toString()));
            }
        }
    }

}
