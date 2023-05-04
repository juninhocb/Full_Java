package ios.Files;


import javax.swing.*;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class In {

    private static final String PATH = String.format("%s/files/text.txt", System.getProperty("user.dir"));
    public void runMe() throws IOException {

        //ex1(); //bufferedReader requires a reader [FileReader, InputStreamReader] are examples.
        //ex2();

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
