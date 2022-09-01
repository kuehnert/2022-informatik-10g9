public class AutoHaendler {
    // Variablen
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;
    private Auto auto4;

    public void hauptprogramm() {
        System.out.println("Willkommen bei Kühnert's Karren");
         
        // auto1 einrichten
        auto1 = new Auto();
        auto1.setHersteller("VW");
        auto1.setModell("Golf");
        auto1.setKennzeichen("LEV MS-0");

        // auto2 einrichten
        auto2 = new Auto();
        auto2.setHersteller("Merc");
        auto2.setModell("XPS");
        auto2.setKennzeichen("LEV K-1");

        // auto3 einrichten
        auto3 = new Auto();
        auto3.setHersteller("Tesla");
        auto3.setModell("Modell S");
        auto3.setKennzeichen("LEV T-1");

        // auto4 einrichten
        auto4 = new Auto();
        auto4.setHersteller("Fiat");
        auto4.setModell("500");
        auto4.setKennzeichen("LEV F-123");
        
        // Aktionen
        auto1.druckeSchild();
        auto2.druckeSchild();
        auto3.druckeSchild();
        auto4.druckeSchild();
    }
}
