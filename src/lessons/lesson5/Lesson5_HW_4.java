package lessons.lesson5;

/**
 * 3.2) Напишите программу, которая случайным образом генерирует числа в диапазоне от 1 до 100.
 * Определить равно ли число 50. Если да, то вывести на экран фразу о равности случайного числа
 * 50 и завершить работу программы. В программу добавьте метод, который определяет число больше,
 * либо меньше 50. Метод должен принимать один параметр (сгенерированное число) и возвращать тип
 * boolean. В методе main обработайте результат выполнения этого метода и напечатайте в консоль
 * текстовою строку: "Число > 50" или "Число < 50" в зависимости от значения числа.
 */

public class Lesson5_HW_4 {
    public static void main(String[] args) {
        int randomNumber = (int) Math.round((Math.random() * 100));
        if (randomNumber == 50) {
            System.out.println("Число равно 50ти");
        } else {
            String text = (isMoreThan50(randomNumber)) ? "Число > 50" : "Число < 50";
            System.out.println(text);
        }
    }

    private static boolean isMoreThan50(int number) {
        return number > 50;
    }
}
