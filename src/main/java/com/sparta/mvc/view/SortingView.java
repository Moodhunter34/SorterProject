package com.sparta.mvc.view;

import com.sparta.mvc.controller.SortController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import static com.sparta.mvc.model.Logging.*;

public class SortingView {

    static long startTime;
    static long endTime;


    public static void displayMenu() {

        boolean exit = false;

        while (!exit) {
            System.out.println(options);
            Scanner scanner = new Scanner(System.in);
            String pick = scanner.next().toLowerCase();
            if (pick.equals("b") || pick.equals("q") || pick.equals("both")) {


                System.out.println("Type 'a' for sorting Arrays or type 'l' for sorting Lists");
                String type = scanner.next().toLowerCase();
                if (type.equals("a") || (type.equals("l"))) {
                    SortController.sortMethodPick(pick, type);
                }
            } else if (pick.equals("e")) {
                exit = true;
                System.out.println(exitMessage);
            } else {
                System.out.println("You typed in the wrong letter");
                System.out.println("");
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

    public static void displayArray(int[] array, String sortType) {
        System.out.println(sortType +"Sorted Array: " + Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }

    public static void displayArrayList(ArrayList<Integer> arrayList, String sortType) {
        System.out.println("Sorted ArrayList: " + arrayList);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }


}
