public class ArrayWerkzeuge {
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

    public void gibArrayAusTab(int[] a) {
        // 1. Drucke Indizes
        int zaehler = 0;
        System.out.print("│ ");
        while (zaehler < a.length) {
            druckeZahl(zaehler);
            System.out.print(" │ ");
            zaehler = zaehler + 1;
        }
        System.out.println();

        // 2. Drucke Linie
        System.out.print("├─");
        zaehler = 0;
        while (zaehler < a.length - 1) {
            System.out.print("───");
            System.out.print("─┼─");
            zaehler = zaehler + 1;
        }
        System.out.println("────┤");
        // System.out.println("-".repeat(a.length * 6));

        // 3. Drucke Elemente
        System.out.print("│ ");
        zaehler = 0;
        while (zaehler < a.length) {
            druckeZahl( a[zaehler] );
            System.out.print(" │ ");
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
    
    
}
