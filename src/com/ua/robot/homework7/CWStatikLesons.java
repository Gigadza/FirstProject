package com.ua.robot.homework7;

public class CWStatikLesons {

    public static void main(String[] args) {

//        int factorial = getFactorial(7);
////        System.out.println(factorial);
//        int factorial2 = factorial(3);
//        System.out.println(factorial2);
        int a = 5;
        a = doubleNumber(a);
        System.out.println(a);
    }
    static int doubleNumber(int b) {
        return b * 2;

    }

    static void print(int count, String s) {
        for (int i = 0; i < count; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    static int getFactorial(int num) {
        int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        return fact;


    }


}
