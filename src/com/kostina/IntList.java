package com.kostina;

public interface IntList {
    void add(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray(int... numbers);

    void insert(int index, int value);

    void delete(int index);
}
