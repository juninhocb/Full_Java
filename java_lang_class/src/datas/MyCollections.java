package datas;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class MyCollections {

    public void runMe(){

        ex1();


    }

    public void ex1(){
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        Iterator<Integer> it = intList.iterator();
        while(it.hasNext()){
            int iTemp = it.next();
            System.out.print(iTemp);
        }
        System.out.println("\n");
        Map<String, Boolean> mapAllows = new HashMap<>();
        mapAllows.put("a", false);
        mapAllows.put("b", true);
        mapAllows.put("c", true);
        Iterator<Boolean> mapIt = mapAllows.values().iterator(); //changes affect the initial map
        while(mapIt.hasNext()){
            boolean boolTemp = mapIt.next();
            if (!boolTemp)
                mapIt.remove();
        }
        mapAllows.forEach((x,y)-> System.out.println(x + " " + y)); //b true c true
    }

}
