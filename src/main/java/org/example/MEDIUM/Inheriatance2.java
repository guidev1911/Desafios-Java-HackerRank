package org.example.MEDIUM;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic
{
    public static int add(int a,int b)
    {
        return (a+b);
    }
}
class Adder extends Arithmetic
{
    /*Adder(int a,int b)
    {
        super(a,b);
    }*/
}
public class Inheriatance2{
    public static void main(String []args){

        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}