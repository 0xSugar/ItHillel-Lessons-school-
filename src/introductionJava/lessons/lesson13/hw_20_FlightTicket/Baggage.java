package introductionJava.lessons.lesson13.hw_20_FlightTicket;

public class Baggage {
    private int amount;
    private int customFee;

    public Baggage(int amount, int customFee) {
        this.amount = amount;
        this.customFee = customFee;
    }

    public int getFee() {
        return customFee;
    }

    public int getPrice() {
        return customFee * amount;
    }

    @Override
    public String toString() {
        return "Багаж (кол-во = " + amount +
                ", сбор = $" + (customFee * amount) + ")";
    }
}
