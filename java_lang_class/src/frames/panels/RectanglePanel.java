package frames.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RectanglePanel extends JPanel {

    private Rectangle box;
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    private static final int PANEL_WIDTH = 300;
    private static final int PANEL_HEIGHT = 300;


    public RectanglePanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        this.box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);

        class MousePressListener implements MouseListener {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                box.setLocation(x,y);
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

        MouseListener listener = new MousePressListener();
        addMouseListener(listener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }


}
