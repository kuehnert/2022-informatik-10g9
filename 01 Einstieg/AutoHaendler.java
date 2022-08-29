public class AutoHaendler {
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;
    
    public void main() {
        System.out.println("Willkommen bei Kühnert's Karren");
        auto1 = new Auto();
        auto1.setHersteller("VW");
        auto1.setModell("Golf");
        auto1.setKennzeichen("LEV MS-0");
        // auto1.hupe();
        auto1.druckeSchild();
    }
}
