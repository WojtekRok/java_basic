package java_introduction;
// CTRL + / -> tak dodajemy komentarz
// CTRL + SHIFT + SLASH -> komentarz blokowy
// psvm  -> public static void main(String[] args) {
// sout  -> System.out.println();
// CTRL + D  -> duplikowanie lini
public class Introduction {
    // metoda uruchomieniowa -> automatycznie wywoływana jako pierwsza w trakcie uruchomienia projektu
    public static void main(String[] args) {
        // Polecenie wypisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello World!");
        // pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        //  pobranie numeru wersji JDK
        System.out.println(System.getProperty("java.version"));

        // typy danych
        int myFirstNumber = 5040;
        System.out.println("myFirstNumber = " + myFirstNumber);
        // byte mySmallNumber = 130; błąd, bo zakres przekroczony (od -128 do 127 w przypadku byte)
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
        System.out.println("Odejmowanie liczb: " + (100 - myFirstNumber));
        System.out.println("Dzielenie liczb: " + (100 / myFirstNumber));
        System.out.println("Mnożenie liczb: " + (100 * myFirstNumber));
        double salaryNet = 9000.59;
        int vatTax = 23;
        System.out.println("Kwota netto: " + salaryNet + "zł");
        System.out.println("Kwota brutto: " + (salaryNet * ((1 + (vatTax/100.0)))) + " zł");
        //formatowanie wyjścia
        // \n -> new line
        System.out.printf("Kwota brutto: %.2f zł\n", (salaryNet* (1 + (vatTax/100.0))));
        System.out.printf("%.2fzł netto to %.2f zł brutto\n", salaryNet, salaryNet + (1 + (vatTax/100.0)));
        System.out.printf("Liczba: %40.2f\n", salaryNet);

        char smallLetter = 'a';
        char bigLetter = 'A';
        char spaceBar = ' ';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char)(bigLetter + 10));
        System.out.printf("Wypisz ten znak z formatowaniem: %c\n", dotChar);
        System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);
    }
}
