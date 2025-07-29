package org.example.MEDIUM;

import java.io.*;
import java.util.*;
import java.security.*;


public class Md5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("MD5 Algorithm not found");
        }
    }
}
