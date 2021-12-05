package com.sparta.mvc.view;

import com.sparta.mvc.controller.SortController;
import com.sparta.mvc.model.Logging;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import static com.sparta.mvc.model.Logging.*;

public class SortingView {

    private static long startTime;
    private static long endTime;


    public static void displayMenu() {
        System.out.println(welcome);
        System.out.println();
        boolean exit = false;

        while (!exit) {
            System.out.println(options);
            Scanner scanner = new Scanner(System.in);
            String pick = scanner.next().toLowerCase();
            if (pick.equals("b") || pick.equals("q") || pick.equals("t") || pick.equals("c")) {


                System.out.print(listOptions);
                String type = scanner.next().toLowerCase();
                if (type.equals("a") || (type.equals("l"))) {
                    SortController.sortMethodPick(pick, type);
                } else {
                    Logging.logger.warn(invalidInput);
                }

            } else if (pick.equals("e")) {
                exit = true;
                Logging.logger.info(exitMessage);
            } else {
                Logging.logger.warn(invalidInput);
                System.out.println();
            }
        }
    }

    public static void displayUnsortedArray(int[] array) {
        System.out.println("Unsorted Array is : " + Arrays.toString(array));
        startTime = System.nanoTime();
        System.out.println();
    }

    public static void displayUnsortedArrayList(ArrayList<Integer> arrayList) {
        System.out.println("Unsorted ArrayList: " + arrayList);
        startTime = System.nanoTime();
        System.out.println();
    }

    public static void displayArray(int[] array, String sortType) {
        System.out.println(sortType + "Sorted Array: " + Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }

    public static void displayArrayList(ArrayList<Integer> arrayList, String sortType) {
        System.out.println("Sorted ArrayList: " + arrayList);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
    }


}
