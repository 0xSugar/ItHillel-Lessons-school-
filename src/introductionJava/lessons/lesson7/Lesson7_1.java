package introductionJava.lessons.lesson7;

public class Lesson7_1 {
    public static void main(String[] args) {
        System.out.println(isOdd(4));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(9, 11));
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            int result = 0;
            for (; start <= end; start++) {
                if (isOdd(start)) {
                    result += start;
                }
            }
            return result;
        }
    }
}
