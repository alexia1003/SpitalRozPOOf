package SpitalRoz;
 
import javax.swing.*;

public class MetodeM {
    public MetodeM(Medic medic) {
        JFrame frame = new JFrame("Medic Information");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        String output = medic.toString();

        textArea.setText(output);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Medic medic1 = new Medic("Barbu", "Ana", "2367", "Cardiologie");

        JFrame frame = new JFrame("Main Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openInfoButton = new JButton("Open Medic Info");
        openInfoButton.setBounds(130, 100, 150, 30);
        openInfoButton.addActionListener(e -> new MetodeM(medic1));
        frame.add(openInfoButton);

        frame.setLayout(null);
        frame.setVisible(true);
    }

}