package javaBeans;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RGB colour1 = new RGB(0,0,40);
        // colour1.r - 100; -> brak dostępu
        colour1.setR(100);
        colour1.setG(100);
        colour1.setB(100);
        System.out.println(colour1.getR());
        System.out.println(colour1.getG());
        System.out.println(colour1.getB());
        System.out.println(colour1);

    }
}
