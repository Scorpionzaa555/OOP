import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.WindowConstants;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener/*, WindowListener*/{
    private JFrame fr;
    private JPanel p;
    private JTextArea ta;
    private JTextField tf;
    private JButton b1, b2;
    
    public ChatDemo() {
        fr = new JFrame("ChatDemo");
        p = new JPanel();
        
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setLayout(new FlowLayout());
        
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        ta.setEditable(false);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        fr.add(ta, BorderLayout.NORTH);
        fr.add(tf, BorderLayout.CENTER);
        p.add(b1);
        p.add(b2);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(b1)) {
            DateTimeFormatter date = DateTimeFormatter.BASIC_ISO_DATE.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + date.format(LocalDateTime.now()) + ": " + tf.getText() + "\n");
            tf.setText("");
        } else if(ae.getSource().equals(b2)) {
            ta.setText("");
            tf.setText("");
        }
    }
}
