package org.kratenok.task;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" + ");
        int result =0;
        for (String  tempWord : words){
            if (tempWord.length()> result){
                result = tempWord.length();
            }
        }
        System.out.println("Самое длинное слово" + result + "символов");
    }

}
