package org.example.MEDIUM;

import java.io.*;
import java.util.*;
import java.security.*;

public class Sha256 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}