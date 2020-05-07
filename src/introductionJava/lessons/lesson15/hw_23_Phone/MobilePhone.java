package introductionJava.lessons.lesson15.hw_23_Phone;

import java.util.*;

public class MobilePhone {
    private String user;
    private String mobileMark;
    private List<Contact> contacts;

    // конструторы
    public MobilePhone(String user, String mobileMark) {
        this.user = user;
        this.mobileMark = mobileMark;
        contacts = new ArrayList<>();
    }

    public MobilePhone(String user, String mobileMark, Contact...contacts) {
        this(user, mobileMark);
        Collections.addAll(this.contacts, contacts);
    }

    // проверить наличие
    public boolean isPresent(Contact contact) {
        return contacts.contains(contact);
    }

    public boolean isPresent(String name, String number) {
        return isPresent(new Contact(name, number));
    }

    // чисто ради задания, поиск по имени...
    public boolean isPresentByName(String name) {
        for (Contact contact : this.contacts) {
            if (contact.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // сохранить
    public void saveContacts(Contact...contacts) {
        for (Contact contact : contacts) {
            if (!isPresent(contact)) {
                this.contacts.add(contact);
            }
        }
    }

    // изменить
    public void setContact(Contact contact, String newName, String newNumber) {
        if (isPresent(contact)) {
            int id = this.contacts.indexOf(contact);
            Contact ourContact = this.contacts.get(id);
            ourContact.setName(newName);
            if (!newNumber.equals("same")) {
                ourContact.setNumber(newNumber);
            }
        } else {
            throw new NotExistedContact();
        }
    }

    // я думал как сделать так, что бы не переписывать код.. решил передать ключевое слово - same... лень он такая
    public void setContact(Contact contact, String newName) {
        setContact(contact, newName, "same");
    }

/*
сначала, перед тем как что-то удалять я проверю, все ли контакты есть, что сказано удалить если нету такого - будет исключение.
Нечего удалять того, чего нет. Вообще в реальной программе, скорее всего, что проверки тут не будет.. просто при
попытке удалить то, чего нет - будет выкинута ошибка, что отловлена и красиво обработана. И проверку должен будет
делать сам пользователь, а точно такой контакт есть, прежде чем что-то удалять из базы. Но в рамках данной программы
я реализую это таким методом, что метод сам все проверит.. хотя исключение он все равно выкинет, если что ^_^
*/
// удалять
    public void deleteContacts(Contact...contacts) {
        for (Contact contact : contacts) {              // проверяет все контакты
            if (!this.contacts.contains(contact)) {     // если хоть 1го нет
                throw new NotExistedContact();          // исключение
            }
        }
        for (Contact contact : contacts) {
            this.contacts.remove(contact);
        }
    }





    @Override
    public String toString() {
        return "MobilePhone{" +
                "user='" + user + '\'' +
                ", mobileMark='" + mobileMark + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
