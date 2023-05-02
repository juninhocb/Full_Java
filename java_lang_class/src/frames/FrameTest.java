package frames;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;

public class FrameTest {

    public void runMe() throws MalformedURLException {
        JFrame frame = new JFrame();
        String directoryPath = System.getProperty("user.dir");
        File file = new File(String.format("%s/files/images/world.jpg", directoryPath));
        JLabel iconLabel = new JLabel(new ImageIcon(file.getAbsoluteFile().toURL()));
        JLabel textLabel = new JLabel("Hello, World!");
        JPanel panel = new JPanel();
        panel.add(iconLabel);
        panel.add(textLabel);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
