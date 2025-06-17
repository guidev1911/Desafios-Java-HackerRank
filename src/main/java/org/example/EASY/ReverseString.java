package org.example.EASY;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.toLowerCase();
        if(s.length()>50 || !s.matches("[a-zA-Z]+")){
            System.out.println("The String will consist at most 50 lower case english letters.");
            System.exit(0);
        }
        String sr = new StringBuilder(s).reverse().toString();

        if(sr.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
