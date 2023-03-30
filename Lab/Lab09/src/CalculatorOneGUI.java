import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
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
    }
}
