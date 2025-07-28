package org.example.EASY;

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i=n; i>=0; i--) {
            for (int j=0; j<i-1; j++) {
                BigDecimal numA = new BigDecimal(s[j]);
                BigDecimal numB = new BigDecimal(s[j+1]);

                if (numA.compareTo(numB) == -1) {
                    String tmp = s[j];

                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}