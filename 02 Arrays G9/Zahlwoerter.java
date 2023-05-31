/*
 * Eingabe
 *     5   => five
 *    12   => twelve
 *    64   => sixty-four
 *   122   => one hundred twenty-two
 *  2784   => 
 */
public class Zahlwoerter {
    String[] THOUSANDS = {" ", " thousand ", " million ", " billion "};
    String[] DECADE_WORDS = { null, null, "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};
    String[] NUMBER_WORDS = {"", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    // 74.074.074.074
    public String zahlAufEnglisch(int zahl) {
        if (zahl == 0) {
            return "nought";
        }

        String gesamtAusgabe = "";
        int thousands = 0;

        while (zahl > 0) {
            // Kümmere Dich um die letzten drei Ziffern
            // Hunderter
            int hundred = zahl / 100 % 10;
            int vorletzteZiffer = zahl / 10 % 10;
            int letzteZiffer = zahl % 10;
            int letzteDrei = zahl % 1000;
            String ausgabe = "";

            if (hundred > 0) {
                // ausgabe = ausgabe + ...
                ausgabe += NUMBER_WORDS[hundred] + " hundred ";
            }

            if (vorletzteZiffer < 2) {
                ausgabe += NUMBER_WORDS[zahl % 100];
            } else {
                String letzteZifferStr = NUMBER_WORDS[letzteZiffer];

                ausgabe += DECADE_WORDS[vorletzteZiffer] + "-" + letzteZifferStr; 
            }

            if (letzteDrei > 0) {
                gesamtAusgabe = ausgabe + THOUSANDS[thousands] + gesamtAusgabe; 
            }

            zahl = zahl / 1000;
            thousands += 1;
        }
        return gesamtAusgabe;
    }
}