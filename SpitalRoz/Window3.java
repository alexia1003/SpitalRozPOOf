package SpitalRoz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Window3 extends JDialog {
        
    public Window3(JFrame frame, String titlu, String mesaj) {
        super(frame, titlu, true);
        final Logger LOGGER = Logger.getLogger(Window3.class.getName());
        JPanel panel = new JPanel();
        JLabel label = new JLabel(mesaj);
        panel.add(label);

        JButton button = new JButton("Da");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                butonLoginApasat();
                dispose();
            }

            private void butonLoginApasat() {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);
            LOGGER.log(Level.INFO, "Buton apasat la: " + formattedDateTime);
            }
        });
        panel.add(button);

        getContentPane().add(panel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
    }
}
 
