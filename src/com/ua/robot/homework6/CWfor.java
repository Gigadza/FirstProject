package com.ua.robot.homework6;

import java.util.Scanner;

public class CWfor {

    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.print("Enter number");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println(number + " ");
        }*/
        Scanner scanner4 = new Scanner(System.in);
        String pinCode = " ";
        int counter = 0;
        var result = false;
        do {
            if (counter == 3) {
                System.out.println("Go away!!!");
                break;
            }
            System.out.print("Enter pinCode");
            pinCode = scanner4.nextLine();
            result = !pinCode.equals("0000");
            if (result) {
                System.out.println("Invalid pinCode");
                counter++;
            }
        } while (result);
        if (!result) {
            System.out.println("Welcome");
        }
    }
}
