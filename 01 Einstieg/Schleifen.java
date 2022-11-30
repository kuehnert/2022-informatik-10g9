import java.util.Scanner;

public class Schleifen {
    // Aufgaben
    // 1. Zähle von 1 bis 20
    // 2. Zähle von 1 bis 40 in 2er-Schritten 2, 4, 6, ... 40
    // 3. Zähle von 15 bis 1
    public static void aufgabe1() {
        int zahl = 1;

        while (zahl <= 20) {
            System.out.printf("%d %n", zahl);
            zahl = zahl + 1;
        }
    }

    public static void geradeUngeradeTest() {
        int zahl = 3;
        System.out.println(zahl);
        System.out.println(zahl / 2 * 2);

        int zahl2 = 8;
        System.out.println(zahl2);
        System.out.println(zahl2 / 2 * 2);

        if (zahl / 2 * 2 == zahl) {
            System.out.println(zahl + " ist gerade");
        } else {
            System.out.println(zahl + " ist ungerade");
        }

        if (zahl2 / 2 * 2 == zahl2) {
            System.out.println(zahl2  +" ist gerade");
        } else {
            System.out.println(zahl2 + " ist ungerade");
        }
    }

    // Tara-Bonus-Aufgabe
    // Beginne bei einer Zahl zwischen 1 und 100.
    // Dann befolge diese Anweisungen:
    // Ist die Zahl gerade, teile sie durch 2
    // Ist sie ungerade, multipliziere sie mit 3 und addiere 1
    // Wenn Du bei Eins angekommen bist, bist Du fertig
    // Schlage auf eine Schildkröte mit einem dicken Hammer
    // Zähle die Schritte, die notwendig sind, um zu 1 zu gelangen
    // TODO: Lies die Zahl ein
    // TODO: Zähle die Schritte
    // TODO: Probiere alle Zahlen von 1...100
    public static void aufgabe2nBenutzer() {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Zahl zw. 1 und 100: ");
        int benutzerzahl = tastatur.nextInt();
        aufgabe2n(benutzerzahl);
    }
    
    public static void aufgabe2nAlle() {
        // Deklaratiere & initialisiere eine Ganzzahl-Variable 
        // zaehler mit 1
        int zaehler;
        zaehler = 1;
        
        while (zaehler < 101) {
            aufgabe2n(zaehler);
            zaehler = zaehler + 1;
        }
    }
    
    public static void aufgabe2n(int zahl) {
        System.out.print("Start: " + zahl);
        int schritte; // Deklaration
         // Initialisierung von schritte mit 0
        schritte = 0;
        
        while (zahl > 1) {
            if (zahl / 2 * 2 == zahl) {
                // zahl ist gerade
                zahl = zahl / 2;
            } else {
                // zahl ist ungerade
                zahl = zahl * 3 + 1;
            }

            System.out.print(", " + zahl);
            schritte = schritte + 1;
        }
        
        System.out.println(" (" + schritte + ")");
        // System.out.printf(" (%d)%n", schritte);
    }
    
    public static void aufgabeGauss() {
        // Addiere alle Zahlen von 1 bis 100
        // 1 + 2 + 3 + 4 + 5 + ... + 100 = 5050
        int zahl = 0;
        int addition = 1;
        
        while (addition < 101) {
            zahl = zahl + addition;
            addition = addition + 1;
            System.out.println(zahl);
        }
    }
    
    public static void teilbarkeit() {
        int zaehler = 1;
        
        while (zaehler <= 100) {
            // 1. Gib die Zahl aus, wenn sie durch 5 teilbar ist
            // 2. Gib die Zahl aus, wenn sie durch 5 teilbar ist, 
            //    aber nicht durch 3
            System.out.println(zaehler);
            zaehler = zaehler + 1;
        }
        
    }
    
    // Unser erstes Spiel!!!
    
}
