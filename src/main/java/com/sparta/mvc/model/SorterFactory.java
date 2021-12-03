package com.sparta.mvc.model;

public class SorterFactory {

    // Implement if user selects "e" to exit
    public static Sorter sorterFactory(String pick) {

        if (pick.equals("b")) {
            return new BubbleSorter();
        } else if (pick.equals("q")) {
            return new QuickSort();
        } else {
            return null;
        }

    }

}
