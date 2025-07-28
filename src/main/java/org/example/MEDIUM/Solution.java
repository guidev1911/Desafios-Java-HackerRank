package org.example.MEDIUM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student2 implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student2(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(Student cStudent) {
        if (cgpa != cStudent.getCGPA()) {
            return Double.compare(cStudent.getCGPA(), cgpa);
        } else if (!name.equals(cStudent.getName())) {
            return name.compareTo(cStudent.getName());
        } else {
            return Integer.compare(id, cStudent.getId());
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {

        List<Student> servedStudents = new ArrayList<>();
        PriorityQueue<Student> queue = new PriorityQueue<Student>();

        for (String event : events) {
            String[] parsedEvent = event.split("\\s+");

            if ("ENTER".equals(parsedEvent[0])) {
                Student student = new Student(
                        Integer.parseInt(parsedEvent[3]), parsedEvent[1], Double.parseDouble(parsedEvent[2]));
                queue.add(student);
            } else if ("SERVED".equals(parsedEvent[0])) {
                queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            servedStudents.add(queue.poll());
        }

        return servedStudents;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}