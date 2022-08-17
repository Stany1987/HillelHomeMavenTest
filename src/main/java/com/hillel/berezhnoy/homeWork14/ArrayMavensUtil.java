package com.hillel.berezhnoy.homeWork14;

public class ArrayMavensUtil {

    public static double arethmeticArray(int[][] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return sum / count;
    }

    public static boolean squareArra(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i].length) {
                return true;
            }
        }
        return false;
    }

//    public static boolean squareArra(int[][] array){
//        for (int i = 0; i < array.length; i++) {
//            if(array.length != array[i].length){
//                return false;
//            }
//        }
//        return true;
//    }
}
