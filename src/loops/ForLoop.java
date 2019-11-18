package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
        //Ala ma kota
        //012345678910
        // wypisz w pętli wszystkie znaki napisu pojedynczo
        for (int i = 0; i <= sentence.length() - 1; i++) {
            char litera = sentence.charAt(i);
            if (litera != ' ')
                System.out.printf("indeks: %d znak: %c\n", i, litera);
        }
        // tablica - zmienna przechowująca zestaw wartości uporządkowanych po indeksach
        // index 0 -> 2
        // index 1 - > 4
        // index 2 -> 6
        // index 3 -> 8
        int numbers[] = {2, 4, 6, 8};
        // for ( typ pojedynczej wartości nazwa podręczna  : kolekcja wartości)
        for (int number : numbers) {
            System.out.printf("wartość %d\n", number);
        }

    }
}