package introductionJava.lessons.lesson7;

import java.io.*;

public class Lesson7_HW_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(rd.readLine());
        rd.close();

        for (int i = 0; i <= number; i++) {
            System.out.println(String.format("%d X %d = %d", number, i, (number*i)));
        }
    }
}
