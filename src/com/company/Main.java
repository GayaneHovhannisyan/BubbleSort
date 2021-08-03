package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int numberOfArray = scanner.nextInt();

        int[] numSequence = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            System.out.println("Enter the " + (i + 1) + "-th element : ");
            numSequence[i] = scanner.nextInt();
        }

        System.out.println("The original sequence: -\n    ");
        //call PrintFor Method
        PrintFor(numSequence);
        //call BubbleSort Method
        System.out.println("The bubble sort sequence: -\n    ");
        BubbleSort(numSequence);
        PrintFor(numSequence);
    }

    //method for
    private static void PrintFor(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i] + ", ");
        }
    }

    //method  bubbleSort
    private static void BubbleSort(int[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }
}