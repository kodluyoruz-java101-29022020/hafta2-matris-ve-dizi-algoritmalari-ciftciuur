package org.kodluyoruz.questionOne;

import java.util.Arrays;

public class QuestionOne {
    public static void main(String[] args) {

        int array[][] = fillArray(new int[5][5], 2);
        matrixElementWrite(array);
    }

    /*
        TODO : liste sıfır ve birlerden olusturdum fakat soruyu tam anlayamadım okuyup tekrar deneyeceğim
     */
    public static int[][] fillArray(int array[][], int number) {
        for (int i = 0; i < array.length; i++) {
            // do the for in the row according to the column size
            for (int j = 0; j < array[i].length; j++) {
                // multiple the random by 10 and then cast to in
                array[i][j] = ((int) (Math.random() * number));
            }
        }
        return array;
    }

    public static void matrixElementWrite(int array[][]) {
        for (int[] row : array)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }


}
