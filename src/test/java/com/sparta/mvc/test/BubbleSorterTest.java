package com.sparta.mvc.test;

import com.sparta.mvc.model.BubbleSorter;

import com.sparta.mvc.model.RandomSelection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BubbleSorterTest {


    BubbleSorter bs = new BubbleSorter();
    int[] emptyArray = {};
    int[] array = {5, 7, 4, 3, 8, 9, 12, 4, 2, 5, 1, 8};
    int[] expectedArray = {1, 2, 3, 4, 4, 5, 5, 7, 8, 8, 9, 12};

    @BeforeEach
    public void setup(){
        System.out.println("Before test");
    }


    @DisplayName("Testing Bubblesort method")
    @Test
    public void bubbleSortTest() {
        int[] result = bs.sort(array);
        assertArrayEquals(expectedArray, result);
    }


    @AfterEach
    public void tearDown(){
        System.out.println("After tests");
    }




}
