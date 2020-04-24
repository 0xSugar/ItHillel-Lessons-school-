package introductionJava.lessons.lesson12;

public class Lesson12_1_Dog {
    public static int count = 0;
    private String name;

    public Lesson12_1_Dog(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }
}
