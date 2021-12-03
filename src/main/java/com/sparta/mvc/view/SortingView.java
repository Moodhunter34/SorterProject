package com.sparta.mvc.view;

import com.sparta.mvc.controller.SortController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortingView {

    static long startTime;
    static long endTime;

    // Implement the Exit method, and if user input is not valid

    public static void displayMenu() {

        boolean exit = false;

        while (!exit) {
            System.out.println("Type b for using Bubblesort method, type q for using Quicksort method: or e to Exit.");
            Scanner scanner = new Scanner(System.in);
            String pick = scanner.next().toLowerCase();
            if (pick.equals("b") || pick.equals("q")) {
                System.out.println("Type a for using Arrays or type l for using Lists");
                String type = scanner.next().toLowerCase();
                if (type.equals("a") || (type.equals("l"))) {
                    SortController.sortMethodPick(pick, type);
                }
            } else if (pick.equals("e")) {
                exit = true;
            } else {
                System.out.println("You typed in the wrong letter");
            }
        }
    }

    public static void displayUnsortedArray(int[] array) {
        System.out.println("Unsorted Array is : " + Arrays.toString(array));
        startTime = System.nanoTime();
        System.out.println("");

    }

    public static void displayUnsortedArrayList(ArrayList<Integer> arrayList) {
        System.out.println("Unsorted ArrayList: " + arrayList);
        startTime = System.nanoTime();
        System.out.println("");
    }

    public static void displayArray(int[] array) {
        System.out.println("Sorted Array: " + Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }

    public static void displayArrayList(ArrayList<Integer> arrayList) {
        System.out.println("Sorted ArrayList: " + arrayList);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }


}
