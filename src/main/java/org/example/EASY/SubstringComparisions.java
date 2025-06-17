package org.example.EASY;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringComparisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer k = sc.nextInt();

        if(!s.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("type only letters");
        }else{}

        int group = s.length() - k + 1;
        String[] groups = new String[group];

        for (int i = 0; i < group; i++) {
            groups[i] = s.substring(i, i + k);
        }
        Arrays.sort(groups);

        System.out.println(groups[0] + "\n" + groups[groups.length-1]);
    }
}
