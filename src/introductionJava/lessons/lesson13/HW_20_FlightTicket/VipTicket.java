package introductionJava.lessons.lesson13.HW_20_FlightTicket;

public class VipTicket extends Ticket {
    private Meal meal;
    private Baggage baggage;

    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;
    }

    public int getCost() {
        return super.getCost();
    }

    public String toString() {
        return super.toString() + " + vip: \n" +
                "1) " + meal + "\n" +
                "2) " + baggage + ".";
    }
}
