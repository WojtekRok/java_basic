package bigNumbers;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("5555555555555555555555555");
        BigInteger bigInteger2 = new BigInteger("22222222222222222222222222222");

        // metody klasy big integer

        BigInteger bigIntegerAdd = bigInteger1.add(bigInteger2);
    }
}
