import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHanger {
    Hanger hanger;
    Aircraft plane1;
    Aircraft plane2;
    Aircraft plane3;
    Aircraft plane4;


    @Before
    public void before(){
        hanger = new Hanger(3);
        plane1 = new Aircraft(AircraftType.BOMBARDIERQ400, AirlineType.BRITISHAIRWAYS);
        plane2 = new Aircraft(AircraftType.AIRBUSA220, AirlineType.AIRCANADA);
        plane3 = new Aircraft(AircraftType.BOEING747, AirlineType.EMIRATES);
        plane4 = new Aircraft(AircraftType.AIRBUSA310, AirlineType.AIRFRANCE);
    }

    @Test
    public void canGetNumberOfPlanesZero(){
        assertEquals(0, hanger.getCurrentAircraftNumber());
    }

    @Test
    public void canGetCapacityOfHanger(){
        assertEquals(3, hanger.getCapacity());
    }

    @Test
    public void canAddAircraftToHanger(){
        assertEquals(0, hanger.getCurrentAircraftNumber() );
        hanger.addAircraft(plane1);
        hanger.addAircraft(plane2);
        assertEquals(2, hanger.getCurrentAircraftNumber() );
    }

    @Test
    public void hangerCannotGoOverCapacity(){
        for (int i = 0; i < 4; i++ ){
            hanger.addAircraft(plane1);
        }
        assertEquals(3, hanger.getCurrentAircraftNumber());
    }

    @Test
    public void canRemoveAircraftFromHanger(){
        hanger.addAircraft(plane1);
        hanger.addAircraft(plane2);
        assertEquals(2, hanger.getCurrentAircraftNumber());
        hanger.removeAircraft(plane1);
        assertEquals(1, hanger.getCurrentAircraftNumber());
    }

    @Test
    public void canRemoveAllAircraft(){
        hanger.addAircraft(plane1);
        hanger.addAircraft(plane2);
        assertEquals(2, hanger.getCurrentAircraftNumber());
        hanger.removeAllAircraft();
        assertEquals(0, hanger.getCurrentAircraftNumber());
    }
}
