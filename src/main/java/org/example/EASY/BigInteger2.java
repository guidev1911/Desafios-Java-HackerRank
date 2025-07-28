package org.example.EASY;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigInteger2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        // Write your code here
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        System.out.println(num1.add(num2));

        System.out.println(num1.multiply(num2));
    }
}