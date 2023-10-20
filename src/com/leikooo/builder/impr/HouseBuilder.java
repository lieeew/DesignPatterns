package com.leikooo.builder.impr;

/**
 * @author leikooo @Description 抽象的建造者
 */
public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoofed();

    public House buiildHouse() {
        return house;
    }
}
