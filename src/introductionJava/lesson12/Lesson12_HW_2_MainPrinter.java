package introductionJava.lesson12;

/**
 * Что бы напечатать - нужно создать объект и передать в метод print 2 значения:
 * 1. Сколько страниц печатать, число
 * 2. Печатать листы или страницы (true / false)
 *
 * Остальное он сделает сам.
 */

public class Lesson12_HW_2_MainPrinter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("------>> Создаем объект и выводим данные");
        Lesson12_HW_2_Printer printer = new Lesson12_HW_2_Printer(100, "true");
        work(printer);


        System.out.println("|-----------------------------------------------------------|\n\n");
        System.out.println("Создаем недуплексный принтер и все повторяем");
        System.out.println("------>> Создаем объект и выводим данные");
        Lesson12_HW_2_Printer notDuplexPrinter = new Lesson12_HW_2_Printer(100, "false");
        work(notDuplexPrinter);
    }

    public static void work(Lesson12_HW_2_Printer printer) throws InterruptedException {
        printer.getTonerLever();
        printer.refuelToner();
        System.out.println("Напечатано = " + printer.getPrintedLists());

        System.out.println("\n------>> Печатаем 100 листков и 100 страниц");
        printer.print(100, true);
        printer.print(100, false);
        System.out.println("Напечатано = " + printer.getPrintedLists());

        System.out.println("\n------>> Печатаем 1400 листков");
        printer.print(1400, true);
        printer.refuelToner();
        printer.getTonerLever();

        System.out.println("\n------>> Повторо печатаем 1400 листков");
        printer.print(1400, true);
        printer.refuelToner();
        printer.getTonerLever();
        System.out.println("Напечатано = " + printer.getPrintedLists());

        System.out.println("\n------>> Пробуем напечатать 1600 страниц (что в принципе за раз нереально)");
        printer.print(1600, false);
        System.out.println("Напечатано = " + printer.getPrintedLists());

        System.out.println("\n------>> Печатаем 1500 страниц");
        if (printer.isFull()) {
            printer.print(1500, false);
        } else {
            printer.refuelToner();
            printer.print(1500, false);
        }
    }
}
