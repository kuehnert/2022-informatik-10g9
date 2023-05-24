// Matthias Kuehnert
public class Seifenspender {
    // Variablen
    private int inhalt;
    private int kapazitaet;
    private int ausgabemenge;
    private String seifenart;
    // Wahrheitswert; ist entweder true (wahr) oder false (unwahr)
    private boolean eingeschaltet;

    // Funktionen
    public Seifenspender() {
        // Konstruktor
        // 1. Kein void
        // 2. Heißt genau so wie die Klasse
        // 3. Wird automatisch beim Erzeugen eines Objekts
        //    ausgeführt
        System.out.println("Ein neuer Seifenspender ist geboren");
        kapazitaet = 200;
        ausgabemenge = 67;
        seifenart = "Lavendel";
        setInhalt(5 * ausgabemenge);
        eingeschaltet = false;
    }

    public void spenden() {
        // Spende nur Seife, wenn das Gerät eingeschaltet ist
        if (eingeschaltet == true) {
            // Subtrahiere <ausgabemenge> von <inhalt>
            // Und speichere das Ergebnis in <inhalt>
            inhalt = inhalt - ausgabemenge;
            System.out.println("Hier sind " + ausgabemenge + "ml Seife.");
        } else {
            System.out.println("FEHLER: Gerät ist ausgeschaltet");
        }
    }

    public void setInhalt(int neuerInhalt) {
        // Wenn neuerInhalt hineinpasst
        // D.h. neuerInhalt ist kleiner-gleich Kapazität
        if (neuerInhalt <= kapazitaet) {
            // Setze inhalt auf neuerInhalt
            inhalt = neuerInhalt;
        } else {
            // Ansonsten: Setze inhalt auf das Maximum
            inhalt = kapazitaet;
        }

        System.out.println("Inhalt ist jetzt: " + inhalt + " ml");
    }

    public void nachfuellen() {
        setInhalt(kapazitaet);
    }

    public void druckeStatus() {

    }

    public void einschalten() {
        eingeschaltet = true;
        System.out.println("....");
        schlafe(2000); // Pausiere 2 Sekunden
        System.out.println("Der Spender ist jetzt ON.");
    }

    public void ausschalten() {
        eingeschaltet = false;
        System.out.println("Der Spender ist jetzt OFF.");
    }
    
    // ----------------------------
    private void schlafe(int sekunden) {
        try {
            Thread.sleep(1000 * sekunden); // Zeit in ms
        } catch (Exception e) {}
    }
}