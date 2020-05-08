package introductionJava.lesson12;

public class Lesson12_HW_2_Printer {
    private static final double SPEND_TONER_PER_LIST = 100d / 1500;
    private static final int WAIT_TO_PRINT_LIST = 30;
    // на 1 лист = 0.06% тюнера израсходуется
    // согластно гуглу - 1500 листов за картридж.

    private double toner;
    private int printedLists;
    private boolean isDuplex;

    // К О Н С Т Р У К Т О Р Ы
    // String - потому что во время создания объекта мне захотелось написать не true, а yes.. Дуплексный? - Да
    public Lesson12_HW_2_Printer(double toner, int printedLists, String isDuplex) {
        this.toner = toner > 100 ? 100 : toner;
        this.printedLists = printedLists < 0 ? 0 : printedLists;
        this.isDuplex = isDuplex.equals("yes") || isDuplex.equals("true");
    }

    public Lesson12_HW_2_Printer(double toner, String isDuplex) {
        this(toner, 0, isDuplex);
    }

    // М Е Т О Д Ы
    public int getPrintedLists() {
        return printedLists;
    }

    private void addPrintedLists(int printedLists) {
        if (printedLists > 0 && printedLists <= 1500) {
            this.printedLists += printedLists;
        } else {
            throw new RuntimeException("Произошла какая-то ошибка при добавлении напечатанных страниц.");
            // Данное поле регулируется строго внутри данного класса, если в работе внутренних частей произошла
            // какая-то ошибка - нет смылса продолжать работу, т.к. оно просто собьет все возможные данные.
            // В идеале сюда бы записать данные в какой-то файлик и отправить куда надо..
        }
    }

    public double getToner() {
        return toner;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void refuelToner() {
        System.out.println(toner == 100.0d ? "Картридж и так полн" : "Картридж успешно заправлен");
        toner = 100;
    }

    public void getTonerLever() {
        System.out.println(String.format("Картридж полн на %d%%", (int) toner));
    }

    /**
     * Печатает страницы.
     *
     * @param amount  сколько напечатать
     * @param isLists печатать листы (true) или страницы (false)
     */
    public void print(int amount, boolean isLists) throws InterruptedException {
        if (toner < needInkToPrint(amount)) {
            System.out.println(amount > 1500 ?
                    "У кардтриджа в принципе не хватит чернил, разбей работу на несколько частей" :
                    "Не хватит чернил для работы, заправь сперва картридж.");
            return;
        }
        if (isLists) {
            printLists(amount);
        } else {
            printPages(amount);
        }
    }

    private double needInkToPrint(int amount) {
        return amount * SPEND_TONER_PER_LIST;
    }

    private void printLists(int amount) throws InterruptedException {
        if (!isDuplex()) {
            System.out.println("Тебе вручную придется переворачивать страницы после печали и вставлять снова " +
                    ", т.к. это не дуплексный принтер и он не способен печатать сразу с двух сторон.");
        } else {
            System.out.println("Печатаю листки...");
            Thread.sleep(amount * WAIT_TO_PRINT_LIST);
            addPrintedLists(amount);
            toner -= needInkToPrint(amount);
            System.out.println("Печать законченна.");
            getTonerLever();
        }
    }

    private void printPages(int amount) throws InterruptedException {
        System.out.println("Печатаю страницы...");
        Thread.sleep(amount * 15);                  // пердполагается, что печатать стрицы быстрее, чем листки
        addPrintedLists(amount / (WAIT_TO_PRINT_LIST / 2)); // т.к. мы ведем записи в листках, а не страницах...
        toner -= needInkToPrint(amount / 2); // на страницы нужно в 2раза меньше чернил
        System.out.println("Печать закончена.");
        getTonerLever();
    }


    // Прочие методы...
    public boolean isFull() {
        return toner == 100.0d;
    }
}
