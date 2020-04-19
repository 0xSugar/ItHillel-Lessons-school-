package introductionJava.lessons.lesson10;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * НЕПРАВИЛЬНОЕ ПОНИМАНИЕ (в мусорку)
 * Логика - записать результат анализа во второй массив (сколько раз в какой строке
 * повторяются элементы), после чего проанализовать второй массив и вывести индекс
 * строки, в которой повторялись числа больше всего раз. Если их больше одного -
 * вывести индекс вторго числа.
 *
 * Должен признать, за минут 10 без гугла лучшей логики не придумал. Я думаю есть
 * гораздо лучше, если посидеть подольше.
 *
 * Мною проверено - работает. Но ведь в программировании работа - не главное, да) Все
 * оно должно работать, в любом случае.. главное - читаемость...
 *
 * ПРАВИЛЬНОЕ
 * Логика та же, +/-, просто чуть изменена.. зачем писать что-то новое, когда рядом
 * есть что-то уже работающее? Ну логично же..
 */

public class Lesson10_HW_2 {
    private static int minNumb = -5;
    private static int maxNumb = 6;

    public static void main(String[] args) {
        int[][] array = fillArray(7, 5);

        // временный массив (вместо мапы), куда сохранится результат анализа массива array
        int[][] temp = new int[array.length][1];

        // получаем число умножения чисел в каждой строке (их 7)
        for (int i = 0; i < array.length; i++) {
            temp[i][0] = multiplyAll(array, i);
        }

        // вывод той самой строки
        printIndex(temp);

        // для проверки
//        System.out.println(Arrays.deepToString(array));
//        System.out.println(Arrays.deepToString(temp));
    }

    private static int multiplyAll(int[][] array, int row) {
        int result = 1;
        for (int i = 0; i < array[row].length; i++) {
            result *= array[row][i];
        }
        return result;
    }

    private static void printIndex(int[][] temp) {
        // Узнаю максимальное число и сколько раз оно было. Осталось
        // только, если было 1 раз - вывести ряд, если больше - вывести вторую сверху
        int maxNumber = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i][0] > maxNumber) {
                maxNumber = temp[i][0];
                count = 1;
            } else if (temp[i][0] == maxNumber) {
                count++;
            }
        }
        print(temp, count, maxNumber);
    }

    private static void print(int[][] temp, int count, int maxNumber) {
        if (count == 1) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][0] == maxNumber) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            int isSecond = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][0] == maxNumber) {
                    isSecond++;
                }
                if (isSecond == 2) {
                    System.out.println(i);
                    return;
                }
            }
        }
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

/*

public class Lesson10_HW_2 {
    private static int minNumb = -5;
    private static int maxNumb = 6;

    public static void main(String[] args) {
        int[][] array = fillArray(7, 5);

        // временный массив (вместо мапы), куда сохранится результат анализа массива array
        int[][] temp = new int[array.length][1];

        // получаем число, сколько раз одно число повторяется в одной строке (их 7)
        for (int i = 0; i < array.length; i++) {
            temp[i][0] = getRepeatingNumber(array, i);
        }

        // вывод той самой строки
        printIndex(temp);

        // для проверки
//        System.out.println(Arrays.deepToString(array));
//        System.out.println(Arrays.deepToString(temp));
    }

    private static int getRepeatingNumber(int[][] array, int row) {
        int length = array[row].length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int temp = 0;
            for (int j = 0; j < length; j++) {
                if (array[row][i] == array[row][j]) {
                    temp++;
                }
            }
            if (count < temp) {
                count = temp;
            }
        }
        return count;
    }

    private static void printIndex(int[][] temp) {
        // Узнаю максимальное число повторов и сколько раз оно было. Осталось
        // только, если было 1 раз - вывести линию, если больше - вывести вторую сверху
        int maxRepeatingNumber = 0;
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i][0] > maxRepeatingNumber) {
                maxRepeatingNumber = temp[i][0];
                count = 1;
            } else if (temp[i][0] == maxRepeatingNumber) {
                count++;
            }
        }
        print(temp, count, maxRepeatingNumber);
    }

    private static void print(int[][] temp, int count, int maxRepeatingNumber) {
        if (count == 1) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][0] == maxRepeatingNumber) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            int isSecond = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][0] == maxRepeatingNumber) {
                    isSecond++;
                }
                if (isSecond == 2) {
                    System.out.println(i);
                    return;
                }
            }
        }
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
} */