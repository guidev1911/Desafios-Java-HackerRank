package org.example.EASY;

import java.util.Scanner;

public class OutPutFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.next();
        int i1 = scanner.nextInt();
        String st2 = scanner.next();
        int i2 = scanner.nextInt();
        String st3 = scanner.next();
        int i3 = scanner.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s%03d%n",st1,i1);
        System.out.printf("%-15s%03d%n",st2,i2);
        System.out.printf("%-15s%03d%n",st3,i3);
        System.out.println("================================");
    }
}
