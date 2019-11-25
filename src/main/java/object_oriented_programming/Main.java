package object_oriented_programming;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// Klasa główna - uruchomieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie objektu
        User userOne = new User();
        // odwołanie do pola klasy
        userOne.name = "Michał";
        userOne.lastName = "Kruczkowski";
        userOne.activated = true;
        userOne.salary_net = 10100;
        userOne.gender = 'M';
        //wywołanie metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski",'M', false, 4000);
        userTwo.printUser();

        User userThree = new User("Anna", "Nowak",'K',true,8000);
        userThree.printUser();
        System.out.println("===================");
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross = " + salaryGross);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());
        System.out.println("==========================");
        System.out.println(userThree.modifyUserParameters(15000,true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię: ");
        String name = scanner.nextLine();
        System.out.println("Wprowadź nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Wprowadź płeć: ");
        char gender = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("Wprowadź pensję: ");
        double salary_net = scanner.nextDouble();
        User userFour = new User(name, lastName, gender, true, salary_net);
        userFour.printUser();
    }
}
