package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.Scanner;

// Command Line Interface (CLI)
public class Main {
    public static void main(String[] args) {


        AutoController ac = new AutoController();
        // dodanie 3 aut do zamówienia
        ac.addAuto("VW","Passat", Engine.v1_9, Fuel.diesel, 120000);
        ac.addAuto("VW","Golf", Engine.v1_9, Fuel.diesel, 90000);
        ac.addAuto("VW", "Tiguan", Engine.v3_0, Fuel.hybrid, 180000);
        // wypisz listę aut
        ac.printAllAutos();
        // usuń auto
        System.out.println("Usunięto: " + ac.deleteAutoById(2));
        ac.printAllAutos();
        // daj rabat 10% dla auta 1
        System.out.println("Obniżona cena: " + ac.discountAutoById(1,10));
        // podnieś cenę wszystkich aut o 5%
        // SKOPIUJ Z GITA

        // dodajemy GUI użytkownika
        Scanner scanner = new Scanner(System.in);
        int decision = ' ';
        // iterujemy dopóki nie wybrano Q
        while (decision != 'Q'){
            System.out.println("PANEL FABRYKI AUT");
            System.out.println("(Z) - zamów auto");
            System.out.println("(P) - pokaż listę zamówionych aut");
            System.out.println("(U) - usuń auto");
            System.out.println("(R) - daj rabat na auto");
            System.out.println("(C) - zmień cenę wszystkich aut");
            System.out.println("(Q) - wyjście");
            decision = scanner.nextLine().toUpperCase().charAt(0);
            switch(decision){
                case 'Z':
                    break;
                case 'P':
                    ac.printAllAutos();
                case 'U':
                    System.out.println("Wybierz numer auta które chcesz usunąć:");
                    ac.printAllAutos();
                    int id = scanner.nextInt();
                    System.out.println("Usunięto: " + ac.deleteAutoById(scanner.nextInt(id)));
                case 'R':
                    break;
                case 'C':
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                      break;
                default:
                    System.out.println("Błędny wybór");

            }
        }
    }
}
