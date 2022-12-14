import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    Random wuerfel;
    Scanner tastatur;

    public Zahlenraten() {
        tastatur = new Scanner(System.in);
        wuerfel = new Random();
    }

    public void zahlenraten() {
        // Der PC denkt sich eine Zahl zwischen 1 und 100
        // der Benutzer versucht, sie zu raten
        // Der PC gibt aus, ob die geratene Zahl
        // zu klein oder zu groß ist, oder ob gewonnen wurde
        Scanner s = new Scanner(System.in);
        Random zufall = new Random();
        boolean weiterspielen;
        
        // Spiele immer eine neue Runde, bis der Benutzer
        // nicht mehr moechte
        do {
            int zufallszahl = wuerfel.nextInt(100) + 1;
            int geraten;
            int versuche = 0; 

            // Frage so lange nach Zahlen, bis richtig geraten wurde
            do {
                System.out.print("Dein Tipp: ");
                geraten = tastatur.nextInt();
                versuche += 1;

                if (geraten < zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist groesser!"); 
                } else if (geraten > zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist kleiner!"); 
                }
            } while (zufallszahl != geraten);

            System.out.println("Hurra, du hast gewonnen! " + versuche + " Versuche"); 
            if (versuche < 5) {
                System.out.println("sehr gut (1)");

            } else {
                System.out.println("Das geht noch besser!");
            }
            
            System.out.print("Nochmal? (1=ja, 2=nein) ");
            weiterspielen = tastatur.nextInt() == 1;
         } while (weiterspielen);
    }
    
    // Umgekehrtes Zahlenraten:
    
}
