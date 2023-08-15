import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel mainPanel;
    private JPanel resPanel;
    private JLabel lbName;
    private JTextField txtName;
    private JLabel tittleLabel;
    private JButton btnOk;
    public Main() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "My name is: " + txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setContentPane(main.mainPanel);
        main.setVisible(true);
        main.setBounds(500,200, 300, 200);

    }

}
