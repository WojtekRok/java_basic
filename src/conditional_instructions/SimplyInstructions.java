package conditional_instructions;

import java.util.Scanner;

public class SimplyInstructions {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 0 && age <= 120) {
            System.out.println("CZLOWIEK - sprawdzam dalej");
            if (age >= 18) {
                System.out.println("CZLOWIEK dorosły");
            } else {
                System.out.println("Człowiek niepełnoletni");
            }
        } else {
            System.out.println("ROBOT");
        }
        //sprawdź czy liczba podana przez użytkownika jest parzysta
        // jeśli tak wypisz parzysta
        // jeśli nie wypisz nieparzysta
        // jeśli zero wypisz zero
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbę: ");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("ZERO");
        } else if (number % 2 == 0) {
            System.out.println("PARZYSTA");
        } else {
            System.out.println("NIEPARZYSTA");
        }


    }
}
