package com.leikooo.factory.absfactory.pizza;

/**
 * @author leikooo @Description
 */
public class BJGeekPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("给北京 geek pizza 准备原材料");
  }
}
