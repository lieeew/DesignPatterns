package com.leikooo.singleton.type4;

/**
 * @author leikooo @Description 单例模式
 */
public class SingletonTest04 {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance1 == instance2);
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class Singleton {
  // 私有化构造器, 防止 new
  private Singleton() {}

  private static Singleton INSTANCE;

  // 当用户到的时候才去 new
  public static Singleton getInstance() {
    if (INSTANCE == null) {
      synchronized (Singleton.class) {
        INSTANCE = new Singleton();
      }
    }
    return INSTANCE;
  }
}
