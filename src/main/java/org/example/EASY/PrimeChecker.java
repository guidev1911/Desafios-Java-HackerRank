package org.example.EASY;

import java.util.*;

class Prime {
    public void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        sc.close();

        Prime prime = new Prime();
        prime.checkPrime(n1);
        prime.checkPrime(n1, n2);
        prime.checkPrime(n1, n2, n3);
        prime.checkPrime(n1, n2, n3, n4, n5);
    }
}