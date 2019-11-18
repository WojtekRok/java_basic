package switch_case_instructions;

import conditional_instructions.Grade;

import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        // CLI -> command line interface
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjście");
        // pobieramy tylko jeden znak (charAt(0))
        char decision = scanner.nextLine().toUpperCase().charAt(0);

        switch (decision) {
            //case 'l':
            case 'L':
                System.out.println("logowanie");
                break;
            //case 'r':
            case 'R':
                System.out.println("rejestracja");
                break;
            //case 'q':
            case 'Q':
                System.out.println("wyjście");
                break;
            default:
                System.out.println("zły wybór");
                break;
        }*/
        Grade grade = Grade.niedostateczny;
        switch (grade) {
            case celujący:
                System.out.println("świetnie, jesteś najlepszy");
                break;
            case bardzo_dobry:
            case dobry:
                System.out.println("Jest nieźle");
                break;
            case dostateczny:
            case dopuszczający:
                System.out.println("mogło być lepiej");
                break;
            case niedostateczny:
                System.out.println("Tragedia!");
                break;
        }

    }
}
