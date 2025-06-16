package org.example.EASY;

import java.util.Scanner;

public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int valor = a;

            for (int j = 0; j < n; j++) {
                valor += (int) Math.pow(2, j) * b;
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
