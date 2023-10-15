package com.leikooo.factory.simplefactory.pizzastore.pizza;

/**
 * @author leikooo @Description
 */
public class GeekPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给 geek pizza 准备原材料");
  }
}
