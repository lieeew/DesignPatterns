package com.leikooo.singleton.type7;

/**
 * @author leikooo @Description 单例模式
 */
public class SingletonTest07 {
  public static void main(String[] args) {
    Singleton instance = Singleton.INSTANCE;
    Singleton instance1 = Singleton.INSTANCE;
    System.out.println(instance1 == instance);
  }
}

enum Singleton {
  INSTANCE;

  public void sayOk() {
    System.out.println("ok~~");
  }
}