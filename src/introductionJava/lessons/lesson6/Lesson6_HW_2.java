package introductionJava.lessons.lesson6;

public class Lesson6_HW_2 {
    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDayOfTheWeek("3");
        printDayOfTheWeek(7);
        printDayOfTheWeek("7");
        printDayOfTheWeek(13);
        printDayOfTheWeek("90");
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void printDayOfTheWeek(String day) {
        int numb = Integer.parseInt(day);
        if (numb == 1) {
            System.out.println("Понедельник");
        } else if (numb == 2) {
            System.out.println("Вторник");
        } else if (numb == 3) {
            System.out.println("Среда");
        } else if (numb == 4) {
            System.out.println("Четверг");
        } else if (numb == 5) {
            System.out.println("Пятница");
        } else if (numb == 6) {
            System.out.println("Суббота");
        } else if (numb == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Invalid day");
        }
    }
}
