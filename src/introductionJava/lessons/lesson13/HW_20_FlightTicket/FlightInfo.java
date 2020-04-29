package introductionJava.lessons.lesson13.HW_20_FlightTicket;

public class FlightInfo {
    private int flightNumber;
    private String departure;
    private String destination;
    private double time;
    private int cost;

    public FlightInfo(int flightNumber, String departure, String destination, double time, int cost) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.time = time;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        String time = (String.format("%.2f", this.time)).replaceAll(",", ":");
        return String.format("Рейс #%d из %s в %s, вылет в %s (цена билета $%d)",
                flightNumber, departure, destination, time, getCost());
    }
}
