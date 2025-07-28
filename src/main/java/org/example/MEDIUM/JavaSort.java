package org.example.MEDIUM;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (Double.compare(anotherStudent.getCgpa(), this.getCgpa()) != 0) {
            return Double.compare(anotherStudent.getCgpa(), this.getCgpa());
        } else if (!this.getFname().equals(anotherStudent.getFname())) {
            return this.getFname().compareTo(anotherStudent.getFname());
        } else {
            return this.getId() - anotherStudent.getId();
        }
    }
}

//Complete the code
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while (testCases>0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        in.close();

        Collections.sort(studentList);

        for (Student st: studentList) {
            System.out.println(st.getFname());
        }
    }
}
