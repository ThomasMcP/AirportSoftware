import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPassenger {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Thomas McPhee", "04/09/1991");
    }

    @Test
    public void canGetName(){
        assertEquals("Thomas McPhee", passenger.getName());
    }

    @Test
    public void canGetDateOfBirth(){
        assertEquals("04/09/1991", passenger.getDateOfBirth());
    }

    @Test
    public void canSetName(){
        assertEquals("Thomas McPhee", passenger.getName());
        passenger.setName("Christopher NZ");
        assertEquals("Christopher NZ", passenger.getName());
    }

    @Test
    public void canSetDOB(){
        assertEquals("04/09/1991", passenger.getDateOfBirth());
        passenger.setDateOfBirth("09/03/1994");
        assertEquals("09/03/1994", passenger.getDateOfBirth());
    }



}
