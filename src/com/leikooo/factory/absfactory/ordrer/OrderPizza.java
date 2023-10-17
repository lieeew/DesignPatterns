package com.leikooo.factory.absfactory.ordrer;

import com.leikooo.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author leikooo @Description
 */
public class OrderPizza {
  AbsFactory factory;

  public OrderPizza(AbsFactory factory) {
    setFactory(factory);
  }

  private void setFactory(AbsFactory factory) {
    Pizza pizza = null;
    String orderType = "";
    this.factory = factory;
    do {
      orderType = getType();
      pizza = factory.creatPizza(orderType);
      if (pizza != null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      } else {
        System.out.println("订购失败");
        break;
      }
    } while (true);
  }

  // 从键盘上获取对应的类型
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
