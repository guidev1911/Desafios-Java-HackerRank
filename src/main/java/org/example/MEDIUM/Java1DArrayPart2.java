package org.example.MEDIUM;

import java.util.*;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {
        if (i >= game.length) {
            return true;
        }

        if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1;

        return canWinFrom(i + leap, leap, game) ||
                canWinFrom(i + 1, leap, game) ||
                canWinFrom(i - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}