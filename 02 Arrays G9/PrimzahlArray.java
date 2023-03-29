public class PrimzahlArray {
    public void findePrimzahlen() {
        // Erstelle ein Array mit den Indizes von 0..100
        boolean[] zahlen = new boolean[101];
        // Alle Elemente sind false

        // Setze alle Werte auf true
        for (int i = 0; i < zahlen.length; i = i + 1) {
            zahlen[i] = true;
            // System.out.println(i + ": " + zahlen[i]);
        }

        // Fange bei 2 an, wenn zahlen an der Stelle 2
        // true ist, ist es eine Primzahl -> Gib sie aus
        // Markiere alle Vielfachen als "false"
        for (int zahl = 2; zahl < zahlen.length; zahl++) {
            if (zahlen[zahl] == true) {
                // Zahlen[zahl] ist eine Primzahl
                System.out.println(zahl);

                // Markiere alle Vielfachen als "false"
                for (int i = zahl * 2; i < zahlen.length; i += zahl) {
                    zahlen[i] = false; // grau durchstreichen
                }
            }
        }
    }
}
