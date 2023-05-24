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

    public void testeZufallszahlen() {
        System.out.println("testeZufallszahlen()");
        int[] a = generator.zufallszahlen(10, 2000);
        int[] b = generator.zufallszahlen(7, 50);

        // und gib sie als Tabelle
        werkzeuge.gibArrayAusTab(a);
        werkzeuge.gibArrayAusTab(b);

        System.out.println("fvdf");
    }

    public void testeZufallszahlenAufsteigend() {
        System.out.println("testeZufallszahlenAufsteigend()");
        int[] a = generator.zufallszahlenAufsteigend(10);
        int[] b = generator.zufallszahlenAufsteigend(7);

        // und gib sie als Tabelle
        werkzeuge.gibArrayAusTab(a);
        werkzeuge.gibArrayAusTab(b);
    }

    public void testeEnglischezahlen() {
        Zahlwoerter zw = new Zahlwoerter();
        System.out.println("one <=> " + zw.zahlAufEnglisch(1));
        System.out.println("twelve <=> " + zw.zahlAufEnglisch(12));
        System.out.println("zero <=> " + zw.zahlAufEnglisch(0));
        System.out.println("nine <=> " + zw.zahlAufEnglisch(9));
        System.out.println("five <=> " + zw.zahlAufEnglisch(5));
        System.out.println("fifteen <=> " + zw.zahlAufEnglisch(15));
        System.out.println("eighteen <=> " + zw.zahlAufEnglisch(18));
        System.out.println("twenty-one <=> " + zw.zahlAufEnglisch(21));
        System.out.println("twenty-nine <=> " + zw.zahlAufEnglisch(29));

        System.out.println("thirty <=> " + zw.zahlAufEnglisch(30));

        System.out.println("one hundred fifteen <=> " + zw.zahlAufEnglisch(115));
    }

}
