public class Arrays1 {
    /*
     * Ein Array speichert mehrere Werte eines Datentyps
     * 
     */
    public void arrays1() {
        // Deklaration
        int zahl;
        int[] zahlen;
        
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
        gibArrayAus(zahlen);

        System.out.println("Taras Zahlen: ");
        int[] zweitesArray = new int[]{10, 15, 3};
        gibArrayAus(zweitesArray);
    }
    

    public void gibArrayAus(int[] a) {
        // Gib mithilfe eines Zählers und einer
        // while-Schleife nacheinander jedes Element
        // des Arrays aus

        int zaehler = 0;
        while (zaehler < a.length) {
            System.out.println( a[zaehler] );
            zaehler = zaehler + 1;
        }
    }
    
    /*
     * Hausaufgabe:
     * Schreibe eine Methode, die alle Werte in einem Array
     * verdoppelt ausgibt
     */
    
    
    
    
}
