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
    // Wenn Du bei eins angekommen bist, bist Du fertig
    // Schlage auf eine Schildkröte mit einem dicken Hammer
    // Zähle die Schritte, die notwendig sind, um zu 1 zu gelangen
    public static void aufgabeTara() {
        int zahl = 3;

        while (false || true) {
            if (false || true) {
                // Foo
            } else {
                // Bar
            }
        }
    }
    // Unser erstes Spiel!!!

}
