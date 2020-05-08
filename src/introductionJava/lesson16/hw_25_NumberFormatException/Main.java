package introductionJava.lesson16.hw_25_NumberFormatException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "src/introductionJava/lessons/lesson16/hw_25_NumberFormatException/file.txt";
        BufferedReader rd = new BufferedReader(new FileReader(file));

        int numbers = 0;
        int notNumbers = 0;

        while (rd.ready()) {
            try {
                Integer.parseInt(rd.readLine());
                numbers++;
            } catch (Exception e) {         // обобщил ко всем исключениям.. тут больше ошибок быть не может
                notNumbers++;               // разве что поток на чтение кто-то закроет xDD
            }
        }
        rd.close();

        System.out.println(String.format("Чисел %d, не чисел %d", numbers, notNumbers));
    }
}
