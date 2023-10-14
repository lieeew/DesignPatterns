package com.leikooo.singleton.type1;

/**
 * @author leikooo @Description 单例模式
 */
public class SingletonTest01 {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance1 == instance2);
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }
}

// 饿汉式（静态成员变量）
class Singleton {

  // 私有化构造器
  private Singleton() {}

  // 本类内部创建对象实例
  public static final Singleton INSTANCE = new Singleton();

  public static Singleton getInstance() {
    return INSTANCE;
  }
}
