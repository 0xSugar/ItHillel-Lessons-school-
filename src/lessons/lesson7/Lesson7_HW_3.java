package lessons.lesson7;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson7_HW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String line = rd.readLine();
        rd.close();
        System.out.println("Количество слов в строке: " + getWordsNumber(line));
    }

    public static int getWordsNumber(String line) {
        String[] array = line.split("\\s");
        return array.length;

    }
}

/*
    Альтернативой можно много как сделать.. к примеру так (не оч..):
int count = 1;
for (int i = 0; i < line.length()-1; i++) {
    char thisChar = line.charAt(i);
    char weNeed = ' ';
    if (thisChar == weNeed) {
        count ++;
    }
}
return count;

    Или так:
Pattern pat = Pattern.compile("[a-zA-Zа-яА-Я]+[^\\s]"); // почему не \\W? - увы оно не учитывает РУ символы
Matcher mat = pat.matcher(line);                        // так же, как и \b не ставит границу слова в
int count = 0;                                          // РУ тексте.. увы и ах
while (mat.find()) {
    count++;
}
return count;


[a-zA-Zа-яА-Я]+[^\\s]
любая RU или US буква, может быть сколько угодно
после не должен быть пробел (т.е. пробелы он не считает)
 */
