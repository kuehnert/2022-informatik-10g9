public class ArrayTests {
    private ArrayGeneratoren generator; // Deklaration
    private ArrayWerkzeuge werkzeuge;

    // Konstruktor
    public ArrayTests() {
        System.out.println("Konstruktor wird aufgerufen");
        generator = new ArrayGeneratoren(); // Initialisierung
        werkzeuge = new ArrayWerkzeuge();
    }

    public void testeArrayErzeugen() {
        System.out.println("testeArrayErzeugen()");
        // Hausaufgabe 20.03.23:
        // 1. Erstelle einen generator vom Typ ArrayGeneratoren

        // 2. Rufe gen.arrayErzeugen1() auf
        int[] fritz  = generator.arrayErzeugen1(7, 8);
        int[] hans   = generator.arrayErzeugen1(5, 6);
        int[] willi  = generator.arrayErzeugen1(9, 7);

        // 3. Verwende gibArrayAus aus ArrayWerkzeuge 
        // um es auf dem Bildschirm auszugeben
        werkzeuge.gibArrayAus( fritz );
        werkzeuge.gibArrayAus( hans  );
        werkzeuge.gibArrayAus( willi );
    }

    public void testeArrayErzeugen2() {
        System.out.println("testeArrayErzeugen2()");
        // Erzeuge drei Arrays mit 
        // arrayErzeugen2, arrayErzeugen3 & arrayErzeugen3c
        int[] a1 = generator.arrayErzeugen2(10);
        int[] a2 = generator.arrayErzeugen3(10);
        int[] a3 = generator.arrayErzeugen3c(10);

        // speichere sie als a1, a2, a3
        // und gib sie als Tabelle
        werkzeuge.gibArrayAusTab(a1);
        werkzeuge.gibArrayAusTab(a2);
        werkzeuge.gibArrayAusTab(a3);        
    }
}
