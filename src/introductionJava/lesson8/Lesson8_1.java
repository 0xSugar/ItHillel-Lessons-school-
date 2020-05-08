package introductionJava.lesson8;

import java.math.BigInteger;

public class Lesson8_1 {
    public static void main(String[] args) {
        int k = 20;

        BigInteger number = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            BigInteger n = BigInteger.valueOf(i);
            number = number.multiply(n);
        }
        System.out.println(number);

        System.out.println(factorial(k));

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
