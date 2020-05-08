package introductionJava.lesson10;

import java.util.SplittableRandom;

public class Lesson10_HW_1 {
    private static int minNumb = -99;
    private static int maxNumb = 100;

    public static void main(String[] args) {
        int[][] array = fillArray(6, 9);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
//                System.out.print("x" + " ");    // лучше, что бы проверить шахматный порядок
            }
            System.out.print(i % 2 == 0 ? "\n " : "\n");
        }

        System.out.println(getMax(array));
    }

    private static int[][] fillArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        SplittableRandom sr = new SplittableRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sr.nextInt(minNumb, maxNumb);
            }
        }
        return array;
    }


    private static int getMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static int[] fillArray(int rows) { // для меня
        int[] array = new int[rows];
        SplittableRandom sr = new SplittableRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = sr.nextInt(minNumb, maxNumb);
        }
        return array;
    }
}
