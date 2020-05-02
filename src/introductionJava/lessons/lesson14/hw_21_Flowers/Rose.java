package introductionJava.lessons.lesson14.hw_21_Flowers;

public class Rose extends Flower {
    private static double defaultPrice;
    private static final String DEFAULT_NAME = "Роза";

    public Rose(String name, double price) {
        super(name, price);
    }

    public Rose(String name) {
        this(name, Rose.defaultPrice);
    }

    public Rose() {
        this(DEFAULT_NAME);
    }

    public static void setDefaultPrice(double price) {
        Rose.defaultPrice = price;
    }
}
