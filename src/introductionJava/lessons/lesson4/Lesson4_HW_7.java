package introductionJava.lessons.lesson4;

import java.io.*;

/**
 * 7) Напишите программу, в которой пользователю нужно ввести один символ из алфавита.
 * В зависимости от ввода пользователя, выведите в консоль: "Гласная буква" или "Согласная буква".
 * Если пользовательский ввод не является буквой (между а и я или А и Я) или является строкой длиной > 1,
 *  выведите сообщение об ошибке.
 * Проверку является ли введенный символ буквой (между а и я или А и Я) осуществить с помощью проверки кодов Юникоде.
 * Обратите внимание, что символы Ё и ё не входят в диапазон А-я.
 *
 * P.S.: Гласные / согласные взяты на сайте http://www.fio.ru/tables/letters/soglasnye-i-glasnye-bukvy-tablitsa/
 * P.P.S.: поддерживает только RU буквы
 */

public class Lesson4_HW_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите один символ из алфавита: ");
        String text = reader.readLine();                                                        // считываем строку

        if ((text.length() < 2 && text.charAt(0) <= '\u044F' && text.charAt(0) >= '\u0410') ||  // проверка на длину и буквы алфавита
        text.charAt(0) == '\u0451' || text.charAt(0) == '\u0401') {                         // проверка на ё/Ё
            text = text.toLowerCase();
            if (text.charAt(0) == 'а' || // Маленькие гласные
                text.charAt(0) == 'о' ||
                text.charAt(0) == 'и' ||
                text.charAt(0) == 'е' ||
                text.charAt(0) == 'ё' ||
                text.charAt(0) == 'э' ||
                text.charAt(0) == 'ы' ||
                text.charAt(0) == 'у' ||
                text.charAt(0) == 'ю' ||
                text.charAt(0) == 'я') {

                    System.out.println("Гласная буква");

            } else { // ну и все остальные

                System.out.println("Согласная буква");

            }
        } else { // исполнится если строка длинее 1го символа или введен неподходящий символ
            System.out.print("\nВывожу сообщение про ошбику...");
        }
    }
}
