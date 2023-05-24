import javax.swing.*;
import java.awt.*;

public class Fenster01 {
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

        // mach es sichtbar
        fenster.setVisible(true);
    }
}
