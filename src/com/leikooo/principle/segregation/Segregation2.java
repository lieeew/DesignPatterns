package com.leikooo.principle.segregation;

import org.junit.Test;

/**
 * @author leikooo
 * @create 2023-10-09 21:12
 * @Package com.leikooo.principle.segregation
 * @Description 接口隔离原则
 */
public class Segregation2 {

    @Test
    public void test() {
        A a = new A();
        a.depend1(new B());
        // a 通过接口去是依赖 B
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend2(new D());
        c.depend3(new D());
    }

    interface Interface1 {
        void operation1();

    }

    interface Interface2 {
        void operation2();

        void operation3();

    }

    interface Interface3  {
        void operation4();

        void operation5();
    }

    class B implements Interface1, Interface2 {

        @Override
        public void operation1() {
            System.out.println("B operation1");
        }

        @Override
        public void operation2() {
            System.out.println("B operation2");
        }

        @Override
        public void operation3() {
            System.out.println("B operation3");
        }

    }

    class D implements Interface1, Interface3 {

        @Override
        public void operation1() {
            System.out.println("D operation1");
        }


        @Override
        public void operation4() {
            System.out.println("D operation4");
        }

        @Override
        public void operation5() {
            System.out.println("D operation5");
        }
    }

    /**
     * A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
     */
    class A {

        public void depend1(Interface1 i) {
            i.operation1();

        }

        public void depend2(Interface2 i) {
            i.operation2();

        }

        public void depend3(Interface2 i) {
            i.operation3();

        }
    }

    /**
     * C 接口只依赖 1，4，5 这三种方法
     */
    class C {
        public void depend1(Interface1 i) {
            i.operation1();

        }

        public void depend2(Interface3 i) {
            i.operation4();

        }

        public void depend3(Interface3 i) {
            i.operation5();

        }
    }
}
