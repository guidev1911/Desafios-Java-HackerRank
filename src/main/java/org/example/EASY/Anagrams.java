package org.example.EASY;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String A = s1.toLowerCase();
        String B = s2.toLowerCase();


        if(A.length() < 1 || A.length() > 50 || B.length() < 1 || B.length() > 50 || !A.matches("[a-zA-Z]+") || !B.matches("[a-zA-Z]+")){
            System.exit(0);
        }

        char [] arA = A.toCharArray();
        char [] arB = B.toCharArray();

        Arrays.sort(arA);
        Arrays.sort(arB);

        String nA = new String(arA);
        String nB = new String(arB);

        String compare = (nA.equals(nB)) ? "Anagrams" : "Not Anagrams";
        System.out.println(compare);
    }
}
