package com.sparta.mvc.model;

import java.util.ArrayList;


public interface Sorter <T extends Comparable<? super T>> {

    int[] sort(int[] arr);
    ArrayList<T> sort(ArrayList<T> arrayList);

}
