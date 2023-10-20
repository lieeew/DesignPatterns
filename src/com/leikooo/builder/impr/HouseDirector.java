package com.leikooo.builder.impr;

/**
 * @author leikooo @Description director 指挥者
 */
public class HouseDirector {
    private HouseBuilder houseBuilder = null;

    // 构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // setter 方法
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 建造房子, 返回建造好的房子
    public House constractorHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        return houseBuilder.buiildHouse();
    }
}
