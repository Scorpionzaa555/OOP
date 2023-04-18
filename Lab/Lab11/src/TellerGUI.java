import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TellerGUI {
    
    private JFrame f;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private TextField tf1;
    private TextField tf2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    private Account acct;
    
    public TellerGUI() {
        
        f = new JFrame("Teller GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(315, 170);
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        f.setLayout(new GridLayout(2, 1));
        label1 = new JLabel("Balance");
        tf1 = new TextField("6000");
        tf1.setEnabled(false);
        
        label2 = new JLabel("Amount");
        tf2 = new TextField();
        
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new FlowLayout());
        
        panel1.add(label1);
        panel1.add(tf1);
        panel1.add(label2);
        panel1.add(tf2);
        
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        f.add(panel1);
        f.add(panel2);
        
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(b1)) {
            double num = 0;
            num = Double.parseDouble(tf2.getText());
            acct.setBalance(acct.getBalance() + num);
            tf1.setText(String.valueOf(acct.getBalance()));
        }
        else if(ae.getSource().equals(b2)) {
            double num = 0;
            num = Double.parseDouble(tf2.getText());
            acct.setBalance(acct.getBalance() - num);
            tf1.setText(String.valueOf(acct.getBalance()));
        }
        else if(ae.getSource().equals(b3)) {
            f.dispose();
        }
    }
        
}
