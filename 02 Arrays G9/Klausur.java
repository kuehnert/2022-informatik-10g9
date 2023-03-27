import java.util.Random;

public class Klausur {
    public void a1() {
        {
            int z = 0;
            while (z < 10) {
                System.out.print(z + " ");
                z = z + 2;
            }
        }

        for (int z = 0; z < 10; z = z + 2) {
            System.out.print(z + " ");
        }

        int i = 10;
        while (i > 0) {
            System.out.print("# ");
            i = i - 1;
        }
    }

    public int[] zufallszahlen(int anzahl) {
        Random generator = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i = i + 1) {
            a[i] = generator.nextInt(5);
        }
        
        return a;
    }
}
