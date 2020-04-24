package introductionJava.lessons.lesson11;

import java.util.*;

public class Lesson11_HW_1_Account {
    private static int ID = 0;
    private int yourLovelyID;

    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Мы так не работаем");
            return;
        }
        System.out.println("Хи хи, новым вкладам мы всегда рады ^_^");
        balance += amount > 0 ? amount : 0;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Недостаточно денег");
            return -1;
        } else if (amount < 0) {
            System.out.println("Неадекватная команда");
            return -1;
        }
        balance -= amount;
        return amount;
    }

    // Вот если логически подумать, что нужно для открытия счета? Ну, помимо паспорта, документов и кучи
    // других данных. Пустого клиента тоже как-бы не создать, разве мы будет сериализовывать его.. но пока такой
    // перенос "базы" не планируется, так что и делать мы его не будет. А в случае чего, в чем проблема добавить
    // пустой конструктор, верно?

    // Самый базовый - минимум это имя и телефон. Вообще не вижу смыла в ID, он, как я считаю, должен тут генерироваться
    public Lesson11_HW_1_Account(String customerName, String customerPhoneNumber) {
        this.number = ID++;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //
    public Lesson11_HW_1_Account(int number, String customerName, String customerPhoneNumber) {
        // вообще, для "такой" схемы, если все таки можно самому ставить себе ID, я бы созадал какой-то
        // TreeSet, где и будут хранится все эти ID... что бы перед тем, как поставить человеку ID - можно было
        // проверить, а нет ли случаем уже человека с таким ID? В любом случае мы не любим чужих ID, так что поставим
        // собственный. А их "любимый" вынесем в отельное поле. Убераем сетер на наш ID и ставим на этот.
        // Мы - великолепны!
        this(customerName, customerPhoneNumber);
        this.yourLovelyID = number;
    }

    // Допустим у нас человек, что хочет все поставить сам... хDD, наивный, мы конечно же не дадам ему всунуть свой
    // IDшник, у нас тут не детский сад, а настоящий аккаунт. Какие мы будем роботы, если дадим детям играться с
    // аккаунтом, у нас же все железячки заржавуют!
    public Lesson11_HW_1_Account(int number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this(number, customerName, customerPhoneNumber);
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
    }

    // все геттеры и сеторы..
    public void setYourLovelyID(int yourLovelyID) {
        this.yourLovelyID = yourLovelyID;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String toString() {
        return String.format("%s зовут %s, вот его почта %s и номер телефона %s, %s.\n" +
                "На балансе %s, его ID %d, ключи от дома прячет под ковриком, но это вам особо не нужно.\n%s",
                (balance > 5000) ? "Уважаемого человека" : "Хомячка",
                customerName,
                (customerEmailAddress != null ? customerEmailAddress : "(не хватило денег на комп)"),
                customerPhoneNumber,
                (balance > 5000) ? "большие корпорации - ничто, относительно " + customerName : "пароля тоже нет ",
                (balance < 2000) ? (balance + " (толчек без денег..)") : (balance + " (поднялся BigBoss, всегда занал, что великим будет!!)"),
                number,
                (balance > 50000) ? ("Там такая охрана, что даже если ноги унесешь - руки остануться там же.. Шутки с ним плохи!") : ("Все равно он окно не закрывает. Собак нет, котов нет, как так жить даже мы ума не приложим.. "));
    }
}
