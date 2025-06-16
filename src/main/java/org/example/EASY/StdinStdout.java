package org.example.EASY;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println(n1+"\n"+n2+"\n"+n3);
    }
}
