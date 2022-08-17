package com.hillel.berezhnoy.homeWork14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysHW18Test {
    int min = 1;
    int max = 11;
    int element = (int) (min + Math.random() * max);

    int[] array = {-1, 0, 2, 3, 4};

    @Test
    public void serchElement() {
        Assertions.assertEquals(-1, ArraysHW18.search(element));
    }

    @Test
    public void sortarr() {
        Assertions.assertTrue(ArraysHW18.sortArr(array));
    }

}
