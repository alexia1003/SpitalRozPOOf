package SpitalRoz;

import javax.swing.SwingUtilities;


public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
            new Window1();
            new Window2();
        });
    }
}
