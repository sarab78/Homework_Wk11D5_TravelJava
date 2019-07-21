public class Passenger {

private String name;
private int bags;
private Flight flight;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return this.bags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
