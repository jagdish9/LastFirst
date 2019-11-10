package pattern;

import java.util.Objects;

public class Vehicle {
    private int vehicleNo;
    private String ownerName;

    public Vehicle(int vehicleNo, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleNo == vehicle.vehicleNo &&
                Objects.equals(ownerName, vehicle.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNo, ownerName);
    }
}
