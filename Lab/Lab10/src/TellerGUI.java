import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    
    private JFrame f;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JLabel label2;
    private TextField tf1;
    private TextField tf2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    public TellerGUI() {
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        f = new JFrame("Teller GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(315, 240);
        
        f.setLayout(new GridLayout(4, 0));
        label1 = new JLabel("Balance");
        tf1 = new TextField("6000");
        label2 = new JLabel("Amount");
        tf2 = new TextField();
        
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        
        panel1.add(label1, BorderLayout.WEST);
        panel1.add(tf1, BorderLayout.EAST);
        panel2.add(label2, BorderLayout.WEST);
        panel2.add(tf2, BorderLayout.EAST);
        
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
        
        f.setVisible(true);
    }
}
