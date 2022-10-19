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

    private void druckeTicket() {
        System.out.println("/\\ 1 Ticket /\\ \n");
        System.out.println(" .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.");
        System.out.println(" / /\\/ /           A large frame border based on          \\ \\/ /\\");
        System.out.println("/ /\\ \\/                                                    \\ \\/\\ \\");
        System.out.println("\\ \\/\\ \\                  celtic knots ...                  /\\ \\/ /");
        System.out.println("\\ \\/\\ \\.--..--..--..--..--..--..--..--..--..--..--..--..--./\\ \\/ /");
        System.out.println(" `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'");
    }

    private void druckeTickets() {
        int gedruckt = 0;

        while (gedruckt < ticketAnzahl) {
            druckeTicket();
            gedruckt = gedruckt + 1;
        }
    }

    private void waehleAnzahl() {
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

    private void gibRueckgeld() {
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

    private void nimmGeldAn() {
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
            // Vergleich mit ==
            // Oder mit || (AltGr + <)
            if (geldstueck == 1 || geldstueck == 2
                || geldstueck == 5 || geldstueck == 10 
                || geldstueck == 20 || geldstueck == 50 )  {
                // Zuweisung mit =
                restbetrag = restbetrag - geldstueck;
            } else {
                System.out.println("Fehler: Ungueltiges Zahlungsmittel");
            }

        }

        System.out.println("Danke. Genuegend Geld vorhanden.");
    }

    private void begruesse() {
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
