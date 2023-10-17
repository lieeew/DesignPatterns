package com.leikooo.factory.absfactory.ordrer;

import com.leikooo.factory.absfactory.pizza.BJCheesePizza;
import com.leikooo.factory.absfactory.pizza.BJGeekPizza;
import com.leikooo.factory.absfactory.pizza.Pizza;

/**
 * @author leikooo @Description
 */
public class BJFactory implements AbsFactory {
  @Override
  public Pizza creatPizza(String orderType) {
    System.out.println("~ use BJFactory ~");
    Pizza pizza = null;
    if ("chess".equals(orderType)) {
      pizza = new BJCheesePizza();
    } else if("geek".equals(orderType)){
      pizza = new BJGeekPizza();
    }
    return pizza;
  }
}
