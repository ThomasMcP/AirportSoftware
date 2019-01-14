import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAircraft {
    Aircraft aircraft;
    Passenger passenger;

    @Before
    public void before(){
        aircraft = new Aircraft(AircraftType.BOEING747, AirlineType.EMIRATES);
        passenger = new Passenger("Laura McVean", "12/02/1992");
    }

    @Test
    public void canGetType(){
        assertEquals(AircraftType.BOEING747, aircraft.getType());
    }

    @Test
    public void canGetAirline(){
        assertEquals(AirlineType.EMIRATES, aircraft.getAirline());
    }

    @Test
    public void passengerListIsIntiallyZero(){
        assertEquals(0, aircraft.getPassengerNumbers());
    }

    @Test
    public void canAddPassengerToAircraft(){
        assertEquals(0, aircraft.getPassengerNumbers());
        aircraft.addPassenger(passenger);
        aircraft.addPassenger(passenger);
        assertEquals(2, aircraft.getPassengerNumbers());
    }

    @Test
    public void canRemovePassenger(){
        aircraft.addPassenger(passenger);
        aircraft.addPassenger(passenger);
        assertEquals(2, aircraft.getPassengerNumbers());
        aircraft.removePassenger(passenger);
        assertEquals(1, aircraft.getPassengerNumbers());
    }

    @Test
    public void canRemoveAllPassengers(){
        aircraft.addPassenger(passenger);
        aircraft.addPassenger(passenger);
        assertEquals(2, aircraft.getPassengerNumbers());
        aircraft.removeAllPassengers();
        assertEquals(0, aircraft.getPassengerNumbers());
    }

    @Test
    public void cantAddPassengerOverCapacity(){
        for (int i = 0; i < 416; i++){
            aircraft.addPassenger(passenger);
        }
        assertEquals(416, aircraft.getPassengerNumbers());
        aircraft.addPassenger(passenger);
        assertEquals(416, aircraft.getPassengerNumbers());
    }

    @Test
    public void canGetTypeCapacity(){
        assertEquals(416, aircraft.getType().getCapacity());
    }

    @Test
    public void canGetNamesOfAllPassengers(){
        for (int i = 0; i < 416; i++){
            aircraft.addPassenger(passenger);
        }
        assertEquals(true, aircraft.getPassengerNames().contains(passenger.getName()));
    }
}
