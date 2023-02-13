package com.ua.robot.homework10;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {

        Scanner sc = new Scanner(System.in);

        public int length = sc.nextInt();
        public int[] arr = new int[length];

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sortArray1 () {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void sortArray2 () {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j< arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}