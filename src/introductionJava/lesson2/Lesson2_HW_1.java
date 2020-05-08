package introductionJava.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2_HW_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число: ");
        int n = Integer.parseInt(rd.readLine());
        System.out.println("Сумма всех цифр в " + n + " равна " + count(n));
    }

    public static int count (int n){        // передали число
        int res = 0;                        // инициировали переменную res
        for (; n>0 ; n /= 10){              // цикл, будет выполнять, пока n больше 0
            res = res + (n%10);             // добавляем к res последнюю цифру в числе n
        }                                   // число n делится на 10, проверяется на условие n>0 и...
        return res;     //во2звращает результат типа int
    }
}
