package com.ua.robot.homework18;

public class Person {
    public String name;
    public String surname;
    public int age;
    public String group;

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name + '\'' +
                ", surname=" + surname + '\'' +
                ", age=" + age +
                ", group=" + group + '\'' +
                '}';
    }

    public Person(String name, String surname, int age, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }

    public int getAge() {
        return 0;
    }

    public String getName() {
            return null;
    }
}


