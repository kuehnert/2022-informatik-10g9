import java.util.Random;

public class Zufall {
    Random generator;

    public Zufall() {
        generator = new Random();
    }

    public void zufallszahlen() {
        // 0 <= zuffi < 10
        int zuffi = generator.nextInt(10);
        System.out.println(zuffi);
        
        // Wuerfel
        int wuerfel = generator.nextInt(6) + 1;
        System.out.println(wuerfel);
    }
    
    // Programmieren Sie folgende Würfel:
    // a) ein 20-seitiger Würfel (1-20)
    // b) ein Würfel von -10 bis +10 (einschliesslich)
    // c) ein Würfel von -10 bis +20 (einschliesslich)
    // d) zwei Sechseitige Würfel (2-12) Vorsicht!
    // e) drei sechsseitige Würfel (3-18) Vorsicht!
}
