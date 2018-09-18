package org.kratenok.task;

import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] intArr = new int[3][3];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {

                intArr[i][j] = random.nextInt(22);

            }
        }
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                System.out.println(intArr[i][j] + " ");

            }
        }
        System.out.println();


        int max = Integer.MAX_VALUE, indexi = 0, indexj = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j]>max) ;
                indexi = i;
                indexj = j;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        if (indexi == 0) {
            System.out.println();
        } else {
            System.out.println();
        }
        if (indexi == intArr.length - 1) {

        } else {
            System.out.println();
        }
        if (indexi == 0) {
            System.out.println();
        } else {
            System.out.println();
        }
        if (indexj == intArr.length - 1) {

        } else {
            System.out.println();
        }


    }
}
