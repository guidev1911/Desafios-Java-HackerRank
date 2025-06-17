package org.example.EASY;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        char[] crts = S.toCharArray();

        if (S.length() < 1 || S.length() > 100 ){
            System.out.println("Enter a String 1 <= s <= 100");
        }else if(start < 0 || end > crts.length || start >=end){
            System.out.println("String too long or empty");
        }else if(!S.matches("[a-zA-Z]+")){
            System.out.println("type only letters");
        } else {
            char[] subArray = Arrays.copyOfRange(crts, start, end);
            System.out.println(new String(subArray));
        }
    }
}
