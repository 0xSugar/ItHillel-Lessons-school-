package introductionJava.lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2_HW_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите градусы в Фаренгейте: ");
        double f = Double.parseDouble(rd.readLine());   //судя по формуле в инете..
        System.out.println((f-32)/1.8);                 // это (F-32) / 1.8

    }
}
