package org.example.MEDIUM;

import java.io.*;
import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> uNames = new HashSet<>();
        int count = scanner.nextInt();
        for (int ii = 0; ii < count; ii++) {
            String name1 = scanner.next();
            String name2 = scanner.next();

            if (!uNames.contains(name1.concat(" ").concat(name2))
                    && !uNames.contains(name2.concat(" ").concat(name1))) {
                uNames.add(name1.concat(" ").concat(name2));
            }

            System.out.println(uNames.size());
        }

        scanner.close();
    }
}