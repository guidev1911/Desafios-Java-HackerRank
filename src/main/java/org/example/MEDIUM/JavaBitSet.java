package org.example.MEDIUM;
import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet[] b = new BitSet[2];
        b[0] = new BitSet(n);
        b[1] = new BitSet(n);

        for (int i=0; i<m; i++) {
            String operation = scanner.next();
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            if ("AND".equals(operation)) {
                b[operand1-1].and(b[operand2-1]);
            } else if ("OR".equals(operation)) {
                b[operand1-1].or(b[operand2-1]);
            } else if ("XOR".equals(operation)) {
                b[operand1-1].xor(b[operand2-1]);
            } else if ("FLIP".equals(operation)) {
                b[operand1-1].flip(operand2);
            } else if ("SET".equals(operation)) {
                b[operand1-1].set(operand2);
            } else {
                throw new IllegalArgumentException(String.format("Invalid operation: %s", operation));
            }

            System.out.println(b[0].cardinality() + " " + b[1].cardinality());
        }

        scanner.close();
    }
}