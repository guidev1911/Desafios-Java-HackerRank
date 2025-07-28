package org.example.MEDIUM;

import java.io.*;
import java.util.*;

public class Inheritance {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}