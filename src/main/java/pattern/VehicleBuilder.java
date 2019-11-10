package pattern;

import java.util.ArrayList;
import java.util.List;

public class VehicleBuilder implements Builder<Vehicle>{

    private List<Vehicle> vehicleList;
    private List<Vehicle> vehicleFinalList;

    public VehicleBuilder(List<Vehicle> vehicleFinalList){
        this.vehicleFinalList = vehicleFinalList;
        init();
    }

    public void init() {
        vehicleList = new ArrayList<Vehicle>();
    }

    public Builder add(Vehicle obj) {
        if(obj != null)
            vehicleList.add(obj);
        return this;
    }

    public Builder remove(Vehicle obj) {
        if(obj != null)
            vehicleList.remove(obj);
        return this;
    }

    public void build() {
        vehicleList.forEach(v -> {
            vehicleFinalList.add(v);
        });
    }
}
