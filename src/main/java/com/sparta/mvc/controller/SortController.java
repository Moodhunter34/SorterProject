package com.sparta.mvc.controller;

import com.sparta.mvc.model.RandomSelection;
import com.sparta.mvc.model.SorterFactory;
import com.sparta.mvc.view.SortingView;
import java.util.*;

public class SortController {

    public static void sortMethodPick(String pick, String type) {
        int[] myArray = RandomSelection.randomGenerator();
        ArrayList<Integer> myList = RandomSelection.randomGeneratorArrList();

        if (type.equals("a")) {
            SortingView.displayUnsortedArray(myArray);
        } else {
            SortingView.displayUnsortedArrayList(myList);
        }

        if (pick.equals("b")) {
            if (type.equals("a")) {
                SortingView.displayArray(SorterFactory.sorterFactory("b").sort(myArray));

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("b").sort(myList));
            }

        } else if (pick.equals("q")) {
            if (type.equals("a")) {
                SortingView.displayArray(SorterFactory.sorterFactory("q").sort(myArray));

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("q").sort(myList));

            }

        }

    }
}
