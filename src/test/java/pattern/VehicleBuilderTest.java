package pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class VehicleBuilderTest {

    private Builder builder;
    private List<Vehicle> vehicleList;

    @Before
    public void setup() throws Exception {
        vehicleList = new ArrayList<Vehicle>();
        builder = new VehicleBuilder(vehicleList);
    }

    @After
    public void tearDown() throws Exception {
        builder = null;
        vehicleList = null;
    }

    @Test
    public void add(){
        Vehicle vehicle1 = new Vehicle(3472, "Takesh");
        Vehicle vehicle2 = new Vehicle(7802, "Aniket");
        Object[] objs = {vehicle1, vehicle2};
        this.builder.add(vehicle1)
                .add(vehicle2)
                .build();
        assertArrayEquals(objs, vehicleList.toArray());
    }
}
