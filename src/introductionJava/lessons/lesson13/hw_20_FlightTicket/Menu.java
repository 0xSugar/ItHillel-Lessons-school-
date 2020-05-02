package introductionJava.lessons.lesson13.hw_20_FlightTicket;

public enum Menu {
    SOUP(1, "Суп", 8),
    VEGETABLES(2, "Овощи", 6),
    MEAT(3, "Мясо", 10),
    DESSERT(4, "Десерт", 7);

    private int var;
    private String desctiption;
    private int price;

    Menu(int var, String desctiption, int price) {
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

    public String toString() {
        return this.getDesctiption() + " $" + getPrice();
    }
}