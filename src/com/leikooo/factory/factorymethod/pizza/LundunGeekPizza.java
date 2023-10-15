package com.leikooo.factory.factorymethod.pizza;

/**
 * @author leikooo @Description
 */
public class LundunGeekPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给伦敦 geek pizza 准备原材料");
  }
}
