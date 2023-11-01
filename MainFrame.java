package SpitalRoz;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.event.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements IMainFrame {

    // Campuri private
    private JComboBox<String> roluriDropdown;
    private JTextComponent parolaField;
    private AbstractButton medicRezidentCheckBox;

    public MainFrame() {
        setTitle("Personal medical");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.PINK);

        // Drop-down menu
        String[] roluri = {"Medic", "Asistent"};
        roluriDropdown = new JComboBox<>(roluri);
        panel.add(roluriDropdown);

        // Password field
        parolaField = new JTextField(20);
        panel.add(parolaField);

        // Check box
        medicRezidentCheckBox = new JCheckBox("Rezident");
        panel.add(medicRezidentCheckBox);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            } 
        });
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }
        
    @Override
    public void login() {
        String rolSelectat = (String) roluriDropdown.getSelectedItem();
        String parola = parolaField.getText();
        boolean esteMedicRezident = medicRezidentCheckBox.isSelected();
        String parolaCorecta = "1234"; // Correct password
        if (parola.equals(parolaCorecta)) {
            new Window3(MainFrame.this, "Log in", "Sunteți sigur că doriți să vă conectați?");
            new Window1(rolSelectat, parola, esteMedicRezident).setVisible(true);
            
            System.out.println("Rol selectat: " + rolSelectat);
            System.out.println("Parola: " + parola);
            System.out.println("Medic Rezident: " + esteMedicRezident);
        } else {
            JOptionPane.showMessageDialog(MainFrame.this, "Parola incorecta. Va rugam incercati din nou.", "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }
 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
}
