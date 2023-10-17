package com.leikooo.factory.absfactory.pizza;

/**
 * @author leikooo @Description
 */
public class BJCheesePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("准备制作北京 cheese pizza 原材料");
  }
}
