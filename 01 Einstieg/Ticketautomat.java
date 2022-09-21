import java.util.Scanner;

public class Ticketautomat {
    private Scanner tastatur;
    private int ticketAnzahl;
    private int ticketPreis;
    private int guthaben;

    public Ticketautomat() {
        // Initialisierung
        tastatur = new Scanner(System.in);
        ticketAnzahl = -1;
        ticketPreis = 10;
        guthaben = 0;
    }
    
    public void druckeTicket() {}
    public void druckeTickets() {}
    
    public void waehleAnzahl() {
        System.out.print("Wie viele Tickets? ");
        String eingabe = tastatur.nextLine();
        System.out.println("Deine Eingabe: '"+eingabe+"'");
    }
    
    public void gibRueckgeld() {}
    public void nimmGeldAn() {}

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
