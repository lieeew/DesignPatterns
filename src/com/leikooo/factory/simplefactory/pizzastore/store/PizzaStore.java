package com.leikooo.factory.simplefactory.pizzastore.store;

import com.leikooo.factory.simplefactory.pizzastore.ordrer.OrderPizza;
import com.leikooo.factory.simplefactory.pizzastore.ordrer.SimpleFactory;

/**
 * @author leikooo @Description
 */
public class PizzaStore {
  public static void main(String[] args) {
    new OrderPizza(new SimpleFactory());
    System.out.println("退出程序~~~");
  }
}
