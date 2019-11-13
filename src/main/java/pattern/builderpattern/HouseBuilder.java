package pattern.builderpattern;

import pattern.patternimpl.House;

public interface HouseBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoof();
    void buildInterior();

    House getHouse();
}
