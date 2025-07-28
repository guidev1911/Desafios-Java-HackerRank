package org.example.MEDIUM;

import java.io.*;
import java.util.*;

public class Dequeue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Deque<Integer> window = new ArrayDeque<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            window.addLast(current);
            freqMap.put(current, freqMap.getOrDefault(current, 0) + 1);

            if (window.size() > m) {
                int removed = window.removeFirst();
                freqMap.put(removed, freqMap.get(removed) - 1);
                if (freqMap.get(removed) == 0) {
                    freqMap.remove(removed);
                }
            }

            if (window.size() == m) {
                maxUnique = Math.max(maxUnique, freqMap.size());
            }
        }

        System.out.println(maxUnique);
    }
}