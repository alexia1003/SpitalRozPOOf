package SpitalRoz;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;




public class Window2 extends JFrame {
    private JTextField textField;
    private JComboBox<String> dropdown;
    private JCheckBox checkBox;
    
    public Window2() {


JFrame frame = new JFrame("Medic");

        Font mainFont = new Font("Segoe print", Font.BOLD, 18);

        // Camp text
        JTextField tfNumeP = new JTextField();
        tfNumeP.setFont(mainFont);
        JTextField tfPrenumeP = new JTextField();
        tfPrenumeP.setFont(mainFont);
        JTextField tfTratament = new JTextField();
        tfTratament.setFont(mainFont);
        JTextField tfSectie = new JTextField();
        tfSectie.setFont(mainFont);

        JLabel lbMedic = new JLabel();
        lbMedic.setFont(mainFont);
        
        // Nume inregistrari
        JLabel lbNumeP = new JLabel("Nume");
        lbNumeP.setFont(mainFont);
        JLabel lbPrenumeP = new JLabel("Prenume");
        lbPrenumeP.setFont(mainFont);
        JLabel lbTratament = new JLabel("Tratament");
        lbTratament.setFont(mainFont);
        JLabel lbSectie = new JLabel("Sectie");
        lbSectie.setFont(mainFont);



        // Functie de validare date intare 
        ActionListener validareDate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tfNumeP.getText();
                String p = tfPrenumeP.getText();
                String t = tfTratament.getText();
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
                String nume = tfNumeP.getText();
                String prenume = tfPrenumeP.getText();
                String tratament = tfTratament.getText();
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
                tfNumeP.setText(" ");
                tfPrenumeP.setText(" ");
                tfTratament.setText(" ");
                tfSectie.setText(" ");
                lbMedic.setText(" ");
            }
        });


        // Adaugare campuri si nume camp
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbNumeP);
        formPanel.add(tfNumeP);
        formPanel.add(lbPrenumeP);
        formPanel.add(tfPrenumeP);
        formPanel.add(lbTratament);
        formPanel.add(tfTratament);
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
        frame.setTitle("Pacient");
        frame.setSize(500, 400);
        frame.setMinimumSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Window2();

        });
    }
}

