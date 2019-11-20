package pattern.builder;

import pattern.builderpattern.HouseBuilder;
import pattern.patternimpl.House;
import pattern.patternimpl.IceHouseBuilder;
import pattern.patternimpl.WoodenHouseBuilder;

public class BuilderMain {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new IceHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(houseBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Ice House constructed: "+house.toString());

        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        CivilEngineer engineer1 = new CivilEngineer(woodenHouseBuilder);
        engineer1.constructHouse();
        House house1 = engineer1.getHouse();
        System.out.println("Wooden House constructed: "+house1.toString());
    }
}
