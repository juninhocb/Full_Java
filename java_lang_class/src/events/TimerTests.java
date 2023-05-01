package events;

import javax.swing.*;
import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TimerTests extends Applet { //needs another app to run like BlueJ

    public void runMe() throws InterruptedException {

        //ex1();

        ex2();

    }

    class MouseSpy implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Was clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Was pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Was released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Was entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Was exited" + e.getX() + e.getY());
        }
    }
    private void ex2() {
        MouseSpy listener = new MouseSpy();
        addMouseListener(listener);
    }
    private void ex1(){
        CountDown cdListner = new CountDown(10);
        final int DELAY = 1000; //ms
        Timer t = new Timer(DELAY, cdListner);
        t.start();
        JOptionPane.showMessageDialog(null, "Wait! ");
    }

}
