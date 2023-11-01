package SpitalRoz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Window2 extends Window0 {

    public Window2(ArrayList<String> dataList) {
        super(dataList);
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

                    writeDataToFile();
                    JOptionPane.showMessageDialog(Window2.this, "Operatiune efectuată  cu succes");
                    openSingletonWindow();
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

    private void openSingletonWindow() {
        WindowS.getInstance();
    }

    @Override
    protected void writeDataToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("date.txt", true));
            writer.write(this.toString());
            writer.close();
            System.out.println("Data written to the file.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}