package lessons.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2_HW_2 {

    private static final int MIN_IN_DAY = 60 * 24;           // ~ минут в сутках
    private static final int MIN_IN_YEAR = MIN_IN_DAY * 365; // ~ минут в году

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество минут: ");
        int n = Integer.parseInt(rd.readLine());            // Ввод минут

        int years = n / MIN_IN_YEAR;                        // Считает сколько целых годов в числе
        int days = (n % MIN_IN_YEAR) / MIN_IN_DAY;          // Подсчитывает сколько осталось дней за высчетом целых годов
        System.out.println(n + " минут - это примерно " + years + " " + correct(years) + " и " + days + " дней");
    }

    private static String correct(int x) { // Смотрит по числу как правильно выдать - год, года или лет. Почему private? Все равно я не буду вызывать его из других классов, так что это не имеет разницы...
        if (x == 0) return "лет";                           // если 0 - лет
        if (x%10 == 1) return "год";                        // если окончается на 1 - год
        if ((x%10 == 2) | (x%10 == 3) | (x%10 == 4)) return "года"; // на 2, 3 или 4 - года
        else return "лет";                                  // все остальное - лет
    }                                       // День уже не изменял, принцип тот же
}
