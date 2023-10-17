package com.leikooo.prototype.improve;

/**
 * @author leikooo @Description 原型模式
 */
public class Sheep implements Cloneable {
  private String name;
  private int age;
  private String color;
  private Sheep friend;
  public Sheep(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  @Override
  protected Object clone() {
    Sheep sheep = null;
    try {
      sheep = (Sheep) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
    return sheep;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Sheep getFriend() {
    return friend;
  }

  public void setFriend(Sheep friend) {
    this.friend = friend;
  }
}
