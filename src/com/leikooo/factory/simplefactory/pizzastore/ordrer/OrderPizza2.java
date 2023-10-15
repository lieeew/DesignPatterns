package com.leikooo.factory.simplefactory.pizzastore.ordrer;

import com.leikooo.factory.simplefactory.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author leikooo @Description
 */
public class OrderPizza2 {

  // 定义一个建档工厂对象， 聚合关系
  SimpleFactory simpleFactory;

  public OrderPizza2() {
    do {
      String pizzaType = getType();
      Pizza pizza = simpleFactory.creatPizza(pizzaType);
      if (pizza != null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      } else {
        System.out.println("订购 pizza 失败");
        return;
      }
    } while (true);
  }

  public String getType() {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("input pizza species: ");
      return bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }
}
