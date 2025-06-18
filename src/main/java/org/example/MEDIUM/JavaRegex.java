package org.example.MEDIUM;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2}|0[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2}|0[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2}|0[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2}|0[0-9]{1,2})$";


        do {
            String ip = sc.nextLine();
            if(ip.matches(regex)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }while(sc.hasNext());
    }
}
