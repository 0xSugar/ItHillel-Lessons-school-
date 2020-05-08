package introductionJava.lesson7;

public class Lesson7_HW_4 {
    public static void main(String[] args) {
        System.out.println("FizzBuzz:");

        for (int i = 1; i <= 100; i++) { // думаю имелось ввиду включительно
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
