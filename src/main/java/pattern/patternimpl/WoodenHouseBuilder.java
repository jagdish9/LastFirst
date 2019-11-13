package pattern.patternimpl;

import pattern.builderpattern.HouseBuilder;

public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Wood and Cement");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
