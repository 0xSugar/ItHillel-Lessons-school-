package introductionJava.lessons.lesson7;

public class Lesson7_HW_6 {
    public static void main(String[] args) {
        // легче просто было бы зайти куда-то на JavaRush и просто скопировать мое готовое решение,
        // что я месяц назад решал.. но это долго
        System.out.println(sumDigits (-5));
        System.out.println(sumDigits (9));
        System.out.println(sumDigits (10));
        System.out.println(sumDigits (125));
        System.out.println(sumDigits (12412421));
        System.out.println(sumDigits (999999999));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            // У меня есть 2 варианта.. это регулярки "\\d{1}" (супер просто) или по старинке
            // скопировать готове решение С МОЗГА.. т.к. я просто запомнил как решалась эта
            // ужасная задача, бе бе бе.. я тогда над ней час точно просидел..

            // НЕ КРАСИВО:
            int count = 0;
            while (number !=0) {        // зато так понятней... ¯\_(ツ)_/¯
                count += number % 10;
                number /= 10;
            }

            /* Красиво:
            for ( ; number != 0; number /= 10) {
                count += number % 10;
            }
             */
            return count;
        }
    }
}
