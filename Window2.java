package SpitalRoz;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Window2 extends JFrame {

    private ArrayList<String> dataList;

    public Window2(ArrayList<String> dataList) {
        this.dataList = dataList;

        setTitle("Notite Garda");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.PINK);

        JTextArea campNotitePacienti = new JTextArea(5, 20);
        panel.add(new JLabel("Notite pacienti:"));
        panel.add(new JScrollPane(campNotitePacienti));

        JTextArea campNotiteImportante = new JTextArea(5, 20);
        panel.add(new JLabel("Notite importante:"));
        panel.add(new JScrollPane(campNotiteImportante));

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String notitePacienti = campNotitePacienti.getText();
                String notiteImportante = campNotiteImportante.getText();

                if (!notitePacienti.isEmpty() && !notiteImportante.isEmpty()) {
                    dataList.add(notitePacienti);
                    dataList.add(notiteImportante);

                    scrieDateFisier(dataList);
                    JOptionPane.showMessageDialog(Window2.this, "Operatiune efectuată  cu succes");
                    dispose();
                    System.out.println("Lista finala de date: " + dataList);
                } else {
                    JOptionPane.showMessageDialog(Window2.this, "Introduce valori in toate campurile", "Eroare", JOptionPane.ERROR_MESSAGE);
                }            
            }
        });
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    private void scrieDateFisier(ArrayList<String> dataList) {
        try {
            BufferedWriter scriere = new BufferedWriter(new FileWriter("date.txt", true));
            for (String data : dataList) {
                scriere.write(data + "\n");
            }
            scriere.close();
            System.out.println("Datele au fost scrise in fisier.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrayList<String> sampleData = new ArrayList<>();
            new Window2(sampleData);
        });
    }
}

