package ios.Files;


import ios.Information;


import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class In {

    private static final String PATH = String.format("%s/files/text.txt", System.getProperty("user.dir"));
    public void runMe() throws IOException, ClassNotFoundException {

        //ex1(); //bufferedReader requires a reader [FileReader, InputStreamReader] are examples.
        //ex2();
        //ex3();
        //ex4();
        //ex5();
    }

    public void ex5() throws IOException, ClassNotFoundException {
        File file = new File(String.format("%s/files/info.txt", System.getProperty("user.dir")));
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Information info = (Information) ois.readObject();
        System.out.println(info.toString());
    }

    public void ex4(){

        File fileForTest = new File(System.getProperty("user.dir") + "/files/log/test");
        if (!fileForTest.exists())
            fileForTest.mkdirs(); //create both: log and test

        File file = new File(System.getProperty("user.dir") + "/files/log");
        if (!file.exists())
            file.mkdir(); //create only log. Does not have effect within two directories path

        System.out.println("Date and Time " + new SimpleDateFormat("dd-MM-yyyy hh-mm-ss").format(new Date()));
        System.out.println("Full Date " + new Date());
        //changing the timezone
        ZoneId zoneId = ZoneId.of("GMT+9"); // time in Japan
        TimeZone.setDefault(TimeZone.getTimeZone(zoneId));
        System.out.println("Full date Japan " + new Date());
        System.out.println("Get separator " + System.getProperty("file.separator"));

        File newFile = new File(System.getProperty("user.dir") + "/files");
        List<File> files = Arrays.asList(newFile.listFiles());
        files.forEach(x -> System.out.println(x.getName()));
    }

    public void ex3(){
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Path filePath = selectedFile.toPath();
            if (filePath.toString().endsWith(".txt")){
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "The file must be a .txt file");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You need to chose a File.");
        }
    }

    public void ex2() throws IOException {
        Path file = Paths.get(PATH);
        System.out.println(String.format("The name of file is %s  system %s",
                file.getFileName(),
                file.getFileSystem()
        ));
        List<String> lines = Files.readAllLines(file);
        lines.forEach(x -> System.out.println(x));
    }
    public void ex1() throws IOException {
        File file = new File(PATH);
        if (file.exists()){
            System.out.println("The file exist!");
        } else {
            System.out.println("The file does not exist!");
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        boolean isB = false;
        String myStr;
        if ( (myStr = isB ? "teste" : "testando") != "teste" ) {
            System.out.println(myStr);
        }
    }


}