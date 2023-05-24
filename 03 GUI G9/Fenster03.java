import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenster03 {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Cookie Clicker");
        fenster.setSize(800, 600);
        fenster.setLayout(new GridLayout(0, 1));

        JLabel lbGruss = new JLabel("Willkommen bei Mr K.'s Cookie Clicker!");
        lbGruss.setHorizontalAlignment(JLabel.CENTER);
        lbGruss.setFont(new Font(Font.SERIF, Font.BOLD, 
                36));
        fenster.add(lbGruss);

        JLabel lbGruss2 = new JLabel("Keine Punkte");
        lbGruss2.setHorizontalAlignment(JLabel.CENTER);
        lbGruss2.setFont(new Font(Font.SERIF, Font.PLAIN, 
                48));
        fenster.add(lbGruss2);

        ImageIcon imgCookie = new ImageIcon("Cookie.png");
        JButton bKlick = new JButton(imgCookie);
        bKlick.setMargin(new Insets(0, 0, 0, 0));
        bKlick.setBackground(Color.BLACK);
        bKlick.setBorder(null);
        bKlick.addActionListener(new ActionListener() {
                int punkte = 0;
                public void actionPerformed(ActionEvent event) {
                    // Was passiert, wenn der Button geklickt wird?
                    punkte++;
                    lbGruss2.setText(punkte + " Punkte");
                }
            });

        fenster.add(bKlick);
        fenster.setVisible(true);
    }
}
