package variables;

import java.nio.channels.ScatteringByteChannel;
import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // wprowadzam liczbę
        System.out.println("Wprowadź liczbę całkowitą: ");
        //scanner.useLocale(Locale.US); -> używamy jak chcemy wprowadzić kropkę zamiast przecinka
        double number = scanner.nextDouble(); // ENTER -> \n
        // aby skonsumować ENTER wykonujemy metodę nextLine()
        scanner.nextLine();
        //wprowadzam napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %f i %s", number, text);

        // zamknięcie połączenia
        scanner.close();
    }
}
