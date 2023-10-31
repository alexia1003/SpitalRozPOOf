package SpitalRoz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 extends JDialog {
        
    public Window3(JFrame parent, String title, String message) {
            super(parent, title, true);
            JPanel panel = new JPanel();
            JLabel label = new JLabel(message);
            panel.add(label);
            JButton button = new JButton("OK");
            button.addActionListener(e -> dispose());
            panel.add(button);
            getContentPane().add(panel);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            pack();
            setLocationRelativeTo(parent);
            setVisible(true);
        }
}
 



/* 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JButton openModalButton = new JButton("Deschide mesaj.");
        openModalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Modal Dialog", true);
                dialog.setLayout(new FlowLayout());

                JLabel label = new JLabel("Operatiune efectuată  cu succes");
                dialog.add(label);

                JButton closeButton = new JButton("Close");
                closeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.add(closeButton);

                dialog.setSize(300, 200);
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });

        JPanel panel = new JPanel();
        panel.add(openModalButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
*/