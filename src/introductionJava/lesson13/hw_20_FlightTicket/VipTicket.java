package introductionJava.lesson13.hw_20_FlightTicket;

public class VipTicket extends Ticket {
    private Meal meal;
    private Baggage baggage;

    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;
    }

    @Override
    public int getCost() {
        return super.getCost() + meal.getPrice() + baggage.getPrice();
    }



    public String toString() {
        return super.toString() + " + vip: \n" +
                "1) " + meal + "\n" +
                "2) " + baggage + ".";
    }
}

