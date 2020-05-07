package introductionJava.lessons.lesson15.hw_23_Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
        System.out.println("Создаем 3 номеров и телефон, куда их добавляем");
        Contact contact1 = new Contact("Кирил Садик", "+380982437142");
        Contact contact2 = new Contact("Аля","+380972673421");
        Contact contact3 = new Contact("Мишутка", "+390128392823");
        MobilePhone mobilePhone = new MobilePhone("AdminUser", "Apple", contact1, contact2, contact3);
        System.out.println(mobilePhone);

        System.out.println("\nСохраем новый контакт"); // или добавить логичней add...
        Contact newContact = new Contact("MishaNewContact", "+38012739283");
        mobilePhone.saveContacts(newContact);
        System.out.println(mobilePhone);

        System.out.println("\nИзменяем существующий контакт");
        mobilePhone.setContact(newContact, "MishaNotNew");
        System.out.println(mobilePhone);

        System.out.println("\nУзнаем, есть ли контакт по имени");
        System.out.println("Есть ли \"Аля\" в контактах? = " + mobilePhone.isPresentByName("Аля")); // регистр имеет значение
        System.out.println("\nА по всем данным?");
        System.out.println("Если ли Аля с телефоном +380972673421 в контактах (более точный метод) = " +
                mobilePhone.isPresent("Аля", "+380972673421"));

        System.out.println("\nУдаляем контакты");
        mobilePhone.deleteContacts(contact1, contact2, contact3);
        System.out.println(mobilePhone);

        System.out.println("\nНу а если сделать то, чего нельзя - вылетит вот такое исключение");
            mobilePhone.setContact(new Contact("Выдуманный", "Контакт"), "В", "К");
        } catch (NotExistedContact exception) {
            System.out.println("Конечно же, оформлять все исключение и ловить все, что падает - мы должны красиво\n" +
                    "Но StackTrace я все таки выведу");
            exception.printStackTrace();
            return;
        }
    }
}
