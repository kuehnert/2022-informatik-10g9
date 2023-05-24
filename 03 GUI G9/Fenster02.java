import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenster02 {
    public static void main(String[] args) {
        // Erzeuge Fenster
        JFrame fenster = new JFrame("Mein Fenster");

        // Setze die Größe auf 800x600
        fenster.setSize(800, 600);

        fenster.setLayout(new GridLayout(0, 2));

        JLabel lbGruss = new JLabel("I am ze king of ze worlt");
        lbGruss.setHorizontalAlignment(JLabel.CENTER);
        lbGruss.setFont(new Font(Font.SERIF, Font.PLAIN, 
                24));
        fenster.add(lbGruss);

        JLabel lbGruss2 = new JLabel("There is a boat, Jack!");
        lbGruss2.setHorizontalAlignment(JLabel.CENTER);
        lbGruss2.setFont(new Font(Font.SERIF, Font.PLAIN, 
                24));
        fenster.add(lbGruss2);

        JButton bKlick = new JButton("Klick mich!");
        bKlick.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    // Was passiert, wenn der Button geklickt wird?
                    JOptionPane.showMessageDialog(fenster, "Hurra, ich wurde angeklick!");
                }
            });

        fenster.add(bKlick);
        // mach es sichtbar
        fenster.setVisible(true);
    }
}
