package introductionJava.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3_HW_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        // Ввод a, b & c
        System.out.print("Введите a: ");
        double a = Double.parseDouble(rd.readLine());
        System.out.print("\nВведите b: ");
        double b= Double.parseDouble(rd.readLine());
        System.out.print("\nВведите c: ");
        double c = Double.parseDouble(rd.readLine());
        System.out.println();
        // вычесляем дискриминант
        double discriminant = (b*b) - 4 * a * c;
        System.out.println("Дискриминант D = " + discriminant);


        double x1, x2;
        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Уравнение имеет два кореня.\nПервый корень = " + x1 + ", второй = " + x2);
        }
        if (discriminant == 0) {
            x1 = -b / (2 * a);
            System.out.println("Уравнение имеет один корень, x = " + x1);
        }
        if (discriminant < 0) {
            System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений.");
        }
    }
}
