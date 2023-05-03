package ios.Files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class Outer {

    public void runMe() throws Exception{

        //ex1(); //creates a file named out.txt at D: and write letter B
        //ex2(); //creates a file name out2.txt at D: and write a string
        //ex3(); //using FileWriter, better to write strings
        //ex4(); //appending data to existing file
        //ex5(); //using buffered stream, better to write large data



    }

    public void ex5() throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fos);
        String str = "Welcome to BufferedStream.";
        byte b[] = str.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fos.close();
        System.out.println("success!");
    }

    public void ex4() throws Exception{
        FileWriter fw = new FileWriter("D:\\out3.txt", true);
        fw.append("\nAppending data");
        fw.close();
        System.out.println("Data appended");
    }
    public void ex3() throws Exception{
        FileWriter fw = new FileWriter("D:\\out3.txt");
        fw.append("String directly inserted."); //do not override the actual text like writer do, this just do effect in the same obj
        fw.close();
        System.out.println("Successfully created.");
    }

    public void ex2() throws Exception{
        FileOutputStream fo = new FileOutputStream("D:\\out2.txt");
        String strOut = "Hello world to files. ã";
        byte[] streamBytes = strOut.getBytes(StandardCharsets.UTF_8);
        fo.write(streamBytes);
        fo.close();
        System.out.println("File created with success.");
    }

    public void ex1() throws Exception{
        FileOutputStream fo = new FileOutputStream("D:\\out.txt");
        fo.write(66);
        fo.close();
        System.out.println("File created with success. ");
    }

}
