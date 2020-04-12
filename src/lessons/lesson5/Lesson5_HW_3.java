package lessons.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3.1) Напишите программу, которая принимает число, введенное пользователем
 * и печатает в консоль фразу положительное или отрицательное это было число.
 * Логику определения положительное число или отрицательное вынесите в метод.
 * Метод должен принимать один параметр (само число) и возвращать строку типа String со значением
 * "Положительное число" или "Отрицательное число" в зависимости от значения числа. Результат работы
 * метода выведите в консоль.
 */
public class Lesson5_HW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(whatNumberItIs(number));
    }

    private static String whatNumberItIs(int number) {
        if (number == 0) {
            return "Число нейтральное";
        }
        if (number > 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }
}
