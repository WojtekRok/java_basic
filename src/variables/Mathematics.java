package variables;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Mathematics {
    public static void main(String[] args) {
        // stałe z klasy matematycznej
        final double PI = Math.PI;
        //x do potęgi y
        int x = 5;
        int y = 2;
        // pow (podstawa, wykładnik)
        // konwersja na tym integer (int)
        int result = (int) pow(x,y);
        System.out.println(result);

        // pierwiastek 3 stopnia z 16
        System.out.println(pow(16, (1.0/3)));

        int a = 5;
        int b = 8;

        // wynik działania jest typu składnika o najwyższej precyzji w działaniu
        System.out.println(a*b);
        System.out.println(a/b);
        // konwersja rozszerzająca -> konwersja do typu wyższej precyzji
        System.out.println(( (double) a) / b);
        // konwersja zawężająca -> konwersja do typu o niższej precyzji
        double measurment = 1.443;
        System.out.println((int)measurment);

        char sign = 'a';
        sign++;  // sign +=1;
        sign++;
        System.out.println(sign);
    }
}
