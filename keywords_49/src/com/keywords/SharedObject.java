package com.keywords;

/**
 * volatile [48]
 *
 */
public class SharedObject {
    private volatile int val1, val2, result;

    SharedObject(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public synchronized int waitForLockThanMul(){
        System.out.println("step 1");
        while (true){
            try {
                System.out.println("step 2");
                wait();

            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("step 5");
            this.result = (this.val1 + 2) * this.val2;
            break;
        }
        System.out.println("step 6");
        return this.result;
    }

    public synchronized void startSync (){
        try {
            System.out.println("step 3");
            Thread.sleep(2000);
            notify();
            System.out.println("step 4");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}