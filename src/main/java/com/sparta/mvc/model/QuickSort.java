package com.sparta.mvc.model;

import java.util.ArrayList;

public class QuickSort<T extends Comparable<? super T>> implements Sorter<T> {


    @Override
    public int[] sort(int[] arr) {
        if (arr == null) return null;
        else if (arr.length <= 1) {
            return arr;
        } else {
            quickSort(arr, 0, arr.length - 1);
            return arr;
        }
    }


    @Override
    public ArrayList<T> sort(ArrayList<T> arrayList) {
        if (arrayList == null) return null;
        else if (arrayList.size() <= 1) {
            return arrayList;
        } else {
            quickSort(arrayList, 0, arrayList.size() - 1);
            return arrayList;
        }
    }

    public void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int partIndex = partition(arr, start, end);

            quickSort(arr, start, partIndex - 1);
            quickSort(arr, partIndex + 1, end);
        }
    }

    public ArrayList<T> quickSort(ArrayList<T> arrList, int start, int end) {
        if (start < end) {
            int partIndex = partition(arrList, start, end);

            quickSort(arrList, start, partIndex - 1);
            quickSort(arrList, partIndex + 1, end);
        }
        return arrList;
    }

    private int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    private int partition(ArrayList<T> arrList, int start, int end) {
        T pivot = arrList.get(end);
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (arrList.get(j).compareTo(pivot) <= 0) {
                i++;

                T swapTemp = arrList.get(i);
                arrList.set(i, arrList.get(j));
                arrList.set(j, swapTemp);
            }
        }
        T swapTemp = arrList.get(i + 1);
        arrList.set(i + 1, arrList.get(end));
        arrList.set(end, swapTemp);

        return i + 1;
    }


}



