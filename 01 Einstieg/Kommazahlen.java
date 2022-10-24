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
        // 1. Lies zwei Kommazahlen ein
        // 2. Gib vier Ergebnisse aus:
        //    - Addiere sie
        //    - Subtrahiere sie
        //    - Multiplizierte sie
        //    - Dividiere sie
    }





}
