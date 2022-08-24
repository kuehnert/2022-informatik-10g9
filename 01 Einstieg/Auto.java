public class Auto {
    // Variablen
    private String hersteller; // z.B. VW, Volvo, BMW
    private String modell;     // z.B. Golf, M3
    private String kennzeichen;
    private String farbe;
    private String motor;

    // Funktionen
    public void hupe() {
        System.out.println(kennzeichen + ": Huuuuuuuuuuup!");
    }

    // Setter-Methoden
    // Helfen, Daten in ein Objekt hineinzubekommen
    // f(x) = 2x
    // f(3) = 2*3 = 6
    public void setHersteller(String neuerHersteller) {
        // Wertezuweisung 
        // <VAR> = <Wert>
        // Setze den Wert von <hersteller> auf
        // den Wert von Parameter <neuerHersteller>
        hersteller = neuerHersteller;
    }

    public void setModell(String neuesModell) {
        modell = neuesModell;
    }

    public void setKennzeichen(String neuesKennzeichen) {
        kennzeichen = neuesKennzeichen;

    }
}
