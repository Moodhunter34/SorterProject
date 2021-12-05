package com.sparta.mvc.test;

import com.sparta.mvc.model.BinaryTreeSorter;
import com.sparta.mvc.model.RandomSelection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeSorterTest {

    private BinaryTreeSorter binaryTreeSorter;
    private RandomSelection randomSelection;
    int[] myArray;
    int[] myEmptyArray;
  //  int[] getArrayWithDuplicates = {2, 1, 4, 5, 9, 1, 2, 9, 8, 2};

    @BeforeEach
    public void setup(){
        binaryTreeSorter = new BinaryTreeSorter();
        randomSelection = new RandomSelection();
        myArray = RandomSelection.randomGenerator();
    }

    @DisplayName("Testing Binary Tree sort method")
    @Test
    public void binaryTreeSortTest(){
        int[] array = myArray;
        binaryTreeSorter.createTree(myArray[0]);
        assertArrayEquals(array, myArray);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After tests");
    }

}
