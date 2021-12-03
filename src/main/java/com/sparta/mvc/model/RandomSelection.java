package com.sparta.mvc.model;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelection {
    private static Random random = new Random(100);

    public static int[] randomGenerator() {

        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }

    public static ArrayList<Integer> randomGeneratorArrList() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(random.nextInt(100));
        }
        return myList;
    }

}
