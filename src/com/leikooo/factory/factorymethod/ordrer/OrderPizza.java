package com.leikooo.factory.factorymethod.ordrer;

import com.leikooo.factory.factorymethod.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author leikooo @Description
 */
public abstract class OrderPizza {
  /**
   * 定义一个抽象方法，让其子类实现具体代码
   *
   * @param pizzaType pizza 的类型
   * @return
   */
  public abstract Pizza creatPizza(String pizzaType);

  // 构造器
  public OrderPizza() {
    Pizza pizza = null;
    String pizzaType = "";
    do {
      pizzaType = getType();
      pizza = creatPizza(pizzaType);
      if (pizza == null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      } else {
        return;
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
