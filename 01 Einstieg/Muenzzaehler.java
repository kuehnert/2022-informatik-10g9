public class Muenzzaehler {
    private int anz10Cent, anz20Cent, anz50Cent, anz1Euro, anz2Euro;
    private double gesamtwert;

    // Wird beim Erzeugen von
    // new Muenzzaehler() automatisch ausgeführt
    public Muenzzaehler() {
        anz10Cent = 0;
        anz20Cent = 0;
        anz50Cent = 0;
        anz1Euro  = 0;
        anz2Euro  = 0;
        gesamtwert = 0.0;
    }

    public void wirfMuenzeEin(int wert) {
        System.out.println("Eingeworfen: "  + wert);
        if (wert == 10) {
            anz10Cent = anz10Cent + 1;
        } else if (wert == 20) {
            anz20Cent = anz20Cent + 1;
        } else if (wert == 50) {
            anz50Cent = anz50Cent + 1;
        } else if (wert == 100) {
            anz1Euro = anz1Euro + 1;
        } else if (wert == 200) {
            anz2Euro = anz2Euro + 1;
        } else {
            System.out.println("Ungueltiger Betrag!");
        }
    }

    public void druckeUebersicht() {
        double gesamt10Cent = anz10Cent * 0.10;
        double gesamt20Cent = anz20Cent * 0.20;
        double gesamt50Cent = anz50Cent * 0.50;
        double gesamt1Euro = anz1Euro * 1.0;
        double gesamt2Euro = anz2Euro * 2.0;
        double gesamt = gesamt10Cent + gesamt20Cent + gesamt50Cent + gesamt1Euro + gesamt2Euro;
        System.out.println("Folgendes ist enthalten:");
        System.out.println("10 Cent * " + anz10Cent + " = " + gesamt10Cent + " €");
        System.out.println("20 Cent * " + anz20Cent + " = " + gesamt20Cent + " €");
        System.out.println("50 Cent * " + anz50Cent + " = " + gesamt50Cent + " €");
        System.out.println(" 1 Euro * " + anz1Euro + " = " + gesamt1Euro + " €");
        System.out.println(" 2 Euro * " + anz2Euro + " = " + gesamt2Euro + " €");
        System.out.println("Insgesamt: " + gesamt + " €");
    }
}
