package com.leikooo.factory.factorymethod.store;

import com.leikooo.factory.factorymethod.ordrer.BJOrderPizza;
import com.leikooo.factory.factorymethod.ordrer.OrderPizza;

/**
 * @author leikooo @Description
 */
public class PizzaStore {
  public static void main(String[] args) {
    OrderPizza orderPizza = new BJOrderPizza();
    System.out.println("退出程序~~~");
  }
}
