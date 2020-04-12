package lessons.lesson5;

import java.util.Scanner;

/**
 * 3.3) Напишите программу, которая вычисляет площадь и периметр треугольника. Входные данные получите с
 * помощью класса Scanner. В программу добаьте два метода calculateSquare и calculatePerimeter. Методы
 * должны возвращать вычисленный результат площади и периметра соответственно. Выведите результаты работы
 * этих методов в консоль.
 */

public class Lesson5_HW_5 {

    private static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону №1: ");
        double n1 = sc.nextDouble();
        System.out.print("\nВведите сторону №2: ");
        double n2 = sc.nextDouble();
        System.out.print("\nВведите сторону №3: ");
        double n3 = sc.nextDouble();

        double perimeter = getPerimeter(n1, n2, n3);
        double area = getArea(n1, n2, n3, perimeter);

        System.out.println("Периметр = " + perimeter + ", площадь = " + area);
    }

    private static Double getPerimeter(double n1, double n2, double n3) {
        return n1+n2+n3;
    }

    private static Double getArea(double n1, double n2, double n3, double perimeter) {
        double smallPerimeter = perimeter / 2;
        return Math.sqrt(smallPerimeter * (smallPerimeter - n1) * (smallPerimeter - n2) * (smallPerimeter - n3));
    }
}
