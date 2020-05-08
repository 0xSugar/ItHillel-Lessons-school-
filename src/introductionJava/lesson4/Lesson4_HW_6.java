package introductionJava.lesson4;

import java.io.*;

/**
 * 6) Напишите программу, которая получает символ (кодовую точку Unicode) по 1, 3 и 9 индексу в строке.
 * Воспользуйтесь методом codePointAt() в классе String.
 *
 * Например для строки "Ура! Java!" необходимо получить в консоле следующее:
 *  Character(at index 1) = 1088
 *  Character(at index 3) = 33
 *  Character(at index 9) = 33
 */

public class Lesson4_HW_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //ввод строки длинее 9 символов
        System.out.print("Введите строку: ");
        String text = reader.readLine();
        while (text.length() < 9) {
            System.out.println("\nСтрока слишком короткая. Введите длинее: ");
            text = reader.readLine();
        }

        System.out.println("Character(at index 1) = " + text.codePointAt(1));
        System.out.println("Character(at index 3) = " + text.codePointAt(3));
        System.out.println("Character(at index 9) = " + text.codePointAt(9));
    }
}
