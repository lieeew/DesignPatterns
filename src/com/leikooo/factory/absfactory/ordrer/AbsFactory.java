package com.leikooo.factory.absfactory.ordrer;

import com.leikooo.factory.absfactory.pizza.Pizza;

/**
 * @author leikooo @Description 抽象工厂模式的抽象层
 */
public interface AbsFactory {
  /** 创建 pizza */
  Pizza creatPizza(String orderType);
}
