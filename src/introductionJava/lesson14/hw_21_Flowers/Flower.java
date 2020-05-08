package introductionJava.lesson14.hw_21_Flowers;

public abstract class Flower {
    private String name;
    private double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (%.1f)", this.getName(), this.getPrice());
    }
}
