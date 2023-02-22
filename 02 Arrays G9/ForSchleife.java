public class ForSchleife {
    public void schleife1() {
        int zaehler = 0;
        
        while (zaehler < 50) {
            System.out.print(".");
            zaehler = zaehler + 1;
        }
        
        System.out.println();
    }

    public void schleife2() {
        for (int zaehler = 0; zaehler < 50; zaehler = zaehler + 1) {
            System.out.print(".");
        }
        
        System.out.println();
    }
    
    public void uebung1() {
        int a = 10;
        int v = 0;
        
        while (a < 100) {
            v = v + a;
            a = a + 10;
        }
        
        System.out.println(v);
    }

    public void uebung2() {
        for (int z = 80; z > 0; z = z - 1) {
            System.out.print("#");
        }
        System.out.println();
    }
}
