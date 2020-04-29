package introductionJava.lessons.lesson13.HW_19_AnimalFactory;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
