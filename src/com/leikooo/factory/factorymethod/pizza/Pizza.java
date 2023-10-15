package com.leikooo.factory.factorymethod.pizza;

/**
 * @author leikooo @Description
 */
public abstract class Pizza {
  private String name;

  // 每一种 pizza 需要准备的原材料不相同
  public abstract void prepare();

  public void bake() {
    System.out.println(name + "baking...");
  }

  public void cut() {
    System.out.println(name + "cutting");
  }

  public void box() {
    System.out.println(name + "boxing");
  }

  public void setName(String name) {
    this.name = name;
  }
}
