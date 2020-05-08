package introductionJava.lesson14.hw_21_Flowers;

public class Tulip extends Flower {
    private static double defaultPrice;
    private static final String DEFAULT_NAME = "Тюльпан";

    public Tulip(String name, double price) {
        super(name, price);
    }

    public Tulip(String name) {
        this(name, Tulip.defaultPrice);
    }

    public Tulip() {
        this(DEFAULT_NAME);
    }

    public static void setDefaultPrice(double price) {
        Tulip.defaultPrice = price;
    }
}
