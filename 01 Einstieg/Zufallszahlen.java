import java.util.Random;

public class Zufallszahlen {
    public void qualitaet1() {
        int ANZAHL = 1_000_000;
        Random generator = new Random();
        int einsen = 0, zweien = 0, dreien = 0;
        int vieren = 0, fuenfen = 0, sechsen = 0;
        int zaehler = 0;

        // Würfle ANZAHL Mal 
        while (zaehler < ANZAHL) {
            int gewuerfelt = generator.nextInt(6) + 1;

            // System.out.println(gewuerfelt);
            if (gewuerfelt == 1) {
                einsen = einsen + 1;
            } else if (gewuerfelt == 2) {
                zweien = zweien + 1;
            } else if (gewuerfelt == 3) {
                dreien = dreien + 1;
            } else if (gewuerfelt == 4) {
                vieren = vieren + 1;
            } else if (gewuerfelt == 5) {
                fuenfen = fuenfen + 1;
            } else {
                sechsen = sechsen + 1;
            }

            zaehler = zaehler + 1;
        }

        System.out.println("Fertig");

        double p1 = 100.0 * einsen / ANZAHL;
        double p2 = 100.0 * zweien/ ANZAHL;
        double p3 = 100.0 * dreien / ANZAHL;
        double p4 = 100.0 * vieren / ANZAHL;
        double p5 = 100.0 * fuenfen / ANZAHL;
        double p6 = 100.0 * sechsen / ANZAHL;

        String s1 = String.format("%.1f", p1);
        String s2 = String.format("%.1f", p2);
        String s3 = String.format("%.1f", p3);
        String s4 = String.format("%.1f", p4);
        String s5 = String.format("%.1f", p5);
        String s6 = String.format("%.1f", p6);
        
        System.out.println("1er: " + einsen + " (" + s1 + "%)");
        System.out.println("2er: " + zweien + " (" + s2 + "%)");
        System.out.println("3er: " + dreien + " (" + s3 + "%)");
        System.out.println("4er: " + vieren + " (" + s4 + "%)");
        System.out.println("5er: " + fuenfen + " (" + s5 + "%)");
        System.out.println("6er: " + sechsen + " (" + s6 + "%)");

    }
}
