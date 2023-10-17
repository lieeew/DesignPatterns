package com.leikooo.prototype;

/**
 * @author leikooo @Description 创建 10 个一样的🐏对象
 */
public class Client {
  public static void main(String[] args) {
    // 传统方法
    Sheep sheep = new Sheep("tom", 10, "red");
    Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    // ...

  }
}
