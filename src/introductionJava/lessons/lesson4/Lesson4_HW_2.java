package introductionJava.lessons.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Сделано через BufferedReader. По желанию можно раскомментить считывание через сканер и закомментить
 * считывание через BR.
 *
 * 2) Напишите программу, которая принимает два числа в качестве входных данных с помощью класса Scanner и
 * отображает произведение двух чисел.
 *
 * Ожидаемый вывод в консоле:
 *  Введите первое число: 25
 *  Введите второе число: 5
 *  Произведение числел 25 x 5 = 125
 */

public class Lesson4_HW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);  // объявление и создание объекта
        System.out.print("Введите первое число: ");
//        int a = sc.nextInt();                 // считывание числа a
        int a = Integer.parseInt(reader.readLine());
        System.out.print("\nВведите второе число: ");
//        int b = sc.nextInt();                 // считывание числа b
        int b = Integer.parseInt(reader.readLine());
        int count = a * b;
        System.out.println("\nПроизведение числел " + a + " x " + b + " = " + count);
    }

}
