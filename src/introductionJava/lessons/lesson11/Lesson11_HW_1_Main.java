package introductionJava.lessons.lesson11;

public class Lesson11_HW_1_Main {
    public static void main(String[] args) {
        // мде, зачем такой большей класс... зачем вообще нужны эти Lesson11_HW_1_Ac.. почему
        // нельзя просто назвать Account? Еще и понатыкивают свои пекеджи..

        Lesson11_HW_1_Account acc1 = new Lesson11_HW_1_Account("Женя", "нет телефона xDD");
        System.out.println(acc1 + "\n");

        Lesson11_HW_1_Account acc2 = new Lesson11_HW_1_Account("Мишутка", "Хо098чу73Мно32гоДен2334г");
        System.out.println(acc2 + "\n");

        System.out.println("Ну, ID вроде как отображается стабильно...\n");

        acc1.setBalance(124231.2);
        acc1.setCustomerEmailAddress("proProg@bigboss.com");
        acc1.setCustomerName("Евгений Александрович");
        acc1.setCustomerPhoneNumber("+0 800 00 00");
        System.out.println(acc1);


        System.out.println("\nС шутками хватит.. проверяем баланса");
        System.out.println("Получить баланс = " + acc1.getBalance());
        acc1.withdraw(50000.2);
        System.out.println("Забирали 50000.2, остается = " + acc1.getBalance());
        acc1.deposit(100000);
        System.out.println("Закинули 100к, баланс = " + acc1.getBalance());

        System.out.println("\nНеадекватный значения:");
        System.out.println("Снимаем 500 000...");
        acc1.withdraw(500_000.0);
        System.out.println("Баланс: " + acc1.getBalance());
        System.out.println("Снимаем -500 000...");
        acc1.withdraw(-500_000.0);
        System.out.println("Баланс: " + acc1.getBalance());
        System.out.println("\nДепозитим 30 000...");
        acc1.deposit(30_000.0);
        System.out.println("Баланс: " + acc1.getBalance());
        System.out.println("Депозитим -30 000...");
        acc1.deposit(-30_000.0);
    }
}
