package com.leikooo.singleton.type6;

/**
 * @author leikooo @Description 单例模式
 */
public class SingletonTest06 {
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

  private static volatile Singleton instance;

  // 写一个静态内部类，该类中有一个静态属性 Singleton
  // 使用了 JVM 底层对应的线程安全
  private static class SingletonInstance {
    private static final Singleton INSTANCE = new Singleton();
  }

  // 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
  public static synchronized Singleton getInstance() {
    return SingletonInstance.INSTANCE;
  }
}
