package lessons.lesson4;

/**
 * 5) Объявите и проинициализируйте переменные типа char разными значениями.
 * Выведите в консоль результат работы методов класа оболочки Character для каждой переменной.
 *
 * isLetter()
 * isDigit()
 * isWhitespace()
 * isUpperCase()
 * isLowerCase()
 * toUpperCase()
 * toLowerCase()
 * toString()
 * Разобраться что делают эти методы.
 */

public class Lesson4_HW_5 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '5';
        char c3 = ' ';
        char c4 = 'ы';
        char c5 = '\u00B2';
        System.out.println("У нас есть:");
        System.out.println("char c1 = 'A'; \nchar c2 = '5'; \nchar c3 = ' '; \nchar c4 = 'ы'; \nchar c5 = '\u00b2'");
        System.out.println("\nCharacter.isLetter(c1) = " + Character.isLetter(c1) + " (это буква?)");
        System.out.println("Character.isDigit(с2) = "  + Character.isDigit(c2) + " (это цифра?)");
        System.out.println("Character.isWhitespace(c3) = "  + Character.isWhitespace(c3) + " (это пробел?)");
        System.out.println("Character.isUpperCase(c1) = "  + Character.isUpperCase(c1) + " (это большая буква?)");
        System.out.println("Character.isLowerCase(c4) = "  + Character.isLowerCase(c4) + " (это маленькая буква?)");
        System.out.println("Character.toUpperCase(c4) = "  + Character.toUpperCase(c4) + " (изменить букву на строчную)");
        System.out.println("Character.toLowerCase(c1) = "  + Character.toLowerCase(c1) + " (изменить букву на прописную)");
        System.out.println("Character.toString(c1) = "  + Character.toString(c1) + " (выведи на экран)");
        System.out.println("с5 просто для красоты = "  + c5);
    }
}
