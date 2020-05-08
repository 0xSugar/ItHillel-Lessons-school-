package introductionJava.lesson5;

import java.io.*;

/**
 * 1) Переписать задачу определения гласная или согласная введенная буква.
 * В програме использовать if-else оператор
 *     if (длина символов > 1) {
 *       // Выводим ошибку
 *     } else if (введенный символ не в диапазоне от А до я и не равен ё или Ё) {
 *       // Ошибка: Вы ввели некорректный символ
 *     } else {
 *       // основная логика
 *       // В русском языке 10 гласных букв (а, у, о, ы, и, э, я, ю, ё, е)
 *       // Приводим символ к нужному регистру
 *       // Определяем является ли введенный символ гласной или согласной буквой
 *     }
 */

public class Lesson5_HW_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите один символ из алфавита: ");
        String text = reader.readLine();
        text = text.toLowerCase();

        if (text.length() > 1) {
            System.out.println("\nВывожу сообщение про ошбику...");
        } else {
            if (!(text.charAt(0) <= '\u044F' & text.charAt(0) >= '\u0410' || text.charAt(0) == '\u0451')) {
                System.out.println("\nВывожу сообщение про ошбику...");
            } else {
                char symb = text.charAt(0);
                if (symb == 'а' || symb == 'о' || symb == 'и' || symb == 'е' || symb == 'ё' || symb == 'э' || symb == 'ы' || symb == 'у' || symb == 'ю' || symb == 'я') {
                    System.out.println("Гласная буква");
                } else {
                    System.out.println("Согласная буква");
                }
            }
        }

//        Или же ты хотел, что бы было вот так?
//        char symb = text.charAt(0);
//        if (text.charAt(0) <= '\u044F' & text.charAt(0) >= '\u0410' || text.charAt(0) == '\u0451') {
//            if (symb == 'а' || symb == 'о' || symb == 'и' || symb == 'е' || symb == 'ё' || symb == 'э' || symb == 'ы' || symb == 'у' || symb == 'ю' || symb == 'я') {
//                System.out.println("Гласная буква");
//            } else {
//                System.out.println("Согласная буква");
//            }
//        } else {
//            System.out.println("\nВывожу сообщение про ошбику...");
//        }
    }
}
