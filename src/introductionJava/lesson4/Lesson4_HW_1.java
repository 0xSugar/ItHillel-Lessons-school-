package introductionJava.lesson4;

/**
 * 1) Напишите программу для печати результата следующих операций.
 *  a) -5 + 8 * 6
 *  b) (55 + 9) % 9
 *  c) 20 + -3 * 5 / 8
 *  d) 5 + 15 / 3 * 2 - 8 % 3
 *  e) ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 *
 * Ожидаемый вывод в консоле:
 *  -5 + 8 * 6 = 43
 *  (55 + 9) % 9 = 1
 *  20 + -3 * 5 / 8 = 19
 *  5 + 15 / 3 * 2 - 8 % 3 = 13
 *  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.138888888888889
 */
public class Lesson4_HW_1 {
    public static void main(String[] args) {
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("(55 + 9) % 9 = " + (55 + 9) % 9);
        System.out.println("20 + -3 * 5 / 8 = " + (20 - 3 * 5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3*2 -8 % 3)); // Сомневаюсь на счет этого.. может 15 / (3*2)?
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
}