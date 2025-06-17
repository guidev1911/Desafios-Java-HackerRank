package org.example.EASY;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String[] tokens = s.trim().split("[^A-Za-z]+");

        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
