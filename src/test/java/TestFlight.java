import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFlight {
    Aircraft aircraft;
    Flight flight;
    Aircraft aircraft2;

    @Before
    public void before(){
        aircraft = new Aircraft(AircraftType.BOMBARDIERQ400, AirlineType.EASYJET);
        flight = new Flight(aircraft, DestinationType.EDINBURGH);
        aircraft2 = new Aircraft(AircraftType.AIRBUSA310, AirlineType.EMIRATES);
    }

    @Test
    public void getAssignedAircraft(){
        assertEquals(aircraft, flight.getAssignedAircraft());
    }

    @Test
    public void canSetAssignedAircraft(){
        assertEquals(aircraft, flight.getAssignedAircraft());
        flight.setAssignedAircraft(aircraft2);
        assertEquals(aircraft2, flight.getAssignedAircraft());
    }

    @Test
    public void canPopulateFlightNumberArray(){
        assertEquals(0, flight.getFlightNumberList().size());
        flight.populateFlightNumberList();
        assertEquals(1000, flight.getFlightNumberList().size());
    }
}
