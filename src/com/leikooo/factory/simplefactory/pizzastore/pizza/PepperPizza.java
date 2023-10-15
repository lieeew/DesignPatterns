package com.leikooo.factory.simplefactory.pizzastore.pizza;

/**
 * @author leikooo @Description 胡椒 pizza
 */
public class PepperPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("pepper pizza prepare");
  }
}
