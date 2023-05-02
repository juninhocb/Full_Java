package datas;

import java.util.*;

public class Structures {


    public void runMe(){

        //ex1(); //access and creating
        //ex2(); //types of array and the two methods//list
        //list is an interface, Arraylist implements it.
        //ex3(); // List from java.util.List using ArrayList (Dynamically) as implements
        //ArrayList has a diff that when the size of the array is exceeded,
        // a new array is created with a larger capacity, and the old array is copied into the new one
        //LinkedList on the other hand use nodes to the last and the next element (allows better middle access)
        //ex4();
        //ex5(); //stack
        //ex6(); //queue
        //ex7(); //set unique objects
        ex8();


    }
    private void ex8(){
        Map<String, Integer> myHashMap = new HashMap<>(); // Maintain keys
        Map<String, Integer> myLinkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> myTreeMap = new TreeMap<>(); //The keys are sorted in their natural order or based on a custom comparator if one is provided

        //adding
        myTreeMap.put("test", 1);
        myTreeMap.put("test", 2);
        myTreeMap.put("test", 3);
        myTreeMap.put("atest", 2);
        System.out.println("The value is: " + myTreeMap.get("test")); //act the same for those three maps

        myHashMap.putAll(myTreeMap);
        System.out.println(myHashMap.get("test") + myHashMap.get("atest")); //5
        System.out.println("The hashcode of TreeMap: " + myTreeMap.hashCode()); //96694530
        System.out.println("The hashcode of HashMap: " + myHashMap.hashCode());  //96694530 eq contents
        System.out.println("The hashcode of LinkedMap: " + myLinkedHashMap.hashCode()); //0 no content

        System.out.println("Proving: " + myLinkedHashMap.size()); //0

        myTreeMap.put("ctest", 4);
        myTreeMap.put("dtest", 1);
        myTreeMap.put("btest", 9);

        for (Integer item : myTreeMap.values()){
            System.out.print(item);
        } // 29413 (sort keys)

        myHashMap.clear();
        myHashMap.putAll(myTreeMap);
        System.out.println("\n");

        for (Integer item : myHashMap.values()){
            System.out.print(item);
        } // 14329
    }

    private void ex7(){
        Set<Integer> setInteger = new HashSet<>(); //sort the order
        Integer[] arrayOfInt = {5,6,4,3,1,2,2,2,2,3,4};
        Integer[] arrayOfInt2 = {5,6,4,3,1,2,2,2,2,3,4};
        Integer[] arrayOfInt3 = {5,6,4,3,1,2,2,2,2,3,4};
        setInteger.addAll(Arrays.asList(arrayOfInt));
        System.out.println("Set integer now: " + setInteger); //Set integer now: [1, 2, 3, 4, 5, 6]
        Set<Integer> setLinkedInteger = new LinkedHashSet<>(); //maintain the original one
        setLinkedInteger.addAll(Arrays.asList(arrayOfInt2));
        System.out.println("Set linked integer now: " + setLinkedInteger); //Set linked integer now: [5, 6, 4, 3, 1, 2]
        Set<Integer> setTrees = new TreeSet<>(); //sort elements
        setTrees.addAll(Arrays.asList(arrayOfInt3));
        System.out.println("Set tree Integer now: " + setTrees); //Set tree Integer now: [1, 2, 3, 4, 5, 6]
    }

    private void ex6(){
        Deque<Integer> queueDs = new LinkedList<>();
        queueDs.addFirst(1);
        System.out.println(queueDs); //[1]
        System.out.println("The first element: " + queueDs.peekFirst());
        queueDs.addFirst(2);
        System.out.println(queueDs); //[2, 1]
        System.out.println("The first element: " + queueDs.peekFirst());
        queueDs.addLast(3);
        System.out.println(queueDs); //[2, 1, 3]
        System.out.println("The last element: " + queueDs.peekLast());
        queueDs.removeLast();
        System.out.println(queueDs); //[2, 1]
        queueDs.add(3);
        System.out.println(queueDs); // [2, 1, 3]
        queueDs.add(5);
        System.out.println(queueDs); //[2, 1, 3, 5]
        queueDs.removeLastOccurrence(3); //search for item
        System.out.println(queueDs);  //[2, 1, 5]
        int popped = queueDs.pop();
        System.out.println("Popped is: " + popped); //2
        queueDs.push(3); // [3, 1, 5]
        System.out.println(queueDs);
        queueDs.addLast(4);
        queueDs.pop();
        System.out.println(queueDs); //[1, 5, 4]
        queueDs.addFirst(7);
        queueDs.pop();
        System.out.println(queueDs); //[1, 5, 4]
        queueDs.pop();
        System.out.println(queueDs); //[5, 4]
        queueDs.add(3);
        queueDs.add(8);
        queueDs.add(9);
        queueDs.pop();
        System.out.println(queueDs); //[4, 3, 8, 9]
        queueDs.pop();
        System.out.println(queueDs); //[3, 8, 9]
        queueDs.pop();
        System.out.println(queueDs); //[8, 9]
    }

    private void ex5(){
        Stack<Integer> stackDs = new Stack<>();
        stackDs.push(1);
        stackDs.push(5);
        System.out.println("The current size of the stack: " + stackDs.size());
        int poppedItem = stackDs.pop();
        System.out.println("The popped item is: " + poppedItem);
        stackDs.push(3);
        System.out.println("The top element of the stack is: " + stackDs.peek());
        System.out.println("Try to find: " + stackDs.search(1)); //2 remember that is LIFO
        System.out.println("Try to find: " + stackDs.search(3)); //1
        System.out.println("Try to find: " + stackDs.search(5)); //-1 not found
        System.out.println("Empty stack? " + stackDs.empty()); //false
    }
    private void ex4() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(2);
        System.out.println("Current linked list size " + linkedList.size());
        linkedList.add(0, 3);
        System.out.println("Current linked list size " + linkedList.size());
        linkedList.remove(1);
        System.out.println("Current linked list size " + linkedList.size());
        linkedList.clear();
        System.out.println("Current linked list size " + linkedList.size());
    }

    private void ex3(){
        List<Integer> arrayList = new ArrayList<>();  //can grow and shrink
        //List<int> can only store objects, this is wrong
        arrayList.add(1); //this is auto boxed into an Integer before adding
        arrayList.add(2);
        System.out.println("The first element is: " + arrayList.get(0));
        arrayList.add(0,3); // add 3 to the first element and shift right the rest of elements
        System.out.println("The size now is: " + arrayList.size());
        System.out.println("The first element now is: " + arrayList.get(0));
        System.out.println("Contains method: " + arrayList.contains(0)); //false
        arrayList.remove(1); //remove the second element that was occupied with 1 value
        System.out.println("The first index: " + arrayList.get(1)); // and this is why this output is 2
        System.out.println("The current size is: " + arrayList.size()); //2
        System.out.println("List " + arrayList);
        changeList(arrayList); //value passed with reference
        System.out.println("List " + arrayList);
        System.out.println("Now the size is: " + arrayList.size()); //3
        arrayList.clear();
        try{
            System.out.println("After clear " + arrayList.get(0));
        }catch (RuntimeException re){
            System.out.println(re.getClass()); //class java.lang.IndexOutOfBoundsException
        }
    }

    private void ex2(){
        int[] intArray = {1,2,3};
        Integer[] intArray2 = {2,3,5};
        String[] strArray = {"test", "char", "bool"};
        Object[] objArray = {1, false, "str"};

        System.out.println(String.format("Types: %s \n %s \n %s \n %s", intArray.getClass(), intArray2.getClass(), strArray.getClass(), objArray.getClass()));

        /*
         [ represents array
         class [I  //represents array integer...
         class [Ljava.lang.Integer;
         class [Ljava.lang.String;
         class [Ljava.lang.Object;
         */

        int[] cloneArray = intArray.clone();
        System.out.println("Is the same? " + cloneArray.equals(intArray)); //false
        System.out.println("The length " + cloneArray.length + " The first element " + cloneArray[0]);

    }

    private void ex1(){
        //Arrays static size
        int[] intArray = {1,2,3};
        int[] intArray2 = new int[3];
        Integer[] intArray3 = new Integer[3];
        int[][] intMultArray = {{1,2,3},{4,5,6}};
        System.out.println("Int array2 " + intArray2[0]); // 0 array initialize with zeros... false (boolean) and null (obj)
        System.out.println("Int array3 " + intArray3[0]);  //null
        try {
            System.out.println("Try: " + intArray[3]); //class java.lang.ArrayIndexOutOfBoundsException
        }catch (RuntimeException ex){
            System.out.println(ex.getClass());
        }
        //System.out.println(String.format("Accessing the mult array %d", intMultArray[2][0])); //ArrayIndexOutOfBoundsException: 2
        System.out.println(String.format("Accessing the mult array %d", intMultArray[1][0])); //4
    }


    private void changeList(List<Integer> arrayList){
        if (!arrayList.isEmpty()){
            arrayList.add(3);
        }
    }


}
