package org.example.EASY;

import java.io.*;
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}