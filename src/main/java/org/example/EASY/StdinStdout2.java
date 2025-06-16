package org.example.EASY;

import java.util.Scanner;

public class StdinStdout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        double dbe = scanner.nextDouble();
        scanner.nextLine();
        String strg = scanner.nextLine();

        System.out.printf("String: %s\nDouble: "+dbe+"\nInt: %d",strg,i);
    }
}
