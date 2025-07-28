package org.example.EASY;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContent{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String regex = "<(.+?)>([^<>]+)</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            while(matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            if(!found) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
