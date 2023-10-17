package com.leikooo.factory.absfactory.ordrer;

import com.leikooo.factory.absfactory.pizza.LundunCheesePizza;
import com.leikooo.factory.absfactory.pizza.Pizza;

/**
 * @author leikooo @Description
 */
public class LunDunFactory implements AbsFactory {
  @Override
  public Pizza creatPizza(String orderType) {
    System.out.println("~ use LunDunFactory~");
    Pizza pizza = null;
    if ("chess".equals(orderType)) {
      pizza = new LundunCheesePizza();
    } else if("geek".equals(orderType)){
      pizza = new LundunCheesePizza();
    }
    return pizza;
  }
}
