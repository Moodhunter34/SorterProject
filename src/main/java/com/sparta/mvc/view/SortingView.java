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

        System.out.println("Type b for Bubblesort, q for Quicksort: or e to Exit.");
        Scanner scanner = new Scanner(System.in);

        String pick = scanner.next().toLowerCase();
        System.out.println("Type a for Array or l for List");

        String type = scanner.next().toLowerCase();

        if (pick.equals("b") || pick.equals("q")) {
            if (type.equals("a") || (type.equals("l"))) {
                SortController.sortMethodPick(pick, type);

            }


        } else if (pick.equals("e")) {
            System.exit(0);
        } else {
            displayMenu();
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
