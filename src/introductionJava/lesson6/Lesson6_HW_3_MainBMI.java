package introductionJava.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6_HW_3_MainBMI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваше имя: ");
        String name = reader.readLine();
        System.out.print("\nВведите ваш вес в кг (пример 78.8): ");
        double weight = Double.parseDouble(reader.readLine());
        System.out.print("\nВведите ваш вес в см (пример 169): ");
        int height = Integer.parseInt(reader.readLine());

        // все ок, можно в какой угодно последовательности массу с ростом вбивать \^ ^/
        double bmi = Lesson6_HW_3_BodyMassIndex.calculateBodyMassIndex(weight, height);
        System.out.println("Вывожу результат работы: " + bmi); //
        Lesson6_HW_3_BodyMassIndex.printResult(name, weight, height, bmi);
    }
}
