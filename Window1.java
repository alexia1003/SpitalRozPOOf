package SpitalRoz;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window1 extends JFrame {
    private JTextField textField;
    private JComboBox<String> dropdown;
    private JCheckBox checkBox;
    
    public Window1() {


JFrame frame = new JFrame("Medic");

        Font mainFont = new Font("Segoe print", Font.BOLD, 18);

        // Camp text
        JTextField tfNume = new JTextField();
        tfNume.setFont(mainFont);
        JTextField tfPrenume = new JTextField();
        tfPrenume.setFont(mainFont);
        JTextField tfID = new JTextField();
        tfID.setFont(mainFont);
        JTextField tfSectie = new JTextField();
        tfSectie.setFont(mainFont);

        JLabel lbMedic = new JLabel();
        lbMedic.setFont(mainFont);
        
        // Nume inregistrari
        JLabel lbNume = new JLabel("Nume");
        lbNume.setFont(mainFont);
        JLabel lbPrenume = new JLabel("Prenume");
        lbPrenume.setFont(mainFont);
        JLabel lbID = new JLabel("ID");
        lbID.setFont(mainFont);
        JLabel lbSectie = new JLabel("Sectie");
        lbSectie.setFont(mainFont);



        // Functie de validare date intare 
        ActionListener validareDate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tfNume.getText();
                String p = tfPrenume.getText();
                String i = tfID.getText();
                String s = tfSectie.getText();
/* 
                if (n.isEmpty() || p.isEmpty() || i.isEmpty() || s.isEmpty()) 
                { // Verif. camp liber
                  JOptionPane.showMessageDialog(frame, "Atentie! Campuri goale.");
                } else {
                try {
                int vs = Integer.parseInt();   //return varsta String sub forma de int
                // Verif. varsta valida
                if (vs < 0 || vs > 150) {
                    JOptionPane.showMessageDialog(frame, "Introdu o varsta valida.");
                } else {
                    // Toate info. sunt valide
                    lbMedic.setText("Medicul: " + n + " " + p + " Id-ul: " + i + " Varsta: " + v + " ~ " + s);
                }
                } catch (NumberFormatException ex) {    //convert. String - int nu e posibila
                JOptionPane.showMessageDialog(frame, "Introdu o valoare valida pt varsta.");
                }
                }
*/
        }};

        // Buton 
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = tfNume.getText();
                String prenume = tfPrenume.getText();
                String ID = tfID.getText();
                String sectie = tfSectie.getText();
                
            }
        });

        // F. de valid. alocata butonului OK 
        btnOK.addActionListener(validareDate);

        // Buton
        JButton btnSterge = new JButton("Sterge");
        btnSterge.setFont(mainFont);
        btnSterge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNume.setText(" ");
                tfPrenume.setText(" ");
                tfID.setText(" ");
                tfSectie.setText(" ");
                lbMedic.setText(" ");
            }
        });


        // Adaugare campuri si nume camp
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbNume);
        formPanel.add(tfNume);
        formPanel.add(lbPrenume);
        formPanel.add(tfPrenume);
        formPanel.add(lbID);
        formPanel.add(tfID);
        formPanel.add(lbSectie);
        formPanel.add(tfSectie);

        // Adaugare butoane
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnSterge);

        // Adaugare fereastra
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(255, 102, 102));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbMedic, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        frame.add(mainPanel);

        // Setare bara titlu
        frame.setTitle("Medic");
        frame.setSize(500, 400);
        frame.setMinimumSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Window1();

        });
    }
}

