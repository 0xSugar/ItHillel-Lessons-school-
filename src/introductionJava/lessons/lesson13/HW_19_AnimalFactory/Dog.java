package introductionJava.lessons.lesson13.HW_19_AnimalFactory;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я собака. Зовут меня - " + super.getName();
    }
}
