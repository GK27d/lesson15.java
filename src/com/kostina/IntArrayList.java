package com.kostina;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int arr[] = new int[0];

    @Override
    public void add(int value) {
        int arrCopy[] = Arrays.copyOf(arr, arr.length + 1);
        arrCopy[arr.length] = value;
        arr = Arrays.copyOf(arrCopy, arrCopy.length);
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void set(int index, int value) {
        arr[index] = value;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public int[] toArray(int... numbers) {
        arr = Arrays.copyOf(numbers, numbers.length);
        return arr;
    }

    @Override
    public void insert(int index, int value) {
        int arrCopy[] = new int[arr.length + 1];
        int arrStart[] = Arrays.copyOfRange(arr, 0, index);
        for (int i = 0; i < arrStart.length; i++) {
            arrCopy[i] = arrStart[i];
        }
        arrCopy[index] = value;
        int arrEnd[] = Arrays.copyOfRange(arr, index, arr.length);
        for (int i = index + 1, j = 0; j < arrEnd.length; i++, j++) {
            arrCopy[i] = arrEnd[j];
        }
        arr = Arrays.copyOf(arrCopy, arrCopy.length);
    }

    @Override
    public void delete(int index) {
        int arrCopy[] = new int[arr.length - 1];
        int arrStart[] = Arrays.copyOfRange(arr, 0, index);
        for (int i = 0; i < arrStart.length; i++) {
            arrCopy[i] = arrStart[i];
        }
        int arrEnd[] = Arrays.copyOfRange(arr, index + 1, arr.length);
        for (int i = index, j = 0; j < arrEnd.length; i++, j++) {
            arrCopy[i] = arrEnd[j];
        }
        arr = Arrays.copyOf(arrCopy, arrCopy.length);
    }
}
