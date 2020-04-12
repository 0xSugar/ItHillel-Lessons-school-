package lessons.lesson7;

import java.io.*;

public class Lesson7_HW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите колличество строк: ");
        int line = Integer.parseInt(rd.readLine());
        rd.close();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
