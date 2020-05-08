package introductionJava.lesson10;

import java.util.SplittableRandom;

/**
 * Логика - берем каждую строку и определяем min и max, после чего проходимся по каждому
 * числу в строке, и если это число min - меням местами с первым, если max - с последним
 */

public class Lesson10_HW_3 {
    private static int minNumb = 0;
    private static int maxNumb = 9;

    public static void main(String[] args) {
        int[][] array = fillArray(3, 5);

        for (int i = 0; i < array.length; i++) {
            int min = getMin(array, i);                 // берем min и max
            int max = getMax(array, i);
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) {               // меняем min на первое
                    int temp = array[i][0];
                    array[i][0] = array[i][j];
                    array[i][j] = temp;
                }
                if (array[i][j] == max) {               // меняем max на последнее
                    int lastEl = array[i].length-1;
                    int temp = array[i][lastEl];
                    array[i][lastEl] = array[i][j];
                    array[i][j] = temp;
                }
            }
        }

        // проверка
//        System.out.println(Arrays.deepToString(array));
    }

    private static int getMax(int[][] array, int row) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array[row].length; i++) {
            if (max < array[row][i]) {
                max = array[row][i];
            }
        }
        return max;
    }

    private static int getMin(int[][] array, int row) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array[row].length; i++) {
            if (min > array[row][i]) {
                min = array[row][i];
            }
        }
        return min;
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
}
