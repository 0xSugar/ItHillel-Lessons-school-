package introductionJava.lessons.lesson13.hw_20_FlightTicket;

public class Ticket {
    private int sitNumber;
    private FlightInfo flightInfo;
    private Passenger passenger;

    public Ticket(int sitNumber, FlightInfo flightInfo, Passenger passenger) {
        this.sitNumber = sitNumber;
        this.flightInfo = flightInfo;
        this.passenger = passenger;
    }

    /**
     * Нет информации о цене, возвращать нечего.
     * @return
     */
    public int getCost() {
        return flightInfo.getCost();
    }

    public int getSitNumber() {
        return sitNumber;
    }

    @Override
    public String toString() {
        return passenger + ", место #" + getSitNumber() + ". " + flightInfo;
    }
}
