package com.ua.robot.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> firstlist = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            firstlist.add(i);
        }
        System.out.println(firstlist.toString());

        List<Integer> secondlist = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            secondlist.add(i);
        }

        Student student1 = new Student("Ivan", "Ivanov", 20, "1A");
        Student student2 = new Student("Petr", "Petrov", 20, "1A");
        Student student3 = new Student("Sidor", "Sidorov", 20, "1A");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students.toString());

    }
}
