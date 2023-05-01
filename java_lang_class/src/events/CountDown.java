package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDown implements ActionListener {

    private int count;

    CountDown(int initialCount){
        this.count = initialCount;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count >= 0){
            System.out.println(String.format("Still in progress! value %d", count));
        } else {
            System.out.println("Ready to exit!");
            System.exit(0);
        }
        this.count--;
    }
}
