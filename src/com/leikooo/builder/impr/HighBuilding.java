package com.leikooo.builder.impr;

/**
 * @author leikooo @Description 抽象的创建者类
 */
public class HighBuilding extends HouseBuilder {
  @Override
  public void buildBasic() {
    System.out.println("高楼看建造地基");
  }

  @Override
  public void buildWalls() {
    System.out.println("高楼建造墙壁");
  }

  @Override
  public void buildRoofed() {
    System.out.println("高楼建造屋顶");
  }
}
