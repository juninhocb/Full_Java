package frames;

import frames.panels.RectanglePanel;

import javax.swing.*;
import java.awt.*;

public class RectangleTest {

    public void runMe(){

        RectanglePanel rectanglePanel = new RectanglePanel();
        JFrame appFrame = new JFrame();
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setContentPane(rectanglePanel);
        appFrame.pack();
        appFrame.setVisible(true);

    }



}
