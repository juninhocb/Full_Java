package com.keywords;

/**
 * implements [22]
 *
 */
public class MyImplementation implements MyContract{
    @Override
    public void myPrinter(String str) {
        System.out.println(String.format("String is %s", str));
    }
    @Override
    public int mySum(int val1, int val2) {
        return val1 + val2;
    }
}
