import java.util.Random;

public class Zufallszahlen {
    public void qualitaet1() {
        Random generator = new Random();
        int einsen = 0, zweien = 0, dreien = 0;
        int vieren = 0, fuenfen = 0, sechsen = 0;
        int zaehler = 0;

        // Würfle 100 Mal 
        while (zaehler < 100) {
            int gewuerfelt = generator.nextInt(6) + 1;

            System.out.println(gewuerfelt);
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
        System.out.println("Einsen: " + einsen);
    }
}
