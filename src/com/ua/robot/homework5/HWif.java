package com.ua.robot.homework5;

import java.util.Scanner;

public class HWif {

    public static void main(String[] args) {
        //firs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a It's a bigger number");
        } else {
            System.out.println("b It's a bigger number");
        }

        //second
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter c = ");
        int c = sc2.nextInt();
        System.out.print("Enter d = ");
        int d = sc2.nextInt();

        if (c > d) {
            System.out.println("d It's a smaller number");
        } else {
            System.out.println("c It's a smaller number");
        }

        //third
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter e = ");
        int e = sc3.nextInt();

        if (e % 2 == 0) {
            System.out.println("event");
        } else {
            System.out.println("odd");
        }
    }
}
