package com.ua.robot.homework9;

public class Teacher {

    private String name;
    private String gender;
    private int age;
    private int id;
    private String subject;

    public Teacher(String name, String gender, int age, int id, String subject) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}
