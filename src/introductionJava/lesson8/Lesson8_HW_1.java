package introductionJava.lesson8;

import java.io.*;

public class Lesson8_HW_1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите число: ");
//        int numb = Integer.parseInt(rd.readLine());
        int numb = 10108;

        // Сумма всех цифер в числе
        System.out.println("Sum = " + getSum(numb) + "\n");

        // Сумма значений массива
        int[] array = {40, 20, 30, -436, 3523, 412, 3, 21, 3, 123, 7, -5679, 6754, 324, -10};
        int length = array.length - 1;
        System.out.println("Sum[] = " + getSum(array, length) + "\n");

        // Максимум
        int number = array[length];
        System.out.println("Max[] = " + getMax(array, length, number));

    }

    private static int getSum(int numb) {
        if (numb >= 10) {
            return numb % 10 + getSum(numb / 10);
        } else {
            return numb;
        }
    }

    private static int getSum(int[] array, int count) {
        if (count == 0) {
            return array[count];
        } else {
            return array[count] + getSum(array, count - 1);
        }
    }

    private static int getMax(int[] array, int count, int number) {
        if (count == 0) {
            if (number > array[count]) {
                return number;
            } else {
                return array[count];
            }
        }
        if (number > array[count]) {
            return getMax(array, count - 1, number);
        } else {
            return getMax(array, count - 1, array[count]);
        }
    }
}
