package variables;

public class Variable {
    public static void main(String[] args) {
        // deklaracja -> rezerwacja miejsca w pamięci podręcznej
        // typ nazwaZmiennej;
        int age;
        // inicjalizacja -> pierwsze przypisanie wartości
        age = 14;
        System.out.println("Wiek: " + age);
        // deklaracja i inicjalizacja
        double result = 0.01;
        System.out.println("Wynik: " + result);
        // modyfikacja wartości w zmiennej
        age = 15;
        System.out.println("Wiek: " + age);
        age = age + 5;
        //lub:
        age += 5;   //dodawanie
        age *= 5; //mnożenie
        System.out.println(age);

        final byte HOURS_IN_DAY = 24;
        final boolean DECISION;
       //HOURS_IN_DAY = 23;
        DECISION = true;
        // DECISION = false;  -> wyjdzie błąd
    }
}
