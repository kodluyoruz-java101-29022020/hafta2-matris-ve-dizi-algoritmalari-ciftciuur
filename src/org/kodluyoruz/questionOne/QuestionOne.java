package org.kodluyoruz.questionOne;

import java.util.Arrays;

public class QuestionOne {
    public static void main(String[] args) {

        int array[][] = fillArray(new int[5][5], 2);
        matrixElementWrite(array);
        System.out.println("--");
        //matrixElementWrite(convertMatrix(array));
        convertMatrix(array);
    }

    /*
        TODO : liste sıfır ve birlerden olusturdum fakat soruyu tam anlayamadım okuyup tekrar deneyeceğim
     */
    public static int[][] fillArray(int array[][], int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * number));
            }
        }
        return array;
    }

    public static void matrixElementWrite(int array[][]) {
        for (int[] row : array)
            System.out.println(Arrays.toString(row));
    }


    public static int[][] convertMatrix(int[][] array) {

        return null;
    }


}
