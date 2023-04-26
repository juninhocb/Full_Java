package object;

public class MyObject {

    private class CloneClass implements Cloneable{
        private int myInt;

        public CloneClass(int otherInt){
            this.myInt = otherInt;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            System.out.println("Will clone!");
            return super.clone();
        }

        public CloneClass cloneMyClass() throws CloneNotSupportedException {
            return (CloneClass) this.clone();
        }

    }
    public static void runMe() throws CloneNotSupportedException, InterruptedException {
        Object myObj = 1;
        Object myObj2 = "hello";
        Object myObj3 = 'c';
        Object myObj4 = "1";
        MyObject myObject = new MyObject();
        CloneClass mCloneable = myObject.new CloneClass(32);
        CloneClass mClone2 =  mCloneable.cloneMyClass();

        System.out.println("Inner value: " +  mCloneable.myInt + "\nClone value: " + mClone2.myInt);
        System.out.println("Comparing objects: " + myObj.equals(myObj4)); //false
        System.out.println("Comparing objects: " + myObj.equals(Integer.parseInt(myObj4.toString()))); //true
        System.out.println("Get class " + myObj.getClass());  //class java.lang.Integer
        System.out.println("Get class " + myObj2.getClass()); //class java.lang.String
        System.out.println("Get class " + myObj3.getClass()); //class java.lang.Character
        System.out.println("Get class " + myObj4.getClass()); //class java.lang.String
        System.out.println("Hashcode " + myObj.hashCode());  //1
        System.out.println("Hashcode " + myObj2.hashCode()); //99162322
        System.out.println("Hashcode " + myObj3.hashCode()); //99
        System.out.println("Hashcode " + myObj4.hashCode()); //49
        System.out.println("Hashcode " + Integer.valueOf(myObj4.toString()).hashCode()); //1


        Thread mThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
        Thread mThread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello World2!");
            }
        };
        Thread mThread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello World3!");
            }
        };
        mThread.start();
        mThread3.start();
        mThread2.start();
        //random order of Hello World!

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1: Waiting for lock");
                    lock.wait();
                    System.out.println("Thread 1: Lock acquired");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Acquiring lock");
                lock.notify();
            }
        });

        t1.start();
        t2.start();


    }

}
