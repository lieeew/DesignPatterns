package com.leikooo.factory.factorymethod.store;

import com.leikooo.factory.factorymethod.ordrer.BJOrderPizza;
import com.leikooo.factory.factorymethod.ordrer.OrderPizza;

/**
 * @author leikooo @Description
 */
public class PizzaStore {
  public static void main(String[] args) {
    // 先调用父类构造器, 再创建子类构造器
    OrderPizza orderPizza = new BJOrderPizza();
    System.out.println("退出程序~~~");
  }
}
