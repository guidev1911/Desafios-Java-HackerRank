package org.example.MEDIUM;

import java.lang.reflect.*;
import java.util.*;

class Student3 {
    private String name;
    private String id;
    private String email;

    public String getName() { return name; }
    public String getId() { return id; }
    public String getEmail() { return email; }
    public void setId(String id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void ahqym() {}
    public void amftc() {}
    public void anotherfunction() {}
    public void atcks() {}
    public void bwkbd() {}
    public void cfwyc() {}
    public void cmkxa() {}
    public void dnpym() {}
    public void dnqvo() {}
    public void dvvwq() {}
    public void ehjdm() {}
    public void elyed() {}
    public void fmyce() {}
    public void ghtlj() {}
    public void hluvb() {}
    public void isqdf() {}
    public void iwhtf() {}
}

public class Result {
    public static void main(String[] args){
        Class<?> student = Student3.class;
        Method[] methods = student.getDeclaredMethods();

        List<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);

        for(String name: methodNames){
            System.out.println(name);
        }
    }
}
