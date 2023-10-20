package com.leikooo.builder.impr;

/**
 * @author leikooo @Description
 */
public class Client {
  public static void main(String[] args) {
    // builder
    CommonBuilding houseBuilder = new CommonBuilding();
    // director
    HouseDirector houseDirector = new HouseDirector(houseBuilder);
    houseDirector.constractorHouse();
  }
}
