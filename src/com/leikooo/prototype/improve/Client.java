package com.leikooo.prototype.improve;


/**
 * @author leikooo @Description 创建 10 个一样的 sheep 对象
 */
public class Client {
  public static void main(String[] args) {
    // 传统方法
    Sheep sheep = new Sheep("tom", 10, "red");
    System.out.println("原型模式实现克隆~");
    sheep.setFriend(new Sheep("jack", 1, "black"));
    Sheep clone1 = (Sheep) sheep.clone();
    Sheep clone2 = (Sheep) sheep.clone();
    Sheep clone3 = (Sheep) sheep.clone();

    System.out.println("clone1 = " + clone1 + " clone1.friend = " + clone1.getFriend().hashCode());
    System.out.println("clone2 = " + clone2 + " clone1.friend = " + clone2.getFriend().hashCode());
    System.out.println("clone3 = " + clone3 + " clone1.friend = " + clone3.getFriend().hashCode());
    System.out.println("sheep = " + sheep + " clone1.friend = " + sheep.getFriend().hashCode());
  }
}
