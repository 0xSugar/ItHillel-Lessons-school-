package introductionJava.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4) Напишите программу, которая вычисляет и печатает в консоль площадь и периметр круга.
 * С помощью Scanner программа должна получать в качестве входных данных радиус.
 *
 * Например, для Radius = 7.5 ожидаемый вывод в консоле:
 *
 *  Perimeter is = 47.12388980384689
 *  Area is = 176.71458676442586
 */

public class Lesson4_HW_4 {

    private static final double PI = 3.141592653589793;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Радиус: ");
        double radius = Double.parseDouble(reader.readLine());
        double perimeter = 2*PI*radius;
        double area = PI * Math.pow(radius, 2);
        System.out.println("\nPerimeter is = " + perimeter + "\nArea is = " + area);
    }
}
