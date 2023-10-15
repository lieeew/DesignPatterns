package com.leikooo.factory.factorymethod.pizza;

/**
 * @author leikooo @Description
 */
public class LundunCheesePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("准备制作伦敦 cheese pizza 原材料");
  }
}
