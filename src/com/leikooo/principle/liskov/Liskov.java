package com.leikooo.principle.liskov;

/**
 * @author leikooo
 * @create 2023-10-10 14:06
 * @Package com.leikooo.principle.liskov
 * @Description
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.function1(10, 3));;
        System.out.println("--------------------");
        B b = new B();
        System.out.println(b.function1(10, 3));;
        System.out.println(b.function2(10, 10));;
    }
}

class A {
    public int function1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    // 不小心重写了 A 的方法
    @Override
    public int function1(int num1, int num2) {
        return num1 + num2;
    }

    public int function2(int a, int b) {
        return function1(a, b) + 9;
    }
}

