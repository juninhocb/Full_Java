package ios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StdInOut {

    public void runMe() throws IOException {

        System.out.println("Standard Stream outer "); //PrintStream >> FilterOutPutStream >> OutputStream
        System.err.println("Standard Stream outer");

        // The method expects a InputStream and is a Reader [read character stream]
        InputStreamReader ir = new InputStreamReader(System.in);  //InputStream

        //Buffer the characters and expects a Reader
        BufferedReader br = new BufferedReader(ir); //more efficient for outer data
        System.out.println(br.readLine());

        // The method expects a InputStream
        Scanner sc = new Scanner(System.in); //more efficient for console program data (casting)
        System.out.println(sc.next());

        Scanner sc2 = new Scanner(System.in);  //act as iterator
        int counter = 3;
        while(sc2.hasNext() && counter != 0){
            String strTemp = sc2.next();
            System.out.println(strTemp);
            counter --;
        } //write three times or three words (do not print the last..)
        
    }

}
