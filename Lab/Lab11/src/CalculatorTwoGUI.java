import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorTwoGUI implements ActionListener {
    
    private JFrame f;
    private JPanel panel;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private TextField tf;
    private ArrayList<JButton> buttons;
    
    private double num1, num2;
    private char op;
    private double result = 0;
    
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
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("+")) {
            op = '+';
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
        } else if (str.equals("-")) {
            op = '-';
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
        } else if (str.equals("x")) {
            op = '*';
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
        } else if (str.equals("/")) {
            op = '/';
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
        } else if (str.equals("=")) {
            num2 = Integer.parseInt(tf.getText());
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            tf.setText(result + "");
            result = 0;
        } else if (str.equals("c")) {
            tf.setText("");
            num1 = num2 = result = 0;
        } else {
            tf.setText(tf.getText() + str);
        }
    }
}
