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
    //private JTextArea infoArea;
    //private String enteredText = ""; 

    private WindowS() {
        setTitle("Mesaj");
        setSize(400, 100);
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
        
        JLabel label2 = new JLabel(" Verificati fisierul.");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        Dimension label2Size = label2.getPreferredSize();
        label2Size.height = 50; 
        label2.setPreferredSize(label2Size);
        panel.add(label2, BorderLayout.CENTER);

/* 
        infoArea = new JTextArea(5, 10);
        Color roz = new Color(255, 198, 222);
        infoArea.setBackground(roz);
        JScrollPane scrollPane = new JScrollPane(infoArea);
        panel.add(scrollPane, BorderLayout.SOUTH);
*/
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
/*
    public void printInfo(String information) {
        enteredText += information + "\n"; 
        infoArea.setText(enteredText);
    }
*/
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WindowS.getInstance();
            WindowS.getInstance();
        });
    }
}
