import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasWeight() {
        assertEquals(333400, plane.getWeight());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(416, plane.getCapacity());
    }

}
