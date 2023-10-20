package com.leikooo.builder.impr;

/**
 * @author leikooo @Description
 */
public class CommonBuilding extends HouseBuilder {

  @Override
  public void buildBasic() {
    System.out.println("修建普通房子地基");
  }

  @Override
  public void buildWalls() {
    System.out.println("修建普通房子墙壁");
  }

  @Override
  public void buildRoofed() {
    System.out.println("修建普通屋顶");
  }
}
