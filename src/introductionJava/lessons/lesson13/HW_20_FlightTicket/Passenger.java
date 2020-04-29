package introductionJava.lessons.lesson13.HW_20_FlightTicket;

public class Passenger {
    private String name;
    private String lastName;
    private long passport;
    // private Ticket ticket;

    public Passenger(String name, String lastName, long passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return String.format("%s %s (паспорт %d)", name, lastName, passport);
    }

}
