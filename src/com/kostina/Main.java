package com.kostina;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.toArray(1, 2, 3, 4, 5, 6);
        //list.add(7);
        //list.get(2);
        //list.set(4, 10);
        list.insert(2, 12);
        list.delete(2);
    }


}
