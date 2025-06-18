package org.example.EASY;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer T = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < T; i++) {

            String dataS = scanner.nextLine();
            Long data;

            try{
                data = Long.parseLong(dataS);

                if(data >= Byte.MIN_VALUE && data <= Byte.MAX_VALUE){
                    System.out.println(data+" can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                }else if(data >= Short.MIN_VALUE && data <= Short.MAX_VALUE){
                    System.out.println(data+" can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                }else if(data >= Integer.MIN_VALUE && data <= Integer.MAX_VALUE){
                    System.out.println(data+" can be fitted in:");
                    System.out.println("* int\n* long");
                }else if(data >= Long.MIN_VALUE && data <= Long.MAX_VALUE){
                    System.out.println(data+" can be fitted in:");
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(dataS + " can't be fitted anywhere.");
            }

        }
    }
}
