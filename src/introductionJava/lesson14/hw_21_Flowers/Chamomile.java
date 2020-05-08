package introductionJava.lesson14.hw_21_Flowers;

public class Chamomile extends Flower {
    private static double defaultPrice;
    private static final String DEFAULT_NAME = "Ромашка";

    public Chamomile(String name, double price) {
        super(name, price);
    }

    public Chamomile(String name) {
        this(name, Chamomile.defaultPrice);
    }

    public Chamomile() {
        this(DEFAULT_NAME);
    }

    public static void setDefaultPrice(double price) {
        Chamomile.defaultPrice = price;
    }
}
