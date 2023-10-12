package com.leikooo.principle.segregation;

/**
 * @author leikooo
 * @create 2023-10-09 21:12
 * @Package com.leikooo.principle.segregation
 * @Description 接口隔离原则
 */
public class Segregation1 {

    interface Interface {
        void operation1();

        void operation2();

        void operation3();

        void operation4();

        void operation5();
    }

    class B implements Interface {

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

        @Override
        public void operation4() {
            System.out.println("B operation4");
        }

        @Override
        public void operation5() {
            System.out.println("B operation5");
        }
    }

    class D implements Interface {

        @Override
        public void operation1() {
            System.out.println("D operation1");
        }

        @Override
        public void operation2() {
            System.out.println("D operation2");
        }

        @Override
        public void operation3() {
            System.out.println("D operation3");
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

        public void depend1(Interface i) {
            i.operation1();

        }

        public void depend2(Interface i) {
            i.operation2();

        }

        public void depend3(Interface i) {
            i.operation3();

        }
    }

    /**
     * C 接口只依赖 1，4，5 这三种方法
     */
    class C {
        public void depend1(Interface i) {
            i.operation1();

        }

        public void depend2(Interface i) {
            i.operation4();

        }

        public void depend3(Interface i) {
            i.operation5();

        }
    }
}
