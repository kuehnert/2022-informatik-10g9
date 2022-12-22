public class Binaerzahlen {
    public static void decimalToBinary1(int wert) {
        String ausgabe = "";
        int dezimal = wert;
        // 57 => 57 - 32 + 25 - 16 + 9
        // 128 64 32 16 8 4 2 1
        //   0  0  1  1 1 0 0 1
        if (dezimal >= 128) {
            // Das 128-Bit ist 1, sonst 0
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 128;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 64) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 64;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 32) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 32;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 16) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 16;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 8) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 8;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 4) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 4;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 2) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 2;
        } else {
            ausgabe = ausgabe + "0";
        }

        if (dezimal >= 1) {
            ausgabe = ausgabe + "1";
            dezimal = dezimal - 1;
        } else {
            ausgabe = ausgabe + "0";
        }

        System.out.println(wert + "(10) => " + ausgabe + "(2) dTB1");
    }

    public static void decimalToBinary2(int dezimal) {
        String ausgabe = "";
        int stelle = 128;        

        while (stelle >= 1) {
            if (dezimal >= stelle) {
                // Das 128-Bit ist 1, sonst 0
                ausgabe = ausgabe + "1";
                dezimal = dezimal - stelle;
            } else {
                ausgabe = ausgabe + "0";
            }

            stelle = stelle /2;
        }

        decimalToBinary1(dezimal);
        System.out.println(dezimal + "(10) => " + ausgabe + "(2) dTB2");
    }
}
