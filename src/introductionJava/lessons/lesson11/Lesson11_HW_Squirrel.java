package introductionJava.lessons.lesson11;

import java.io.*;

public class Lesson11_HW_Squirrel {

    private static String[] array = new String[90];

    public static void main(String[] args) throws IOException {
        String filePath = "src/introductionJava/lessons/lesson11/journalEvents_ru.csv";

        writeToArray(filePath);                     // Копируем все из файла в массив для дальнейшей работы

        String[] uniqueWords = getUniqueWords();    // получаем массив с уникальных слов

        String[] onlyTrue = getByKey("true");       // разделяем массив на true и фолс строки
        String[] onlyFalse = getByKey("false");

        System.out.println("Для корреляции > 0.1 или < -0.1");
        for (String word : uniqueWords) {           // получаем закономерность и выводим
            double fi = getFi(word, onlyTrue, onlyFalse);
            if (fi > 0.1 || fi < -0.1) {
                System.out.println(String.format("%-23s: %.5f", word, fi));
            }
        }
    }

    /**
     * Считает и выводит "Фи" в консоль
     * @param word  наше уникальное значение || действие (там зубы чистит, ест редиску, газету читает)
     * @param onlyTrue  массив со строками, в которых было превращение
     * @param onlyFalse массив со строками, в которых не было превращения
     */
    private static double getFi(String word, String[] onlyTrue, String[] onlyFalse) {
        int noEventNoAction = getAllCasesNoEvent(word, onlyFalse);      // Нет события нет превращения
        int noEventIsAction = getAllCasesNoEvent(word, onlyTrue);       // Нет события есть превращения
        int isEventNoAction = getAllCasesWithEvent(word, onlyFalse);    // Есть событие нет превращение
        int isEventIsAction = getAllCasesWithEvent(word, onlyTrue);     // Есть события есть превращение

        double fi = ((isEventIsAction * noEventNoAction) - (noEventIsAction * isEventNoAction)) /
                    Math.sqrt((isEventIsAction + noEventIsAction) *
                            (noEventNoAction + isEventNoAction) *
                            (isEventIsAction + isEventNoAction) *
                            (noEventNoAction + noEventIsAction));
        return fi;
    }

    /**
     * Считает сколько раз слово встречалось в переданном массиве
     * P.S.: в нашем случае сколько раз было совершенно действие и превращение было (если массив true)
     * или сколько раз было совешенно действие и превращения не было (если массив false)
     * @param word какое слово должно встречаться
     * @param whereToSearch в каком листе
     * @return число, сколько слово встречалось в массиве
     */
    private static int getAllCasesWithEvent(String word, String[] whereToSearch) {
        int result = 0;
        for (String line : whereToSearch) {
            if (line.contains(word)) {
                result++;
            }
        }
        return result;
    }

    /**
     * Считает сколько раз слово НЕ встречалось в переданном массиве
     * P.S.: в нашем случае сколько раз не было совершенно действие, а превращение было в случае первращения (если массив true)
     * или сколько раз не было совершено действие и превращения не было (если массив false)
     * @param word какое слово НЕ должно встречаться
     * @param whereToSearch в каком листе
     * @return число, сколько слово не встречалось в массиве
     */
    private static int getAllCasesNoEvent(String word, String[] whereToSearch) {
        int result = 0;
        for (String line : whereToSearch) {
            if (!line.contains(word)) {
                result++;
            }
        }
        return result;
    }

    /**
     * Получаем массив уникальных действий (слов), что он делал
     * @return массив уникальных действий
     */
    private static String[] getUniqueWords() {
        StringBuilder builder = new StringBuilder("");  // создаем билдер
        for (String line : array) {                     // заполняем его всеми строками
            builder.append(line);
        }                                               // убираем true или false и передаем строке
        String line = builder.toString().replaceAll("true|false", "");
        String[] allWords = line.split(",");     // разбиваем на массив по ,

        builder = new StringBuilder();                  // берем новый билдер

        for (String word : allWords) {                  // проверяем, если такой строки там еще нет:
            if (!builder.toString().contains(word)) {   // добавляем.. с запятой
                builder.append(word).append(",");       // получаются уникальные слова
            }
        }
        return builder.toString().split(",");    // возвращаем массив с уникальными словами
    }

    /**
     * Ищет в массиве все строки, которые содержут ключ, заносят их в массив и вызращают
     * @param key по какому совпаденю отбирать строки
     * @return  массив со строками, что имеют ключ
     */
    private static String[] getByKey(String key) {
        int count = 0;      // узнаем сколько найдено строк по ключу
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(key)) {
                count++;
            }
        }                   // создаем массив и добавляем
        String[] result = new String[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(key)) {
                result[count] = array[i];
                count++;
            }
        }
        return result;
    }

    /**
     * Считывает с файла строки и заносит в массив
     * @param path
     * @throws IOException
     */
    private static void writeToArray(String path) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(path));
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.readLine();
        }
        rd.close();
    }
}
