import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorTwoGUI implements ActionListener {
    
    private JFrame f;
    private JPanel panel;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private TextField tf;
    private ArrayList<JButton> buttons;
    
    private double num1;
    private double num2;
    private String operator;
    
    public CalculatorTwoGUI() {
        
        panel = new JPanel();
        f = new JFrame("My Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(310, 310);
        
        tf = new TextField();
        
        f.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(4, 4));
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");
        
        f.add(tf, BorderLayout.NORTH);
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        f.add(panel);
        
        buttons = new ArrayList<>(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16));
        for (JButton button : buttons) {
            button.addActionListener(this);
        }
        
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(b4)) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
            operator = "+";
        } else if (source.equals(b8)) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
            operator = "-";
        } else if (source.equals(b12)) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
            operator = "*";
        } else if (source.equals(b16)) {
            num1 = Double.parseDouble(tf.getText());
            if (num1 == 0) {
                tf.setText("");
            }
            operator = "/";
        } else if (source.equals(b14)) { //Clear state
            num1 = 0;
            num2 = 0;
            operator = "";
            tf.setText("");
        } else if (source.equals(b15)) {
            String latest = tf.getText();
            num2 = Double.parseDouble(latest);
            
            if(operator == "+") {
                tf.setText(String.valueOf(num1 + num2));
            }
            else if(operator == "-") {
                tf.setText(String.valueOf(num1 - num2));
            }
            else if(operator == "*") {
                tf.setText(String.valueOf(num1 * num2));
            }
            else if(operator == "/") {
                tf.setText(String.valueOf(num1 / num2));
            }
        }

        String display = tf.getText();
        display = (display != null ? display : "");
        if(e.getActionCommand() == "0") {
            tf.setText(display + "0");
        }
        else if(e.getActionCommand() == "1") {
            tf.setText(display + "1");
        }
        else if(e.getActionCommand() == "2") {
            tf.setText(display + "2");
        }
        else if(e.getActionCommand() == "3") {
            tf.setText(display + "3");
        }
        else if(e.getActionCommand() == "4") {
            tf.setText(display + "4");
        }
        else if(e.getActionCommand() == "5") {
            tf.setText(display + "5");
        }
        else if(e.getActionCommand() == "6") {
            tf.setText(display + "6");
        }
        else if(e.getActionCommand() == "7") {
            tf.setText(display + "7");
        }
        else if(e.getActionCommand() == "8") {
            tf.setText(display + "8");
        }
        else if(e.getActionCommand() == "9") {
            tf.setText(display + "9");
        }
    }
}
