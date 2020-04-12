package introductionJava.lessons.lesson7;

import java.io.*;


public class Lesson7_HW_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите высоту (к примеру 8): ");
        int height = Integer.parseInt(rd.readLine());
        System.out.print("Введите ширину (к примеру 8): ");
        int width = Integer.parseInt(rd.readLine());
        System.out.println("Каким знаком показывать?");
        String sign = rd.readLine() + " ";
        rd.close();

        StringBuilder line = new StringBuilder(""); // полагаю очевидно почему именно его я использовал
        for (int i = 0; i < width/2; i++) {         // зачем забивать пул ненужными строками
            line.append(sign);
        }

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }
}
