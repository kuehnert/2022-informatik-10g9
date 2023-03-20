public class Arrays1 {
    /*
     * Ein Array speichert mehrere Werte eines Datentyps
     * 
     */
    public void arrays1() {
        // Deklaration
        int zahl;
        int[] zahlen;
        ArrayWerkzeuge werkzeuge;
        werkzeuge = new ArrayWerkzeuge();

        // Initialisierung
        zahl = 5;
        zahlen = new int[]{1, 2, 3, 4, 5};

        // Ausgabe / Lesender Zugriff
        // System.out.println(zahl);

        // Nicht hilfreich: Nur Speicheradresse
        System.out.println(zahlen);

        // Elemente einzeln über ihren Index ausgeben
        // System.out.println( zahlen[0] ); // => 1
        // System.out.println( zahlen[2] ); // => 3

        // Schreibender Zugriff
        // Weise Element mit Index 1 den Wert 20 zu
        zahlen[1] = 20;
        zahlen[3] = 50;
        // System.out.println( zahlen[1] );
        // System.out.println( zahlen[3] );
        System.out.println("Beispielzahlen: ");
        werkzeuge.gibArrayAus(zahlen);
        werkzeuge.gibArrayAus(zahlen);

        System.out.println("Taras Zahlen: ");
        int[] zweitesArray = new int[]{10, 15, 3};

        werkzeuge.gibArrayAus(zweitesArray);
        verdoppele(zweitesArray);
        werkzeuge.gibArrayAus(zweitesArray);
        verdoppele(zweitesArray);
        werkzeuge.gibArrayAus(zweitesArray);

        int[] drittesArray = new int[]{};
        werkzeuge.gibArrayAus(drittesArray);
    }

    public void testeGibAusTab() {
        ArrayWerkzeuge werkzeuge;
        werkzeuge = new ArrayWerkzeuge();
        
        int[] zahlen = new int[]{2, 333, 5, 711, 2, 6, 20, 1};
        werkzeuge.gibArrayAusTab(zahlen);
    }

    // Mathe-Funktion: f(x) = x^2 + 1
    // g(x)
    // f'(x)
    
    /*  2. Ändere gibArrayVerdoppeltAus so um in "verdoppele",
     *     dass es die Werte dauerhaft im Array verdoppelt
     *     (aber nicht mehr auf dem Bildschirm ausgibt)
     */
    public void verdoppele(int[] a) {
        int zaehler = 0;

        while (zaehler < a.length) {
            a[zaehler] = a[zaehler] * 2;
            zaehler = zaehler + 1;
        }
    }

    
    // Rückgabetyp ist Integer
    public int potenziereZwei(int exponent) {
        int ergebnis = 1;
        int zaehler = 0;

        while (zaehler < exponent) {
            ergebnis = ergebnis * 2;
            zaehler = zaehler + 1;
        }

        // Wert, der zurückgegeben wird
        return ergebnis;
    }

    
    /*
     * Hausaufgaben vom 22.02.23
     * 1. Ersetze alle while-Schleifen in dieser Datei durch for-Schleifen
     * 2. Programmieren Sie eine Methode, in der 100 zufällige Zahlen in einem
     *    Array gespeichert sind. Zahlen zwischen 0 und 1000; 
     */
}
