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

        // zahl von 1..100
        int zufallszahl = wuerfel.nextInt(100) + 1;

        System.out.print("Dein Tipp: ");
        int geraten = tastatur.nextInt();

        // == gleich
        // != ungleich
        // < kleiner
        // > größer
        if (geraten == zufallszahl) {
            System.out.println("Hurra, Du hast gewonnen!");
        } else {
            System.out.println("Falsch!");
        }
    }

    public void ratenKaputt() {
        Scanner s = new Scanner(System.in);
        Random zufall = new Random();
        int zufallszahl = wuerfel.nextInt(100) + 1;
        int geraten;
        int versuche = 0; 

        do {
            System.out.print("Dein Tipp: ");
            geraten = tastatur.nextInt();

            if (geraten < zufallszahl) {
                System.out.println("Die gesuchte Zahl ist groesser!"); 
            } else if (geraten > zufallszahl) {
                System.out.println("Die gesuchte Zahl ist kleiner!"); 
            }
        } while (zufallszahl != geraten);

        System.out.println("Hurra, du hast gewonnen!"); 
    }
}
