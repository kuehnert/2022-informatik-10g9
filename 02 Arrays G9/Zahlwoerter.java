/*
 * Eingabe
 *     5   => five
 *    12   => twelve
 *    64   => sixty-four
 *   122   => one hundred twenty-two
 *  2784   => 
 */
public class Zahlwoerter {
    String[] DECADE_WORDS = { null, null, "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};
    String[] NUMBER_WORDS = {"zero", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    public String zahlAufEnglisch(int zahl) {
        if (zahl <= 20) {
            return NUMBER_WORDS[zahl];
        } else if (zahl < 100) {
            int letzteZiffer = zahl % 10;
            int vorletzteZiffer = zahl / 10 % 10;
            String letzteZifferStr = NUMBER_WORDS[letzteZiffer];
    
            return DECADE_WORDS[vorletzteZiffer] + "-" + letzteZifferStr; 
        }
        
        return "BLUB";
    }
}