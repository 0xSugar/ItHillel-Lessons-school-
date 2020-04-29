package introductionJava.lessons.lesson13.HW_20_FlightTicket;

public enum Drinks {
    YES (1, "напитки включены", 5),
    NO (0, "напитки не включены", 0);

    private int var;
    private String desctiption;
    private int price;

    Drinks(int var, String desctiption, int price) {
        this.var = var;
        this.desctiption = desctiption;
        this.price = price;
    }

    public int getVar() {
        return var;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getDesctiption() +
                (this == Drinks.YES ? " ($" + getPrice() + ")" : "");
    }
}
