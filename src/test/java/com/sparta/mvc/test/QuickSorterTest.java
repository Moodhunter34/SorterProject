package com.sparta.mvc.test;


import com.sparta.mvc.model.BubbleSorter;
import com.sparta.mvc.model.QuickSorter;
import com.sparta.mvc.model.RandomSelection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSorterTest {

    private QuickSorter quickSorter;
    private RandomSelection randomSelection;
    int[] myArray;
    int[] myEmptyArray;
    int[] getArrayWithDuplicates = {2, 3, 4, 5, 7, 1, 2, 9, 8, 4, 3, 2, 5};

    @BeforeEach
    public void setup(){
        quickSorter = new QuickSorter();
        randomSelection = new RandomSelection();
        myArray = RandomSelection.randomGenerator();
    }

    @DisplayName("Duplicates Testing")
    @Test
    public void duplicatesTest(){
        quickSorter.sort(getArrayWithDuplicates);
        int[] expectedArray = {1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 7, 8, 9};
        assertArrayEquals(expectedArray, getArrayWithDuplicates);
    }

    @DisplayName("Testing Quicksort Method")
    @Test
    public void quickSortTest(){
        int[] array = myArray;
        quickSorter.sort(myArray);
        Arrays.sort(array);
        assertArrayEquals(array, myArray);
    }

//    @DisplayName("Empty Array Testing")
//    @Test
//    public void arrayEmptyTest(){
//
//    }


    @AfterEach
    public void tearDown(){
        System.out.println("After tests");
    }


}
