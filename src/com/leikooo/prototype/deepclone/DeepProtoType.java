package com.leikooo.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {

  public String name;
  public DeepCloneableTarget deepCloneableTarget;

  public DeepProtoType() {
    super();
  }

  // 重写 clone 方法
  @Override
  protected Object clone() throws CloneNotSupportedException {

    Object deep = null;
    // 这里完成对基本数据类型的克隆
    deep = super.clone();
    // 对引用类型的属性进行单独处理
    DeepProtoType deepProtoType = (DeepProtoType) deep;
    deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
    return deepProtoType;
  }

  public Object deepClone() {

    ByteArrayOutputStream bos = null;
    ObjectOutputStream oos = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;

    try {

      bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);
      oos.writeObject(this);

      bis = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bis);
      DeepProtoType copyObj = (DeepProtoType) ois.readObject();

      return copyObj;

    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
      return null;
    } finally {
      try {
        assert bos != null;
        bos.close();
        assert oos != null;
        oos.close();
        assert bis != null;
        bis.close();
        assert ois != null;
        ois.close();
      } catch (Exception e2) {
        // TODO: handle exception
        System.out.println(e2.getMessage());
      }
    }
  }
}
