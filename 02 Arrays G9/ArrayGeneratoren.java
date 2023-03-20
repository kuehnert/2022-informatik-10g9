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
}
