import java.util.Scanner;

public class Ticketautomat {
    private Scanner tastatur;
    private int ticketAnzahl;
    private int ticketPreis;
    private int restbetrag;

    public Ticketautomat() {
        // Initialisierung
        tastatur = new Scanner(System.in);
        ticketAnzahl = -1;
        ticketPreis = 10;
        restbetrag = 0;
    }

    public void druckeTicket() {}

    public void druckeTickets() {}

    public void waehleAnzahl() {
        System.out.print("Wie viele Tickets? ");
        // Lies eine Zeile Text über Tastatur ein
        // und speichere Ergebnis in <eingabe>
        String eingabe = tastatur.nextLine();
        System.out.println("Deine Eingabe: '"+eingabe+"'");

        // Wandele <eingabe> in Zahl um
        ticketAnzahl = Integer.parseInt(eingabe);
        System.out.println("Du willst also " + ticketAnzahl + " Tickets.");
        restbetrag = ticketPreis * ticketAnzahl;
    }

    public void gibRueckgeld() {
        if (restbetrag <= -5) {
            System.out.println("Du bekommst " + (-restbetrag) + " € R.");
            System.out.println("Hier ist 5€");
            restbetrag = restbetrag + 5;
        }

        while (restbetrag <= -2) {
            System.out.println("Du bekommst " + (-restbetrag) + " € R.");
            System.out.println("Hier ist 2€");
            restbetrag = restbetrag + 2;
        }

        while (restbetrag < 0) {
            System.out.println("Du bekommst " + (-restbetrag) + " € R.");
            // TODO: Gib echte Geldmittel zurück
            //       17€ => 10€ + 5€ + 2€
            System.out.println("Hier ist 1€");
            restbetrag = restbetrag + 1;
        }
    }

    public void nimmGeldAn() {
        // Rechne/Gib den Restbetrag aus, den der Benutzer 
        // zahlen muss

        // Schleife (loop)
        while (restbetrag > 0) {
            System.out.println("Fehlend: " + restbetrag + " €.");

            // Lies mit der Tastatur ein, welches Geldstueck 
            // der Benutzer einfuettert
            System.out.print("Wirf ein Geldmittel ein: ");
            // Verrechne das mit dem offenen Betrag
            String eingabe = tastatur.nextLine();
            int geldstueck = Integer.parseInt(eingabe);
            
            // TODO: Nimm nur echte Geldmittel an
            // 2€ -> OK, 3€ Fehlermeldung
            restbetrag = restbetrag - geldstueck;

        }
        
        System.out.println("Danke. Genuegend Geld vorhanden.");
    }

    public void begruesse() {
        System.out.println("❤---------------------------👍");
        System.out.println("Willkomen bei Arnold Trains");
        System.out.println("Eine Fahrkarte kostet " + ticketPreis + " €.");
    }

    public void druckeMenu() {
        begruesse();
        waehleAnzahl();
        nimmGeldAn();
        gibRueckgeld();
        druckeTickets();
    }
}
