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
        acct = new Account(6000, "Mark");
        f = new JFrame("Teller GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(315, 170);
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        f.setLayout(new GridLayout(2, 1));
        label1 = new JLabel("Balance");
        tf1 = new TextField(String.valueOf(acct.getBalance()));
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
        
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        f.add(panel1);
        f.add(panel2);
        
        f.setVisible(true);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = 0;
                try {
                    num = Double.parseDouble(tf2.getText());
                    if (num < 0) {
                        num = 0;
                    }
                } catch (NumberFormatException ex) {
                    num = 0;
                }
                acct.setBalance(acct.getBalance() + num);
                if (!tf2.getText().isEmpty()) {
                    tf2.setText("");
                }
                tf1.setText(String.valueOf(acct.getBalance()));
            }

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = 0;
                try {
                    num = Double.parseDouble(tf2.getText());
                    if (num < 0) {
                        num = 0;
                    }
                    if (acct.getBalance() < num) {
                        return;
                    }
                } catch (NumberFormatException ex) {
                    num = 0;
                }
                acct.setBalance(acct.getBalance() - num);
                if (!tf2.getText().isEmpty()) {
                    tf2.setText("");
                }
                tf1.setText(String.valueOf(acct.getBalance()));
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        if(e.getSource().equals(b1)) {
//            double num = 0;
//            num = Double.parseDouble(tf2.getText());
//            acct.setBalance(acct.getBalance() + num);
//            if (!tf2.getText().isEmpty()) {
//                tf2.setText("");
//            }
//            tf1.setText(String.valueOf(acct.getBalance()));
//        }
//        else if(e.getSource().equals(b2)) {
//            double num = 0;
//            num = Double.parseDouble(tf2.getText());
//            acct.setBalance(acct.getBalance() - num);
//            tf1.setText(String.valueOf(acct.getBalance()));
//        }
//        else if(e.getSource().equals(b3)) {
//            f.dispose();
//        }
//    }
}
