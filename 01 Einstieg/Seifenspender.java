public class Seifenspender {
    // Variablen
    private int inhalt;
    private int kapazitaet;
    private int ausgabemenge;
    private String seifenart;
    
    // Funktionen
    public Seifenspender() {
        // Konstruktor
        // 1. Kein void
        // 2. Heißt genau so wie die Klasse
        // 3. Wird automatisch beim Erzeugen eines Objekts
        //    ausgeführt
        kapazitaet = 200;
        ausgabemenge = 67;
        seifenart = "Lavendel";
        inhalt = 4 * ausgabemenge;
    }
    
    public void spenden() {
        // Subtrahiere <ausgabemenge> von <inhalt>
        // Und speichere das Ergebnis in <inhalt>
        inhalt = inhalt - ausgabemenge;
        System.out.println("Hier sind " + ausgabemenge + "ml Seife.");
        
    }
    
    public void nachfuellen() {
        
    }
    
    public void druckeStatus() {
        
    }
    
    public void setInhalt(int neuerInhalt) {
        inhalt = neuerInhalt;
    }
}