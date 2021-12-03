package com.sparta.mvc.controller;

import com.sparta.mvc.model.Logging;
import com.sparta.mvc.model.RandomSelection;
import com.sparta.mvc.model.SorterFactory;
import com.sparta.mvc.view.SortingView;
import java.util.*;
import com.sparta.mvc.model.Logging.*;


public class SortController {


    public static void sortMethodPick(String pick, String type) {
        int[] myArray = RandomSelection.randomGenerator();
        ArrayList<Integer> myList = RandomSelection.randomGeneratorArrList();


        if (type.equals("a")) {
            SortingView.displayUnsortedArray(myArray);
        } else {
            SortingView.displayUnsortedArrayList(myList);
        }


        if (pick.equals("b") || pick.equals("both")) {
            if (type.equals("a")) {
                SortingView.displayArray(SorterFactory.sorterFactory("b").sort(myArray), "BubbleSort ");

                System.out.println("");

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("b").sort(myList), "BubbleSort ");
            }

        } if (pick.equals("q") || pick.equals("both")) {
            if (type.equals("a")) {
                SortingView.displayArray(SorterFactory.sorterFactory("q").sort(myArray), "Quicksort ");
                System.out.println("");

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("q").sort(myList), "Quicksort ");
                System.out.println("");
            }

        }


    }
}
