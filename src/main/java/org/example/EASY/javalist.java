package org.example.EASY;

import java.io.*;
import java.util.*;

public class javalist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            String action = scan.next();

            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if (action.equals("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        }

        scan.close();
    }
}