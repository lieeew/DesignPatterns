package com.leikooo.factory.factorymethod.ordrer;

import com.leikooo.factory.factorymethod.pizza.BJCheesePizza;
import com.leikooo.factory.factorymethod.pizza.BJGeekPizza;
import com.leikooo.factory.factorymethod.pizza.Pizza;

/**
 * @author leikooo @Description
 */
public class BJOrderPizza extends OrderPizza{

  @Override
  public Pizza creatPizza(String pizzaType) {
    Pizza pizza = null;
    if ("geek".equals(pizzaType)) {
      pizza = new BJGeekPizza();
    } else {
      pizza = new BJCheesePizza();
    }
    return pizza;
  }
}
