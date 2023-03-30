import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorOneGUI implements ActionListener {
    private JFrame f;
    private JPanel panel;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private TextField tf1;
    private TextField tf2;
    private TextField tf3;
    public CalculatorOneGUI() {
//        this.setTitle("เครื่องคิดเลข");
//        this.setSize(480, 320);
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JFrame f = new JFrame("เครื่องคิดเลข");
        panel = new JPanel();
        f = new JFrame("เครื่องคิดเลข");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 190);
        f.setLayout(new GridLayout(4, 0));
        panel.setLayout(new FlowLayout());
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");
        f.add(tf1);
        f.add(tf2);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        f.add(panel);
        f.add(tf3);
        f.setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = 0, num2 = 0;
        try {
            num1 = Double.parseDouble(tf1.getText());
            num2 = Double.parseDouble(tf2.getText());
        } catch (NumberFormatException ex) {
            tf3.setText("???");
        }
        String total = "";
        if (e.getSource().equals(b1)) {
            total += String.valueOf(num1+num2);
        } else if (e.getSource().equals(b2)) {
            total += String.valueOf(num1-num2);
        } else if (e.getSource().equals(b3)) {
            total += String.valueOf(num1*num2);
        } else if (e.getSource().equals(b4)) {
            if (num1 == 0 || num2 == 0) {
                total += "NOOOOOO";
            } else {
                total += String.valueOf(num1/num2);
            }
        }
        tf3.setText(total);
    }
}
