package com.leikooo.factory.absfactory.store;


import com.leikooo.factory.absfactory.ordrer.BJFactory;
import com.leikooo.factory.absfactory.ordrer.OrderPizza;

/**
 * @author leikooo @Description
 */
public class PizzaStore {
  public static void main(String[] args) {
    // 先调用父类构造器, 再创建子类构造器
    new OrderPizza(new BJFactory());
    System.out.println("退出程序~~~");
  }
}
