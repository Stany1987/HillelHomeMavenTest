package com.hillel.berezhnoy.homeWork14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMavensUtilTest {
    int[][] array = {{7, 7, 7}, {7, 7, 7}};

//    Я не понял , надо это или нет
//    @Test
//    public void arethmeticArray(){
//        Assertions.assertEquals(7,ArrayMavensUtil.arethmeticArray(array));
//    }

    @Test
    public void squarearray() {
        Assertions.assertFalse(ArrayMavensUtil.squareArra(array));
    }
}
