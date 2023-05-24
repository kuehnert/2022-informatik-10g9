import java.util.Random;

public class ArrayGeneratoren {
    // Erstellen Sie ein Array mit 100 Elementen
    // Füllen Sie es mit der 7er-Reihe
    // 0   1   2 ...  99
    // 7  14  21 ... 700
    public int[] arrayErzeugen1(int laenge, int multiplikator) {
        int[] reihe = new int[laenge];

        int zaehler = 0;
        while (zaehler < reihe.length) {
            // reihe[0] = 7;
            // reihe[1] = 14;
            // reihe[2] = 21;
            reihe[zaehler] = (zaehler + 1) * multiplikator;

            zaehler = zaehler + 1;
        }

        return reihe;
    }

    // 1. arrayErzeugen2 erzeugt ein Array mit <laenge> Quadratzahlen
    public int[] arrayErzeugen2(int laenge) {
        int[] reihe = new int[laenge];

        int zaehler = 0;
        while (zaehler < reihe.length) {
            reihe[zaehler] = zaehler * zaehler;
            zaehler = zaehler + 1;
        }

        return reihe;
    }
    
    // 2. arrayErzeugen3 erzeugt ein Array mit 2er-Potenzen
    //    {1, 2, 4, 8, 16, ...}
    // 2a Verdoppele immer den vorigen Wert
    // 2b 2*2*2   = 
    //    2*2*2*2 =
    public int[] arrayErzeugen3(int laenge) {
        int[] reihe = new int[laenge];
        int ergebnis = 1;
        int zaehler = 0;

        while (zaehler < reihe.length) {
            reihe[zaehler] = ergebnis;
            ergebnis = ergebnis * 2;
            zaehler = zaehler + 1;
        }

        return reihe;
    }

    public int[] arrayErzeugen3b(int laenge) {
        int[] reihe = new int[laenge];
        reihe[0] = 1;
        int zaehler = 1;

        while (zaehler < reihe.length) {
            // Nimm das Element an voriger Stelle und rechne * 2
            reihe[zaehler] = reihe[zaehler - 1] * 2;
            zaehler = zaehler + 1;
        }

        return reihe;
    }

    public int[] arrayErzeugen3c(int laenge) {
        int[] reihe = new int[laenge];
        int zaehler = 1;

        while (zaehler < reihe.length) {
            // Nimm das Element an voriger Stelle und rechne * 2
            // reihe[zaehler] = potenziereZwei(zaehler);
            zaehler = zaehler + 1;
        }

        return reihe;
    }
    
    /**
     * Erstellt ein Array aus <n> zufälligen Zahlen zwischen
     * 0 und 2000. Gibt das Array zurück
     * TODO: 
     * 1. Mache die Anzahl der Zahlen variabel
     * 2. Mache die max. Höhe der Zahlen variabel
     */
    public int[] zufallszahlen(int anzahl, int hoehe) {
        // 0. Erstelle einen Generator für Zufallszahlen
        // import java.util.Random; oben!
        Random generator = new Random();
        
        // 1. Erstelle ein leeres Array der Länge 100 
        int[] array = new int[anzahl];
        
        // 2. Gehe durch das Array und setze jedes Element
        //    auf einen zufälligen Wert
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = generator.nextInt(hoehe);
        }
        
        // 3. Gib das Array zurück
        return array;
    }
    
    /**
     * Erstellt ein Array aus <n> zufälligen Zahlen 
     * Die Zahlen sollen aufsteigend sortiert sein
     * Beispiel: 8, 9, 17, 22, 59, 80, 563, 1055
     * Gibt das Array zurück
     * 1. Setze a[0] auf eine zuf. Zahl
     * 2. Gehe von Index 1 aus bis zum Ende
     * 3. Addiere das Element vorher plus eine zufällige Zahl
     */
    public int[] zufallszahlenAufsteigend(int anzahl) {
        // 0. Erstelle einen Generator für Zufallszahlen
        // import java.util.Random; oben!
        Random generator = new Random();
        
        // 1. Erstelle ein leeres Array der Länge <anzahl>
        int[] array = new int[anzahl];
        array[0] = generator.nextInt(100);
        
        // 2. Gehe durch das Array und setze jedes Element
        //    auf einen zufälligen Wert
        for (int i = 1; i < array.length; i = i + 1) {
            array[i] = array[i-1] + generator.nextInt(50) + 1;
        }
        
        // 3. Gib das Array zurück
        return array;
    }
    
    /**
     * Hausaufgabe
     * Ein Plateau ist, wenn derselbe Wert mehrfach hintereinander
     * steht.
     * Finde das Plateau: Wo fängt es an, und wie lang ist es?
     * 60 │  93 │ 139 | 139 | 139 │ 181 │ 193 │ 215 │ 220 
     */
    public void findePlateau(int[] array) {
        System.out.println("Anfang Plateau: 2, Länge: 3");
    }
}















