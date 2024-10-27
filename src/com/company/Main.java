package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// task 1
        int [] arr1 = new int [] {1, 2, 3};
        double [] arr2 = new double [] {1.57, 7.654, 9.986};
        char [] arr3 = new char [] {'e', 'l', 'e', 'm', 'e', 'n', 't', 's'};
    // task 2
        System.out.println("Task 2");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    //task 3
        System.out.println("Task 3");
        for (int i = arr1.length -1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length -1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3.length -1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    //task4
        System.out.println("Task 4");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
        }
            System.out.println(Arrays.toString(arr1));
    }
}
