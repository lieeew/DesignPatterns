package com.leikooo.principle.inversion;

/**
 * @author leikooo
 * @create 2023-10-10 11:57
 * @Package com.leikooo.principle.inversion
 * @Description
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "从邮箱获取消息: hello world!";
    }
}

class Person {
    /**
     * 这个方案比较简单, 但是我们需要注意的如果我们其他的消息的话该如何获取
     *
     * 解决：引入一个抽象接口 IReceiver
     * 因为：email 和 微信、、只要各自是实现对应的 IReceiver 方法就 ok
     */
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}