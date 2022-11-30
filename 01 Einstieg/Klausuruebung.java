import java.util.Scanner;

public class Klausuruebung {
    public static void wasmachtdas( ) {
        int zahl = 1;
        int quadrat = 1;

        while (quadrat < 10000) {
            quadrat = zahl * zahl;
            System.out.print(quadrat + " ");
            zahl = zahl + 1;
        }
    }

    public static void kommentiereNote(int note, String name) {
        System.out.print("Das war ");
        if (note == 1) {
            System.out.print("sehr gut (1)");
        } else if (note == 2) {
            System.out.print("gut (2)");
        } else if (note == 3) {
            System.out.print("befriedigend (3)");
        } else if (note == 4) {
            System.out.print("ausreichend (4)");
        } else if (note == 5) {
            System.out.print("mangelhaft (5)");
        } else {
            System.out.print("ungenügend (6)");
        }

        System.out.println(", " + name + "!");
    }

    public static void groesse() {
        Scanner t = new Scanner(System.in);
        System.out.print("Geschlecht (1=m, 2=w, 3=divers)? ");
        int sex = t.nextInt();
        System.out.print("Groesse in cm? ");
        int cm = t.nextInt();
        String wort;
        int ds = 180;

        if (sex == 2) {
            ds = 166;
        } else if (sex == 3) {
            ds = 172;
        }

        if (cm < ds) {
            wort = "kleiner als";
        } else if (cm == ds) {
            wort = "genau so gross wie";
        }else {
            wort = "groesser als";
        }

        System.out.println("Du bist " + wort + " der DS");
    }

    // Fuer JDoodle.com, wenn kein BlueJ zur Verfuegung steht
    public static void main(String args[]) {
        groesse();
    }

    

}