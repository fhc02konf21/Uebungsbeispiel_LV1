public class RechteckDemo {

    public static void main(String[] args) {
        // Variablendeklaration
        int breite = 2;
        int laenge = 3;
        int umfang;
        int flaeche;

        umfang = breite * 2 + laenge * 2; // Berechnung Umfang
        flaeche= breite * laenge; // Berechnung Fläche

        System.out.println("umfang = " + umfang);
        System.out.println("flaeche = " + flaeche);

        // Eine andere Möglichkeite "umfang" oder "flaeche" zu deklarieren inkl. Initialisierung
        int umfang2 = breite * 2 + laenge * 2;
        int flaeche2 = breite * laenge;
    }
}
