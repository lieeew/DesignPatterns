package com.leikooo.factory.simplefactory.pizzastore.pizza;

/**
 * @author leikooo @Description
 */
public class CheesePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("准备制作 cheese pizza 原材料");
  }
}
