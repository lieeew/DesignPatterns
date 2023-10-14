package com.leikooo.singleton.type5;

/**
 * @author leikooo @Description 单例模式
 */
public class SingletonTest05 {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    // ture
    System.out.println(instance1 == instance2);
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class Singleton {
  // 私有化构造器, 防止 new
  private Singleton() {}

  // volatile 确保单例对象的初始化在多线程环境下是正确的
  // 可以理解为 轻量级 synchronized 锁🔒
  private static volatile Singleton INSTANCE;

  // 当用户到的时候才去 new
  public static Singleton getInstance() {
    // C 线程这里就进入不进去
    if (INSTANCE == null) {
      // 1、假设现在有两个线程 A、B 在这里
      // 2、A 先进入下面的 synchronized, 此时 A、B 两个线程不可能同时进入这个线程之中
      synchronized (Singleton.class) {
        // 4、B 进入到这里之中, 由于 INSTANCE 加上了 volatile 注解, A 修改之后会立刻更新内存中的 INSTANCE
        // 所以也进不去下面的 if 循环之中
        if (INSTANCE == null) {
          // 3、A 开始创建对象
          INSTANCE = new Singleton();
        }
      }
    }
    return INSTANCE;
  }
}
