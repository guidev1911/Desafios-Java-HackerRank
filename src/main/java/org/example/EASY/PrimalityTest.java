package org.example.EASY;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();

        if (numStr.length() > 100) {
            return;
        }

        BigInteger bigNum = new BigInteger(numStr);

        if (bigNum.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
