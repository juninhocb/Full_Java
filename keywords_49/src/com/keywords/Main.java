/**
 * package [31]
 *
 */
package com.keywords;

/**
 *  import [23]
 *
 */
import com.keywords.animals.Animal;
import com.keywords.animals.Cat;
import com.keywords.animals.Dog;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * public [34], class [9]
 *
 */
public class Main {

    /**
     * static [37], throws [44]
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        //uncomment the example to run!
        //firsExample();
        //secondExample();
        //thirdExample();
        //fourthExample();
        //fifthExample();
        //sixthExample();
        //seventhExample();
        //eightExample();
        //ninthExample();
        //tenthExample();
        //eleventhExample();
        //twelfthExample();
    }

    /**
     * null [30], Throw [43]
     *
     */
    private static void twelfthExample(){
        Employee employee = new Employee("Joao", 28, 1200.0);
        try {
            System.out.println("Save data into database simulation");
            int status = 0; //employee was sent

            if(status == 0){
                System.out.println("Data successfully sent");
            } else {
                throw new Exception();
            }
            System.out.println("Get data simulation...");

            //that is, has data into age (transient did not have effect)
            if (employee.getAge() != 0.0){
                throw new Exception();
            }

            System.out.println(String.format("These are the attributes from employee. Name: %s and Salary: R$ %.2f", employee.getName(), employee.getSalary()));

        }catch (RuntimeException rex){
            System.out.println("A runtime exception has occurred" + rex.getMessage());
        } catch (Exception e) {
            System.out.println("Data unexpected {age}"); //think like a custom exception.
        }
    }

    private static void eleventhExample(){
        MyJNI jniObj = new MyJNI();
        jniObj.sayHello();
    }

    /**
     * synchronized [41]
     *
     */
    private synchronized static void tenthExample(){

        SharedObject so = new SharedObject(1,4);
        Thread t1 = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Value is: " + so.waitForLockThanMul());
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
                so.setVal1(2);
                so.setVal2(2);
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                super.run();
                so.startSync();
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }

    private static void ninthExample(){
        MyImplementation mi = new MyImplementation();
        mi.myPrinter("print this for me, please.");
        System.out.println(String.format("The sum of 1 and 2 is: %d", mi.mySum(1,2)));
    }
    private static void eightExample(){
        System.out.println(KeyPassword.getNumberSecret(10));
    }

    /**
     * continue [10], do [12]
     *
     */
    private static void seventhExample(){
        int iterator = 0;
        do{
            iterator++;
            if(iterator % 2 == 0){
                continue;
            }
            System.out.println(String.format("Print odd values %d", iterator));
        }while (iterator < 32);
    }

    /**
     * char[8]
     *
     */
    private static void sixthExample(){
        char myChar = '\u0042'; //see unicode table
        char myOtherChar = 'c';
        String myJoinOfChars = new String(new char[]{myChar,myOtherChar});
        System.out.println("myJoinOfChars: " + myJoinOfChars);
    }

    /**
     * catch[7], else [14], enum [15], finally [18], if [21], try [46]
     * Java 19
     */
    private static void fifthExample() throws InterruptedException {

        enum MachineState {
            READY_TO_GET_EXCEPTION, WAITING, READY_TO_LEAVE
        }

        MachineState mt = MachineState.WAITING;

        while(!mt.equals(MachineState.READY_TO_LEAVE)){

            if(mt.equals(MachineState.READY_TO_GET_EXCEPTION)){

                try {
                    System.out.println("I can print, the below sout no. ");
                    System.out.println(2/0  + "I will try ");

                }catch (ArithmeticException ex){
                    System.out.println("my arithmetic exception. " + ex.getClass());
                }catch (Exception ex){
                    System.out.println("my generic exception" + ex.getMessage() + ex.getClass());
                }finally {
                    mt = MachineState.READY_TO_LEAVE;
                }
            } else {
                Thread.sleep(3000);
                mt = MachineState.READY_TO_GET_EXCEPTION;
            }

        }




    }

    /**
     * case [6], default [11], switch [40]
     * Java 8
     *
    private static void fourthExample(){
        switch (new Byte((byte) 3)){
            case 0:
            case 1:
                System.out.println("is 0 or 1");
                break;
            case 2:
                System.out.println("is 2");
                break;
            case 3:
                System.out.println("is 3");
            case 4:
                System.out.println("Can be 4. but when 3, will print, because 3 is not with break! ");
                break;
            default:
                System.out.println("is not of those ones");
        }

    }
        */
    /**
     * byte[5], double [13], short [36], int [25], long [27], float [19], strictfp [38]
     * operations in IEEE 754 mode thanks to strictfp
     *
     */
    private static strictfp void thirdExample(){
        byte myByte = 12; //hold 8 bits values which means 2^8 = 256 numbers can be stored -128,127, widely use to work with streams
        short myShort = 10; // 16 bits values
        int myInt = 10; // hold 32 bits
        long myLong = 1200000000; // hold 64 bits
        float myFloat = 5.2F; // floating point can hold 32 bits
        double myDouble = 5.2; // floating point can hold 64 bits
        float myOtherFloat = myFloat + myByte; // possible
        short myOtherShort = (short) (myInt + myLong); // wrong result
        short myOtherShort2 = (short) (myInt + (myLong - 1199999990)); // 20

        System.out.println("Byte as obj: " + ((Byte) myByte).getClass().getName());
        System.out.println(myByte + myShort + myInt + myLong); //44
        System.out.println(myFloat + myDouble); //10.399999...
        System.out.println(myFloat + myByte); //17.2
        System.out.println("myothershort: " + myOtherShort);
        System.out.println("myothershort2: " + myOtherShort2);
        System.out.println(myByte + myShort + "Sum"); //22Sum
        System.out.println("Sum" + myByte + myShort ); //Sum1210

    }



    /**
     * boolean[3], break[4], while [49]
     * Java 8
     */
    private static void secondExample(){

        List<Object> objects = Arrays.asList(
                "LiteralString",
                new String ("String"),
                123,
                //new Integer(12),
                //new Boolean(false),
                true,
                true,
                12
        );

        boolean equalObject = false;
        int count = 0;
        Object lastIterator = null;

        Iterator<Object> iterator = objects.iterator();

        while (iterator.hasNext() && !equalObject){
            Object comparisonObject = iterator.next();
            System.out.println(String.format("The class is: %s", comparisonObject.getClass()));
            if (comparisonObject.equals(lastIterator)){
                equalObject = true; //Do the same of break counting the last iterator [correct]
                //break;  Go out the statement without counting the last iterator.
            }
            lastIterator = comparisonObject;
            count++;
        }

        System.out.println("Number of iterator 1 is: " + count);


        count =0;
        for (Object item : objects){
            System.out.println("item: " + item.getClass());
            if (item.equals(lastIterator)){
                count++;
                break;
            }
            lastIterator = item;
            count++;
        }

        System.out.println("Number of iterator 2 is: " + count);

    }

    /**
     * new [29], instanceof [24]
     *
     */
    private static void firsExample() {
        Dog dog = new Dog("red");
        Cat cat = new Cat("grey");

        if (dog instanceof Animal && cat instanceof Animal){
            System.out.println("Is animal");
        }

        System.out.println("Dog color: " + dog.getColor());
        dog.speak();
        System.out.println("Cat color: " + cat.getColor());
        cat.speak();
    }

}