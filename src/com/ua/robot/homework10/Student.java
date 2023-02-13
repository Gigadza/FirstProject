package com.ua.robot.homework10;

public class Student {

    private String name;
    private String gender;
    private int age;
    private String grade;
    private String course;

    public Student(String name, String gender, int age, String grade, String course) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
