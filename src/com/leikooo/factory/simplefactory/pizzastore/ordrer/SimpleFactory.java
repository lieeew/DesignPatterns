package com.leikooo.factory.simplefactory.pizzastore.ordrer;

import com.leikooo.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.leikooo.factory.simplefactory.pizzastore.pizza.GeekPizza;
import com.leikooo.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.leikooo.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author leikooo @Description
 */
public class SimpleFactory {
  // 通过 orderType 返回 Pizza 对象
  public Pizza creatPizza(String pizzaType) {
    System.out.println("使用 simple factory");
    Pizza pizza = null;
    if ("BJGeekPizza".equals(pizzaType)) {
      pizza = new GeekPizza();
      pizza.setName("BJGeekPizza");
    } else if ("BJCheesePizza".equals(pizzaType)) {
      pizza = new CheesePizza();
      pizza.setName("BJCheesePizza");
    } else if ("PepperPizza".equals(pizzaType)) {
      pizza = new PepperPizza();
      pizza.setName("PepperPizza");
    }
    return pizza;
  }
}
