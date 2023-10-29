package SpitalRoz;

import javax.swing.*;
import java.awt.event.*;


public class MainFrame extends JFrame {
    private JTextField textField;
    private JComboBox<String> dropdown;
    private JCheckBox checkBox;


    public MainFrame() {
        setTitle("Spital Roz");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        // Dropdown
        String[] dropdownOptions = {"Medic", "Medic Rezident", "Asistent"};
        dropdown = new JComboBox<>(dropdownOptions);
        panel.add(dropdown);

        // Textbox
        textField = new JTextField(20);
        panel.add(textField);

        // Checkbox
        checkBox = new JCheckBox("Check me");
        panel.add(checkBox);

        // Button
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String selectedOption = (String) dropdown.getSelectedItem();
                boolean isChecked = checkBox.isSelected();

                // Validate the text field
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Please enter some text", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Text: " + text);
                    System.out.println("Dropdown Selected Option: " + selectedOption);
                    System.out.println("Checkbox State: " + isChecked);
                }
            }
        });
        panel.add(button);

        add(panel);
        setVisible(true);

      
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame();

        });
    }
    
}
