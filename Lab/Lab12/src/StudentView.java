import java.awt.*;
import javax.swing.*;

public class StudentView {
    private JFrame fr;
    private JLabel lbl1, lbl2, lbl3;
    private JButton btn1;
    private JTextField txt1, txt2, txt3;

    public StudentView(){
        fr = new JFrame();
        lbl1 = new JLabel("  ID:");
        lbl2 = new JLabel("  Name:");
        lbl3 = new JLabel("  Money:");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        txt1 = new JTextField("",50);
        txt2 = new JTextField("",50);
        txt3 = new JTextField("",50);
        fr.setLayout(new FlowLayout());
        fr.add(lbl1);
        fr.add(lbl2);
        fr.add(lbl3);
        fr.add(btn1);
        fr.add(txt1);
        fr.add(txt2);
        fr.add(txt3);
        fr.setSize(600, 250);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    public void setData(String i, String n, String g) {
        dataStudent = s;
        txt1.setText(i);
        txt2.setText(n);
        txt3.setText(g);
}
// setter() and getter()
