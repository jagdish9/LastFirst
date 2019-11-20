package pattern.builder;

import pattern.builderpattern.HouseBuilder;
import pattern.patternimpl.House;

public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
