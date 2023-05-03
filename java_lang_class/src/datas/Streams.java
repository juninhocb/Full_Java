package datas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

    public void runMe(){

        //ex1();
        //ex2();
        ex3();




    }

    public void ex3(){
        List<Integer> myIntList = Arrays.asList(9,2,4,6,1,8);
        List<Integer> sortedList = myIntList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(x -> System.out.print(x));
        System.out.println("\n");
        int sumAll = myIntList.stream()
                .reduce(0, (nmr, i) -> nmr+i);
        System.out.println(sumAll); //30
        int sumAllOdds = myIntList.stream()
                .filter(nmr -> nmr%2 != 0)
                .reduce(0, (nmr, i) -> nmr+1);
        System.out.println(sumAllOdds); //10
    }

    public void ex2(){
        List<String> myStringList = Arrays.asList("Palmerias", "Chelsea", "Manchester United", "Crystal Palace", "Portsmouth");
        List<String> filteredStringList = myStringList.stream().filter(filter -> filter.startsWith("P")).collect(Collectors.toList());
        myStringList.forEach(str -> System.out.println(str)); //do not change the original list...
        filteredStringList.forEach(str -> System.out.println(str)); //Palmerias, portsmouth
        Map<String, Boolean> allowsMap = new HashMap<>();
        allowsMap.put("Peter", false);
        allowsMap.put("Godfrey", true);
        allowsMap.put("Frank", true);
        allowsMap.put("Davies", false);
        List<String> allowedList = allowsMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue())
                .map(Map.Entry::getKey) //just takes the key value "Godfrey and Frank"
                .collect(Collectors.toList());

        allowedList.forEach(allowPerson -> System.out.println(allowPerson)); //Godfrey and Frank

        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("Annie", 15);
        agesMap.put("Leonardo", 25);
        agesMap.put("Sofie", 28);
        agesMap.put("Lucas", 12);
        List<String> legalAge = agesMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 18)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        legalAge.forEach(x-> System.out.println(x)); //Leonardo and Sofie

        Map<String, String> wordsMap = new HashMap<>();
        wordsMap.put("First Word", "usfhdfuhdhushfus");
        wordsMap.put("Second Word", "usadfhusd");
        wordsMap.put("Third Word", "uhsd");
        wordsMap.put("Fourth Word", "skofofokksdod");

        Map<String,String> bigWords = wordsMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().length() > 7)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        bigWords.forEach( (bigWord,bigValue) -> System.out.println(bigWord + " " + bigValue));
    }

    public void ex1(){
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        List<Integer> intListPowByTwo = intList.stream().map(x -> x*x).collect(Collectors.toList());

        intListPowByTwo.stream().forEach(x -> System.out.print(" " + x));
        System.out.println("\n");
        intListPowByTwo.stream().forEach(Streams::refMethod);  //variable passed implicitly
        System.out.println("\n");
        intListPowByTwo.stream().forEach(x -> {
            System.out.print(" Triggered ");
            System.out.print(x);
        });

        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,4);
        integerMap.put(3,1);
        System.out.println("\n");
        integerMap.forEach(Streams::refMethodForMaps);
        System.out.println("\n");
        Function<Integer, Integer> squareFunction = Streams::refSquare;
        List<Integer> squareInsListAgain = intList.stream().map(squareFunction).collect(Collectors.toList());
        squareInsListAgain.stream().forEach(x -> System.out.print(" " + x)); //x is Integer here
        System.out.println("\n");

        List<Long> myLongList = Arrays.asList(1L,2L,3L,4L,5L);
        List<Long> tripleTimes =  myLongList.stream().map(x -> x*3).collect(Collectors.toList()); //x is Long here
        tripleTimes.forEach(x -> System.out.print(" " + x));
    }

    private static int refSquare(int x){
        return x*x;
    }

    private static void refMethodForMaps(int x, int y){
        System.out.println("Sum is: " + (x+y));
    }

    private static void refMethod(int x){
        System.out.print(" Triggered ");
        System.out.print(x);
    }


}
