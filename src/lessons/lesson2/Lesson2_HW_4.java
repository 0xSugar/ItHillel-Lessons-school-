package lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Решил немного зациклить. Программа выключается при написании exit
 * пока в первом условии будет false - он будет продолжать
 * выполнять код. Дословно звучик как "если фраза в check
 * это не слово 'exit', тогда fasle. В while стоит условие,
 * "false не равняется true" -> это правда (true) и он выполняет.
 * Если будет true, то условие "true не равняется true" - это
 * не правда -> false и он закончит.
 */
public class Lesson2_HW_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите значение для дюйма: ");
        String check = rd.readLine();

        while (check.equals("exit") != true){
            double n = Double.parseDouble(check);
            System.out.println(n + " дюйма - это " + (n*0.0254) + " метра");
            System.out.print("Введите значение для дюйма: ");
            check = rd.readLine();
        }
    }
}


