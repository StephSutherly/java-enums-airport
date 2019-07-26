import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS);
        flight = new Flight(plane, 302, "EDI", "BRS", "10 O'clock");
    }

    @Test
    public void planeStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

}
