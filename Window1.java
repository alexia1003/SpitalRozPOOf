package SpitalRoz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Window1 extends JFrame {

    private ArrayList<String> dataList = new ArrayList<>();

    public Window1(String rol, String parola, boolean eMedicRezident) {
        setTitle("Informatii personal medical");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.PINK);

        JTextField numeField = new JTextField(20);
        panel.add(new JLabel("Nume:"));
        panel.add(numeField);

        JTextField prenumeField = new JTextField(20);
        panel.add(new JLabel("Prenume:"));
        panel.add(prenumeField);

        JTextField idField = new JTextField(20);
        panel.add(new JLabel("ID:"));
        panel.add(idField);

        JTextField sectieField = new JTextField(20);
        panel.add(new JLabel("Sectie:"));
        panel.add(sectieField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = numeField.getText();
                String p = prenumeField.getText();
                String i = idField.getText();
                String s = sectieField.getText();

                // Validare date
                if (!n.isEmpty() && !p.isEmpty() && !i.isEmpty() && !s.isEmpty()) {
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add(rol);
                    dataList.add(parola);
                    dataList.add(String.valueOf(eMedicRezident));
                    dataList.add(n);
                    dataList.add(p);
                    dataList.add(i);
                    dataList.add(s);

                    JOptionPane.showMessageDialog(Window1.this, "Operatiune efectuată  cu succes");
                    new Window2(dataList).setVisible(true);
                    dispose();

                    System.out.println("Date adaugate in lista " + dataList);
                } else {
                    JOptionPane.showMessageDialog(Window1.this, "Introdu valori in toate campurile", "Eroare", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String rol = "Medic"; // Examplu rol
            String parola = "parola"; // Examplu parola
            boolean eMedicRezident = true; // Examplu val. MedicRezident

            Window1 window1 = new Window1(rol, parola, eMedicRezident);
            window1.setVisible(true);
        });
    }

}
