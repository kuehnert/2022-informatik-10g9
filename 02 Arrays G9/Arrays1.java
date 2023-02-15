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
        gibArrayAus(zahlen);

        System.out.println("Taras Zahlen: ");
        int[] zweitesArray = new int[]{10, 15, 3};

        gibArrayAus(zweitesArray);
        verdoppele(zweitesArray);
        gibArrayAus(zweitesArray);
        verdoppele(zweitesArray);
        gibArrayAus(zweitesArray);

        int[] drittesArray = new int[]{};
        gibArrayAus(drittesArray);
    }

    public void testeGibAus2() {
        int[] zahlen = new int[]{2, 333, 5, 711, 2, 6, 20, 1};
        gibArrayAus2(zahlen);
    }

    // Mathe-Funktion: f(x) = x^2 + 1
    // g(x)
    // f'(x)
    public void gibArrayAus(int[] a) {
        if (a.length == 0) {
            System.out.println("Ungueltiges Array!");
        } else {
            // Gib mithilfe eines Zählers und einer
            // while-Schleife nacheinander jedes Element
            // des Arrays aus

            int zaehler = 0;
            while (zaehler < a.length - 1) {
                System.out.print( a[zaehler] + ", ");
                zaehler = zaehler + 1;
            }

            System.out.println(a[a.length - 1]);
        }
    }

    /*
     *       |0|1|2|3| 
     *       ---------
     *       |2|3|5|7|
     */
    // 1. Horizontale Linie verlängern
    // 2. 
    public void druckeZahl(int zahl) {
        // Drucke zahl auf drei Stellen rechtsbündig
        // 7 -> |__7|
        // 321 -> |321|
        if (zahl < 10) {
            // zahl ist einstellig, fülle mit 2x " " auf
            System.out.print("  " + zahl);
        } else if (zahl < 100) {
            // sonst: zahl ist zweistellig
            System.out.print(" " + zahl);
        } else {
            // sonst: zahl ist dreistellig
            System.out.print(zahl);
        } 
    }

    public void gibArrayAus2(int[] a) {
        // 1. Drucke Indizes
        int zaehler = 0;
        System.out.print("| ");
        while (zaehler < a.length) {
            druckeZahl(zaehler);
            System.out.print(" | ");
            zaehler = zaehler + 1;
        }
        System.out.println();

        // 2. Drucke Linie
        System.out.print("|-");
        zaehler = 0;
        while (zaehler < a.length) {
            System.out.print("---");
            System.out.print("-+-");
            zaehler = zaehler + 1;
        }
        System.out.println();
        // System.out.println("-".repeat(a.length * 6));

        // 3. Drucke Elemente
        System.out.print("| ");
        zaehler = 0;
        while (zaehler < a.length) {
            druckeZahl( a[zaehler] );
            System.out.print(" | ");
            zaehler = zaehler + 1;
        }

        System.out.println();

        /*
        System.out.println("┌─┬─┐");
        System.out.println("│ │ │");
        System.out.println("├─┼─┤");
        System.out.println("│ │ │");
        System.out.println("└─┴─┘");
         */
    }

    /*
     * Hausaufgabe:
     * Schreibe eine Methode, die alle Werte in einem Array
     * verdoppelt ausgibt
     */
    public void gibArrayVerdoppeltAus(int[] a) {
        int zaehler = 0;

        while (zaehler < a.length) {
            System.out.println( a[zaehler] * 2 );
            zaehler = zaehler + 1;
        }
    }

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

    // Erstellen Sie ein Array mit 100 Elementen
    // Füllen Sie es mit der 7er-Reihe
    // 0   1   2 ...  99
    // 7  14  21 ... 700
    public void arrayErzeugen1() {
        int[] reihe = new int[100];

        int zaehler = 0;
        while (zaehler < reihe.length) {
            // reihe[0] = 7;
            // reihe[1] = 14;
            // reihe[2] = 21;
            reihe[zaehler] = (zaehler + 1) * 7;

            zaehler = zaehler + 1;
        }

        gibArrayAus2(reihe);
    }
}
