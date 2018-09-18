package org.kratenok.task;

public class task6 {
    public static void main(String[] args) {
        String start = "19:52:59";
        String finish = "16:14:16";
        String[]arrStart = start.split(":");
        String[]arrFinish = finish.split(":");
        int []arrResult =new int[arrStart.length];
        int startTemp, finishTemp;
        for (int i = 0; i < arrStart.length ; i++) {
            startTemp = Integer.parseInt(arrStart[i]);
            finishTemp = Integer.parseInt(arrFinish[i]);
            if (finishTemp - startTemp >= 0){
                arrResult[i] = finishTemp - startTemp;

            }else {
                if (i !=0) {
                    arrResult[i] = finishTemp + 60 - startTemp;
                }
                arrResult[i] = finishTemp + 24 - startTemp;
            }

        }
        System.out.println("Результат:" + arrResult[0]+ ":" + arrResult[1]+ ":" + arrFinish[2]);
    }

}
