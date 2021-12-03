package com.sparta.mvc.test;

import com.sparta.mvc.model.BubbleSorter;

import com.sparta.mvc.model.RandomSelection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class BubbleSorterTest {

    private BubbleSorter bubbleSorter;
    private RandomSelection randomSelection;
    int[] myArray;
    int[] myEmptyArray;
    int[] getArrayWithDuplicates = {2, 1, 4, 5, 9, 1, 2, 9, 8, 2};

    @BeforeEach
    public void setup() {
        bubbleSorter = new BubbleSorter();
        randomSelection = new RandomSelection();
        myArray = RandomSelection.randomGenerator();
    }

    @DisplayName("Duplicates testing")
    @Test
    public void duplicatesTest() {
        bubbleSorter.sort(getArrayWithDuplicates);
        int[] expectedArray = {1, 1, 2, 2, 2, 4, 5, 8, 9, 9};
        assertArrayEquals(expectedArray, getArrayWithDuplicates);
    }

    @DisplayName("Testing Bubblesort method")
    @Test
    public void bubbleSortTest() {
        int[] array = myArray;
        bubbleSorter.sort(myArray);
        Arrays.sort(array);
        assertArrayEquals(array, myArray);
    }

//    @DisplayName("Empty Array testing")
//    @Test
//    public void arrayEmptyTest(){
//        int[] m =bubbleSorter.sort(myEmptyArray);
//        assertNull(m, myEmptyArray);
//    }

    @AfterEach
    public void tearDown() {
        System.out.println("After tests");
    }




}
