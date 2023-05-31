/*
 * Eingabe
 *     5   => five
 *    12   => twelve
 *    64   => sixty-four
 *   122   => one hundred twenty-two
 *  2784   => 
 */
public class Zahlwoerter {
    String[] THOUSANDS = {"", " thousand", " million", " billion"};
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

        String ausgabe = "";
        // Hunderter
        int hundred = zahl / 100 % 10;
        int vorletzteZiffer = zahl / 10 % 10;
        int letzteZiffer = zahl % 10;
        // 1711 => 7
        // 8 => 0
        // 1077 => 0
        // 453624523647 => 6
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

        return ausgabe;
    }
}