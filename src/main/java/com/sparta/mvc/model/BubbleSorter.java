package com.sparta.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorter <T extends Comparable<? super T>> implements Sorter<T> {

    // generics for arrays
    public T[] sort(T[] arr) {
        int len = arr.length; //length of the array

        for (int i = 0; i < (len - 1); i++) {   //for loop for the array
            for (int j = 0; j < (len - i - 1); j++) {  //loop to compare two elements
                if (arr[j].compareTo(arr[j + 1]) > 0) { //comparing three elements, for ascending order
                    T n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
        }
        return arr;
    }

    // ArrayList bubble sorting
    @Override
    public ArrayList<T> sort(ArrayList<T> arrayList) {
        int n = arrayList.size(); //len Array
        T temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arrayList.get(j - 1).compareTo(arrayList.get(j)) > 0) {
                    temp = arrayList.get(j - 1);
                    arrayList.set(j - 1, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        return arrayList;
    }

    // Array bubble sorting
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length; //length of the array

        for (int i = 0; i < (len - 1); i++) {   //for loop for the array
            for (int j = 0; j < (len - i - 1); j++) {  //loop to compare two elements
                if (arr[j] > arr[j + 1]) { //comparing three elements, for ascending order
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
        }
        return arr;
    }

//    @Override
//    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
//        int n = arrayList.size(); //len Array
//        int temp = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n; j++) {
//                if (arrayList.get(j - 1) > arrayList.get(j)) {
//                    temp = arrayList.get(j - 1);
//                    arrayList.set(j - 1, arrayList.get(j));
//                    arrayList.set(j, temp);
//                }
//            }
//        }
//        return arrayList;
//    }


}


