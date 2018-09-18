package org.kratenok.task;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] mass = new int[4][4][4];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                for (int k = 0; k < mass[0][0].length; k++) {
                    mass[i][j][k] = random.nextInt(100);
                }

            }

        }

        //ищем элементы
        int min = Integer.MAX_VALUE, max = 0 ;
        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass[0].length; j++) {
                for (int k = 0; k < mass[0][0].length; k++) {
                    System.out.println(mass[i][j][k]);
                    if (mass[i][j][k]>max){
                        max = mass[i][j][k];
                    }
                    if (mass[i][j][k]>max){
                        max = mass[i][j][k];
                    }
                }

            }
        }
        System.out.println("min = " + min + "max");
    }


}

