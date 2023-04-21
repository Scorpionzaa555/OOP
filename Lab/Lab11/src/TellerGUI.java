import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TellerGUI implements ActionListener {
    
    private JFrame f;
    private JPanel panel1, panel2;
    private JLabel label1, label2;
    private TextField tf1, tf2;
    private JButton b1, b2, b3;
    
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        double num = 0;
        if(ae.getSource().equals(b1)){
            try {
                num = Double.parseDouble(tf2.getText());
                if(num == 0) {
                    num = 0;
                }
            }catch(NumberFormatException e) {
                num = 0;
            }
            acct.setBalance(acct.getBalance() + num);
            //tf1.setText(acct.getBalance() + Double.parseDouble(tf2.getText())+"");
            //tf1.setText(acct.deposit(Integer.parseInt((tf2.getText() + ""))));
        }else if(ae.getSource().equals(b2)){
            //tf1.setText(acct.getBalance() - Double.parseDouble(tf2.getText())+"");
            //result = acct.withdraw((tf2.getText()) + "");
            //tf1.setText(result);
            //acct.setBalance(acct.getBalance() - result);
        }else if(ae.getSource().equals(b3)){
            System.exit(0);
        }
    }
}
