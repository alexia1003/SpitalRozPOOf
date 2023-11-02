package SpitalRoz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WindowS extends JFrame {

    private static WindowS instance;
    private JTextArea infoArea;
    private String enteredText = ""; 

    private WindowS() {
        setTitle("Mesaj");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.PINK);

        JLabel label1 = new JLabel(" Toate datele au fost introduse cu succes in fisier.");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        Dimension label1Size = label1.getPreferredSize();
        label1Size.height = 50; 
        label1.setPreferredSize(label1Size);
        panel.add(label1, BorderLayout.CENTER);
        

        infoArea = new JTextArea(5, 10);
        Color roz = new Color(255, 198, 222);
        infoArea.setBackground(roz);
        JScrollPane scrollPane = new JScrollPane(infoArea);
        panel.add(scrollPane, BorderLayout.SOUTH);

    
        //Citire date din fisier si afisarea lor in fereastra
        try {
            BufferedReader reader = new BufferedReader(new FileReader("date.txt"));
            String line = reader.readLine();
            while (line != null) {
                infoArea.append(line + "\n");
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
       
       
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static synchronized WindowS getInstance() {
        if (instance == null) {
            instance = new WindowS();
        }
        return instance;
    }




}
