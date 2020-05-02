package introductionJava.lessons.lesson13.hw_19_AnimalFactory;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я код. Зовут меня - " + super.getName();
    }
}
