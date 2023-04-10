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

        Person student1 = new Person("Ivan", "Ivanov", 20, "1A");
        Person student2 = new Person("Petr", "Petrov", 20, "1A");
        Person student3 = new Person("Sidor", "Sidorov", 20, "1A");
        List<Person> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students.toString());

    }
}
