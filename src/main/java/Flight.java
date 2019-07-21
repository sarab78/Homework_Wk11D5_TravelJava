import java.util.ArrayList;


public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private Airport departure;
    private Airport destination;
    private String departureTime;
    private ArrayList bookPassenger;


    public Flight(Plane plane, String flightNo, Airport departure, Airport destination, String departureTime) {
      this.passengers = new ArrayList<Passenger>();
      this.plane =  plane;
      this.flightNo = flightNo;
      this.departure = departure;
      this.destination = destination;
      this.departureTime = departureTime;

    }




    public int getPassengerNumbers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }


    public int numberOfAvailableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }


    public void addPassenger(Passenger passenger) {
     this.passengers.add(passenger);
    }
}
