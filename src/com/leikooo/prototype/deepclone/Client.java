package com.leikooo.prototype.deepclone;

public class Client {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    DeepProtoType p = new DeepProtoType();
    p.name = "leikooo";
    p.deepCloneableTarget = new DeepCloneableTarget("lieeew", "leikoooBlog");

    // 使用 clone 方法
    // DeepProtoType p2 = (DeepProtoType) p.clone();
    //
    // System.out.println(
    //     "p.name = " + p.name + "p.deepCloneableTarget = " + p.deepCloneableTarget.hashCode());
    // System.out.println(
    //     "p2.name = " + p.name + "p2.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());

    DeepProtoType p2 = (DeepProtoType) p.deepClone();

    System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" +
    p.deepCloneableTarget.hashCode());
    System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" +
    p2.deepCloneableTarget.hashCode());

  }
}
