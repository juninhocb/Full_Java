package generics;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import utils.sorts.MySorts;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generic {

    public void runMe(){

        //ex1();
        //ex2();
        //ex3();
        ex4();



    }

    private void ex4(){
        Integer[] intArray = {125,24,32,44,50};
        Double[] doubleArray = {5.0, 2.5, 2.4, 7.3, 1.5};
        String[] stringArray = {"tests", "working", "apple"};
        System.out.println("Java built-in sorter");
        Arrays.sort(intArray);
        //remind that even obj is passed by value, is a reference on obj memory of array that is passing
        Arrays.sort(doubleArray);
        Arrays.sort(stringArray);
        for (int j = 0; j < intArray.length; j++) {
            System.out.print(" " + intArray[j]);
        }
        System.out.print("\n");
        for (int j = 0; j < doubleArray.length; j++) {
            System.out.print(" " + doubleArray[j]);
        }
        System.out.print("\n");
        for (int j = 0; j < stringArray.length; j++) {
            System.out.print(" " + stringArray[j]);
        }
    }

    private void ex3(){
        Integer[] intArray = {125,24,32,44,50};
        Double[] doubleArray = {5.0, 2.5, 2.4, 7.3, 1.5};
        String[] stringArray = {"tests", "working", "apple"};
        displayItems(intArray, 2);
        displayItems(doubleArray, 2);
        displayItems(stringArray, 2);
    }

    public <T extends Comparable<T>> void displayItems (T[] array, int sorter){
        Object[] resp;
        switch(sorter){
            case 0:
                resp =  MySorts.bubbleSort(array); // 4,7,2
                break;
            case 1:
                resp =  MySorts.selectSort(array); // 4,3,2
                break;
            case 2:
                resp = MySorts.quickSort(array); // 9,5,2
                break;
            default:
                resp = null;
        }
        try {
            Object savedLastItem = null;
            for (Object item : resp){
                System.out.print(" " + item);
                savedLastItem = item;
            }
            System.out.println(String.format("\n The class of items is [%s]", savedLastItem.getClass()));
        }catch (NullPointerException ne){
            JOptionPane.showMessageDialog(null, "Null sort selected.");
        }
    }


    public void ex2(){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.0, 2.2, 3.4, 4.3, 5.5};
        String[] stringArray = {"tests", "working", "apple"};
        List<Integer> intList = Arrays.asList(intArray);
        List<Double> doubleList = Arrays.asList(doubleArray);
        List<String> stringList = Arrays.asList(stringArray);
        printGenericList(intList);
        printGenericList(doubleList);
        printGenericList(stringList);

    }

    public void ex1(){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.0, 2.2, 3.4, 4.3, 5.5};
        String[] stringArray = {"tests", "working", "apple"};
        printGenericArray(intArray);
        printGenericArray(doubleArray);
        printGenericArray(stringArray);
    }

    public <T> void printGenericList (List<T> listInput){
        for (T element : listInput){
            System.out.println(String.format("Element from %s class is %s", element.getClass(), element));
        }
    }


    /**
     *  Patterns of declaring the name of Generic type
     * T – Type
     * E – Element
     * K – Key
     * N – Number
     * V – Value
     * Use one of this rather than <Generic>
     *
     */
    public <Generic> void printGenericArray (Generic [] arrayInput){
        for (Generic element : arrayInput){
            System.out.println(String.format("Element from %s class is %s", element.getClass(), element));
        }
    }

}
