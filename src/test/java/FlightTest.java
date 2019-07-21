import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    String departureTime;

    @Before
    public void setUp(){
//
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", Airport.LHR, Airport.GLA, "08:00PM");
        passenger1 = new Passenger("Joe", 2);
        passenger2 = new Passenger("Monica", 1);
        passenger3 = new Passenger("Rachel", 0);
        passenger4 = new Passenger("Sarab", 2);
    }

    @Test
    public void canCheckPassengersStartsAt0() {
        assertEquals(0, flight.getPassengerNumbers());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

   @Test
    public void flightHasNumber(){
        assertEquals("FR756", flight.getFlightNo());
   }

   @Test
   public void flightHasDeparture(){
        assertEquals(Airport.LHR, flight.getDeparture());
   }

   @Test
    public void flightHasDestination(){
        assertEquals(Airport.GLA, flight.getDestination());
   }

   @Test
    public void flightHasDepartureTime(){
        assertEquals("08:00PM", flight.getDepartureTime());
   }

   @Test
   public void flightHasAvailableNumberOfSeats(){
        assertEquals(416, flight.numberOfAvailableSeats());
   }

   @Test
    public void flightCanAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerNumbers());
   }




}
