package pattern.patternimpl;

import pattern.builderpattern.HouseBuilder;

public class IceHouseBuilder implements HouseBuilder {

    private House house;

    public IceHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Ice Carvings");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
