package object;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class MyChar {

    public static void runMe() throws IOException {
        //ex1();
        //ex2();
        //ex3();
        ex4();

    }

    public static void ex4(){
        System.out.println("Dice simulator!");
        Random random = new Random();
        for (int i = 0; i < 12; i++){
            try{
                Thread.sleep(1000);
                System.out.println(String.format("The number is: %d", random.nextInt(6)+1));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }

    public static void ex3() throws IOException{
        System.setProperty("MyProp", "3");
        System.out.println("all: " + System.getProperties());
        System.out.println("System prop: " + System.getProperty("user.dir"));
        String directoryPath = System.getProperty("user.dir");
        File file = new File(String.format("%s/files/words.txt", directoryPath));
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<String> words = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            words.add(line);
        }

        String s1 = "abc";
        String s2 = "bcd";
        String s3 = "cd";
        String s4 = "daa";
        String s5 = "abc";
        String s6 = "abb";

        System.out.println("comparing: "  + s5.compareToIgnoreCase(s1));  // abc = abc = 0
        System.out.println("comparing: "  + s1.compareToIgnoreCase(s6));  // abc != abb = 1

        System.out.println("comparing: "  + s1.compareToIgnoreCase(s2));  // a < b = -1
        System.out.println("comparing: "  + s2.compareToIgnoreCase(s3));  // b < c = -1
        System.out.println("comparing: "  + s3.compareToIgnoreCase(s4));  // c < d = -1

        System.out.println("comparing: "  + s4.compareToIgnoreCase(s3));  // d > c = 1
        System.out.println("comparing: "  + s3.compareToIgnoreCase(s2));  // c > b = 1
        System.out.println("comparing: "  + s2.compareToIgnoreCase(s1));  // b > a = 1

        System.out.println("comparing: "  + s4.compareToIgnoreCase(s1));  // d > a = 3
        System.out.println("comparing: "  + s1.compareToIgnoreCase(s3));  // a < c = -2
        System.out.println("comparing: "  + s1.compareToIgnoreCase(s4));  // a < d = -3

        Comparator<String> strCompare = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };

        words.sort(strCompare);
        System.out.println("Sorted.");
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }


        File outputFile = new File(String.format("%s/files/sorted.txt", directoryPath));

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (String word : uniqueWords) {
                writer.println(word);
            }
        }

        System.out.println("Unique words saved to " + outputFile.getAbsolutePath());



    }

    public static void ex2() throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] listChars = br.readLine().toCharArray();
        for (char c : listChars ){
            boolean isDigit = Character.isDigit(c) ? true : false;
            if (isDigit){
                System.out.println("Is digit ");
                count++;
            } else {
                System.out.println("Is not digit");
            }
        }
        System.out.println(String.format("There are %d digits.", count));

    }

    public static void ex1(){
        int count = 0;
        String input = JOptionPane.showInputDialog("Entre com a string");
        for (int i = 0; i < input.length(); i ++){
            boolean isDigit = Character.isDigit(input.charAt(i));
            if (isDigit){
                System.out.println("This is a number");
                count++;
            }else{
                System.out.println("this is not a number");
            }
        }
        System.out.println(String.format("There are %d digits.", count));
    }
}
