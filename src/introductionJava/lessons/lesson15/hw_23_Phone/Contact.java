package introductionJava.lessons.lesson15.hw_23_Phone;

import java.util.Objects;

/**
 * Я считаю, что это должно называться Контакт,а не Контакты, по той причине, что это класс, шаблон для
 * каждого контакта, а не группы. А вот контакты - это уже будет имя переменной типа лист в мобильном телефоне.
 *
 * Проверок на телефон я не делал. Можно найти много регулярок, которые могут это проверить или самому написать,
 * это - не сложно. Но в рамках данной задачи я такие варианты рассматривать не буду.
 */

public class Contact implements Comparable<Contact> {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    // Телефоны обычно выдает весь список контактов сразу отсортированным и сам по себе сразу добавляет
    // контакт в сортированный список.
    @Override
    public int compareTo(Contact o) {
        return this.name.charAt(0) - o.name.charAt(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(number, contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, number);
    }
}
