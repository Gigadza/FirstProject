package com.ua.robot.homework6;

public class HWfor {
    public static void main(String[] args) {
        System.out.println("Number from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Even number from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i);
            else
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("Factorial 7");
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println("Fibonacci numbers from 1 to 100");
        int i = 0;
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " ");
        do {
            c = a + b;
            System.out.print(b + " ");
            a = b;
            b = c;
            i++;
        } while (c < 100);
    }
}
