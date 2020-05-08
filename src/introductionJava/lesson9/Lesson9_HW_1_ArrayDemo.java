package introductionJava.lesson9;

import java.util.Arrays;

public class Lesson9_HW_1_ArrayDemo {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Изначальный массив: " + Arrays.toString(array) + "\n");

        int sum = arraySum(array);
        double average = arrayAverage(array);
        int max = arrayMax(array);

        int someNumber = 10;
        int[] newArray = getBetterArray(array, someNumber);


        System.out.println("Сумма всех чисел массива array = " + sum);
        System.out.println("Среднее всех чисел массива array = " + average);
        System.out.println("Максимум из всех чисел массива array = " + max);
        System.out.println("Новый массив (старый + " + someNumber + " ячеек) = " + Arrays.toString(newArray));
        reverseArray(newArray);
        System.out.println("\"Развернули\" новый массив, и тепер он = " + Arrays.toString(newArray));

    }

    private static int arraySum(int[] array) {
        int numb = 0;
        for (int ar : array) {
            numb += ar;
        }
        return numb;
//        return Arrays.stream(array).sum();
    }

    private static double arrayAverage(int[] array) {
        return (double) arraySum(array) / array.length;
    }

    private static int arrayMax(int[] array) {
        int max = 0;
        for (int numb : array) {
            if (max < numb) {
                max = numb;
            }
        }
        return max;
//        return Arrays.stream(array).max().getAsInt();
    }

    private static int[] getBetterArray(int[] array, int someNumber) {
        int[] newArray = new int[array.length + someNumber];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

//    private static void reverseArray(int[] array) {
//        int length = array.length - 1;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length-i; j++) {
//                int tmp = array[j];
//                array[j] = array[j + 1];
//                array[j + 1] = tmp;
//            }
//        }
//    }
    private static void reverseArray(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);

        for (int i = 0; i <= array.length-1; i++) {
            int copyIndex = (array.length-1) - i;
            array[i] = copy[copyIndex];
        }
    }
    private static void reverseArrayTwo(int[] array) {  // same as reverseArray
        for (int i = 0; i < array.length / 2; i++) {
            int lastIndex = array[(array.length - 1) -i];

            int tmp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tmp;
        }
    }


}
