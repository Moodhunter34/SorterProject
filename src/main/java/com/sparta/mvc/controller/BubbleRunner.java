//package com.sparta.mvc.controller;
//
//import com.sparta.mvc.model.BubbleSorter;
//import com.sparta.mvc.model.QuickSort;
//
//import java.util.*;
//
//
//public class BubbleRunner {
//    public static void main(String[] args) {
//
//        long startTime;
//        long endTime;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type b for Bubblesort and q for Quicksort: ");
//
//
//        String pick = scanner.next();
//        Random random = new Random(100);
//        ArrayList<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            myList.add(random.nextInt(100));
//        }
//
//        int[] myArray = new int[100];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = random.nextInt(100);
//        }
//
//
//        System.out.println("Unsorted Array: " + Arrays.toString(myArray));
//        System.out.println(Arrays.toString(myList.toArray()));
//
//        if (pick.equals("b")) {
//            BubbleSorter bs = new BubbleSorter();
//            int[] sorted = bs.sort(myArray);
//            ArrayList<Integer> sorted2 = bs.sort(myList);
//            startTime = System.nanoTime();
//            System.out.println("-----------------------------------------------------------------");
//            System.out.println("Sorted Array: " + Arrays.toString(sorted));
//            System.out.println(Arrays.toString(sorted2.toArray()));
//            endTime = System.nanoTime();
//            System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
//
//        } else if (pick.equals("q")) {
//            QuickSort qs = new QuickSort();
//            qs.quickSort(myArray, 0, myArray.length - 1);
//            ArrayList<Integer> sorted2 = qs.sort(myList);
//            startTime = System.nanoTime();
//            System.out.println("-----------------------------------------------------------------");
//            System.out.println("Sorted Array: " + Arrays.toString(myArray));
//            System.out.println(Arrays.toString(sorted2.toArray()));
//            endTime = System.nanoTime();
//            System.out.println("Time taken: " + (endTime - startTime) + " nano seconds");
//        }
//
//
//    }
//}
