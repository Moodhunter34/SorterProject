package com.sparta.mvc.controller;

import com.sparta.mvc.model.Logging;
import com.sparta.mvc.model.RandomSelection;
import com.sparta.mvc.model.SorterFactory;
import com.sparta.mvc.view.SortingView;

import java.util.*;

import com.sparta.mvc.model.Logging.*;
import com.sparta.mvc.model.BinaryTreeSorter;

import static com.sparta.mvc.model.Logging.*;


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
                Logging.logger.info(bubblePick);
                Logging.logger.info(arraysSortingPick);
                System.out.println();

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("b").sort(myList), "BubbleSort ");
                Logging.logger.info(bubblePick);
                Logging.logger.info(listsSortingPick);
                System.out.println();
            }

        }
        if (pick.equals("q") || pick.equals("both")) {
            if (type.equals("a")) {
                SortingView.displayArray(SorterFactory.sorterFactory("q").sort(myArray), "Quicksort ");
                System.out.println();
                Logging.logger.info(quicksortPick);
                Logging.logger.info(arraysSortingPick);

            } else {
                SortingView.displayArrayList(SorterFactory.sorterFactory("q").sort(myList), "Quicksort ");
                System.out.println();
                Logging.logger.info(quicksortPick);
                Logging.logger.info(listsSortingPick);
            }

        }
        if (pick.equals("t")) {
            Logging.logger.info(binaryTreePick);
            BinaryTreeSorter tree = new BinaryTreeSorter();
            if (type.equals("a")) {


                for (int i = 0; i < myArray.length; i++) {
                    tree.createTree(myArray[i]);

                }
                System.out.println("Sorted array is: ");
                System.out.print("[");
                tree.inOrder(tree.root);
                System.out.print("]");
            } else {

                for (int i = 0; i < myList.size(); i++) {
                    tree.createTree(myList.get(i));
                }
                System.out.print("[");
                tree.inOrder(tree.root);
                System.out.print("]");

            }

        }

    }
}
