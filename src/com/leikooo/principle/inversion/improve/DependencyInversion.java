package com.leikooo.principle.inversion.improve;

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
        person.receive(new WeChat());
    }
}

interface IReceiver {
    String getInfo();

}

class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "从邮箱获取消息: hello world!";
    }
}
class WeChat implements IReceiver{
    @Override
    public String getInfo() {
        return "从微信获取消息: hello world!";
    }
}


class Person {

    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}