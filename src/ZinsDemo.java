public class ZinsDemo {

    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;

        double erhalteneZinsen = kontostand * zinsen / 100;
        System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + erhalteneZinsen);

        kontostand = 2000;
        zinsen = 3;
        erhalteneZinsen = berechneZinsen(kontostand, zinsen); // rufe "berechneZinsen" auf und speichere Rückgabewert in "erhalteneZinsen"
        printZinsen(kontostand, zinsen, erhalteneZinsen);

        kontostand = 3000.90;
        zinsen = 1.5;
        printZinsen(kontostand, zinsen, berechneZinsen(kontostand, zinsen)); // rufe "berechneZinsen" auf und übergebe Rückgabewert an "printZinsen"
    }

    /**
     * Berechnung der Zinsen aufgrund des Kontostands und des Zinssatzes
     *
     * @param kontostand aktueller Kontostand
     * @param zinsen     Zinssatz
     * @return erhaltene Zinsen
     */
    public static double berechneZinsen(double kontostand, double zinsen) {
        // 1: Möglichkeit
        //double erhalteneZinsen = kontostand * zinsen / 100;
        //return erhalteneZinsen;

        // 2: Möglichkeit
        return kontostand * zinsen / 100;
    }

    /**
     * Schreibe die Werte in die Konsole
     *
     * @param kontostand      aktueller Kontostand
     * @param zinsen          Zinssatz
     * @param erhalteneZinsen erhaltene Zinsen aufgrund von Kontostand und Zinssatz
     */
    public static void printZinsen(double kontostand, double zinsen, double erhalteneZinsen) {
        System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + erhalteneZinsen);
    }

}
