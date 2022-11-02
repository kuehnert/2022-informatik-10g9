import java.util.Scanner;

public class Kommazahlen {
    public static void ausgeben() {
        // 1. Deklaration (in Mathe: Definition)
        // Wir benötigen eine Variable vom Typ
        // <Datentyp>, welche die Bezeichnung <Variablenname>
        // "Bekanntmachung"
        // Format: <Datentyp> <Variablenname>;
        // Beispiele: 
        //     int ganzzahl;
        //     String freundin;
        double kommazahl;

        // 2. Initialisierung = Erstzuweisung
        // Eine Variable bekommt ihren Ursprungswert 
        // zugewiesen. Notwendig!
        // Format: <Variablenname> = <Ausdruck> 
        kommazahl = 1.0 / 3.0 * 2 * 3.0 * 0.333333333333 * 3.0;

        // 3. Ausgabe
        System.out.println(kommazahl); // Unschön
        System.out.printf("%f   %n", kommazahl); 
        System.out.printf("%.5f %n", kommazahl); 
        System.out.printf("%.2f %n", kommazahl); 
    }

    public static void eingeben() {
        // Import nicht vergessen!
        Scanner s = new Scanner(System.in);

        System.out.print("Gib eine Kommazahl ein: ");
        String eingabe = s.nextLine();
        double zahl = Double.parseDouble(eingabe);
        System.out.printf("%.5f %n", zahl); 
    }

    public static void rechnen() {
        Scanner tastatur = new Scanner(System.in);
        double zahl1;
        double zahl2;

        // 1. Lies zwei Kommazahlen ein
        System.out.print("Eine Kommazahl: ");
        zahl1 = tastatur.nextDouble();

        System.out.print("Eine 2. Kommazahl: ");
        zahl2 = tastatur.nextDouble();

        // 2. Gib vier Ergebnisse aus:
        //    - Addiere sie
        //    - Subtrahiere sie
        //    - Multiplizierte sie
        //    - Dividiere sie
        double summe = zahl1 + zahl2;
        double differenz = zahl1 - zahl2;
        double produkt = zahl1 * zahl2;
        double quotient = zahl1 / zahl2;

        System.out.println(zahl1 + " + " + zahl2 + " = " + summe);
        // %f -> Platzhalter für eine Kommazahl
        // %n -> Platzhalter für einen Zeilenumbruch
        System.out.printf("%.2f + %.2f = %.2f%n", zahl1, zahl2, summe);
        System.out.printf("%.2f - %.2f = %.2f%n", zahl1, zahl2, differenz);
        System.out.printf("%.2f * %.2f = %.2f%n", zahl1, zahl2, produkt);
        System.out.printf("%.2f / %.2f = %.2f%n", zahl1, zahl2, quotient);
    }

    // Hausaufgaben:
    // Weltbevoelkerung. Im Jahr 2021 lebten auf der Erde
    // ca. 7.948.119.000 Menschen. Wenn jährlich die Zahl
    // um 1,23% wächst, wie viele Menschen leben dann wohl
    // 2022, 2023, ..., 2031 auf der Welt?
    // Schreiben Sie eine Funktion, die diese Frage
    // beantwortet.
    public static void weltbevoelkerung() {
        int jahr = 2021;
        double bevoelkerung = 7.948119; // Mrd.
        double zuwachs = 66_000_000.0 / 1_000_000_000.0;
        double wachstum = 1.0 + zuwachs / bevoelkerung;
        // double wachstum = 1.02; // 2%
        System.out.printf("Wachstum: %.4f %n", wachstum);
        System.out.printf("Bevölkerung in %d: %.4f Mrd.%n", jahr, bevoelkerung);

        while (jahr < 2102) {
            bevoelkerung = bevoelkerung * wachstum;
            jahr = jahr + 1;
            System.out.printf("Bevölkerung in %d: %.4f Mrd.%n", jahr, bevoelkerung);
        }
    }
}