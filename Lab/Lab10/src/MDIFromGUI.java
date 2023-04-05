import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame frame;
    
    private JDesktopPane desktopPane;
    private JInternalFrame inFrame1;
    private JInternalFrame inFrame2;
    private JInternalFrame inFrame3;
    
    private JMenuBar navBar;
    private JMenu m1;
    private JMenu m2;
    private JMenu m3;
    private JMenu ms1;
    private JMenuItem i2;
    private JMenuItem i3;
    private JMenuItem i4;
    private JMenuItem msi1;
    private JMenuItem msi2;
    
    public MDIFromGUI() {
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.black);
        frame = new JFrame("SubMenuItem Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        navBar = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");

        frame.setJMenuBar(navBar);
        navBar.add(m1);
        navBar.add(m2);
        navBar.add(m3);
        
        ms1 = new JMenu("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Exit");
        
        m1.add(ms1);
        m1.add(i2);
        m1.addSeparator();
        m1.add(i3);
        m1.addSeparator();
        m1.add(i4);
        
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        
        inFrame1 = new JInternalFrame("Application 01", true, true, true, true);
        inFrame2 = new JInternalFrame("Application 02", true, true, true, true);
        inFrame3 = new JInternalFrame("Application 03", true, true, true, true);
    
        inFrame1.setSize(500, 300);
        inFrame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        inFrame1.setLocation(0, 0);
        inFrame1.getContentPane().add(new JLabel("Frame 1 contents..."));
        //inFrame1.setResizable(false);
        //inFrame1.setMaximizable(false);
        //inFrame1.setClosable(false);
        inFrame1.pack();
        inFrame1.setVisible(true);
        
        inFrame2.setSize(500, 300);
        inFrame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        inFrame2.setLocation(400, 0);
        inFrame2.getContentPane().add(new JLabel("Frame 2 contents..."));
        //inFrame2.setResizable(false);
        //inFrame2.setMaximizable(false);
        //inFrame2.setClosable(false);
        inFrame2.pack();
        inFrame2.setVisible(true);
        
        inFrame3.setSize(500, 300);
        inFrame3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        inFrame3.setLocation(200, 300);
        inFrame3.getContentPane().add(new JLabel("Frame 3 contents..."));
        //inFrame3.setResizable(false);
        //inFrame3.setMaximizable(false);
        //inFrame3.setClosable(false);
        inFrame3.pack();
        inFrame3.setVisible(true);
        
        desktopPane.add(inFrame1);
        desktopPane.add(inFrame2);
        desktopPane.add(inFrame3);
        
        frame.add(desktopPane, BorderLayout.CENTER);
        frame.setMinimumSize(new Dimension(1000, 700));
        frame.pack();
        frame.setVisible(true);
        //frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
