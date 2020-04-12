package lessons.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3.4) Напишите программу решения квадратного уравнения. Входные данные получите с помощью класса
 * Scanner (a, b, c). В программу добавьте метод вычисления дискриминанта, метод вычисления первого
 * корня уравнения, метод вычисления второго корня уравнения и метод вычисления корня, если
 * дискриминант равен 0. Выведите в консоль найденные корни уравнения.
 */

public class Lesson5_HW_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        // Ввод a, b & c
        System.out.print("Введите a: ");
        double a = Double.parseDouble(rd.readLine());
        System.out.print("\nВведите b: ");
        double b = Double.parseDouble(rd.readLine());
        System.out.print("\nВведите c: ");
        double c = Double.parseDouble(rd.readLine());
        System.out.println();
        double discriminant = getDiscriminant(a, b, c);

        if (discriminant < 0) {
            System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.");
        } else {
            if (discriminant > 0) {
                moreThanZero(a, b, discriminant);
            } else {
                equalsZero(a, b);
            }
        }
    }

    private static double getDiscriminant(double a, double b, double c) {
        return (b*b) - 4 * a * c;
    }

    private static void moreThanZero(double a, double b, double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Уравнение имеет два кореня.\nПервый корень = " + x1 + ", второй = " + x2);
    }

    private static void equalsZero(double a, double b) {
        double x1;
        x1 = -b / (2 * a);
        System.out.println("Уравнение имеет один корень, x = " + x1);
    }
}
