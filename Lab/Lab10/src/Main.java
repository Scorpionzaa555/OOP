public class Main {
    public static void main(String[] args) {
        //new CalculatorOneGUI();
        //new CalculatorTwoGUI();
        //new TellerGUI();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {MDIFromGUI f1 = new MDIFromGUI(); });
    }
}
