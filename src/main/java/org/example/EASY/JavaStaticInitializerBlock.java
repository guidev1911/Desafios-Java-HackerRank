package org.example.EASY;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int result;

        try{
            if(B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }else{
                result = B * H;
                System.out.println(result);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
