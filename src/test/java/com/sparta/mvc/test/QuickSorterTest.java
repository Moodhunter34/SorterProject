package com.sparta.mvc.test;


import com.sparta.mvc.model.QuickSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSorterTest {

    QuickSort qs = new QuickSort();

    int[] array = {5, 7, 4, 3, 8, 9, 12, 4, 2, 5, 1, 8};
    int[] expectedArray = {1, 2, 3, 4, 4, 5, 5, 7, 8, 8, 9, 12};


    @DisplayName("Testing quick sort method")
    @Test
    public void quickSortTest() {
        String expectedArray = "[1, 2, 3, 4, 4, 5, 5, 7, 8, 8, 9, 12]";
        int[] array = {5, 7, 4, 3, 8, 9, 12, 4, 2, 5, 1, 8};
        assertEquals(expectedArray, Arrays.toString(qs.sort(array)));
    }
}
