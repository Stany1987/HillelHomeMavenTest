package com.hillel.berezhnoy.homeWork14;

import java.util.Arrays;

public class ArraysHW18 {
    public static double search(int element) {
        int[] arraySort = new int[8];
        int min = 1;
        int max = 11;
        for (int i = 0; i < arraySort.length; i++) {
            arraySort[i] = (int) (min + Math.random() * max);
        }

        for (int i = 0; i < arraySort.length; i++) {
            if (arraySort[i] == element) {

                return i;
            }
        }
        return -1;
    }

    public static boolean sortArr(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}


