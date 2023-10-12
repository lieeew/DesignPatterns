package com.leikooo.principle.singleResponsibility;

/**
 * @author leikooo
 * @create 2023-10-09 20:46
 * @Package com.leikooo.principle.singleResponsibility
 * @Description 单一职原则
 */
public class singleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("火车");
        vehicle2.runWater("轮船");
    }
}


/*
    这种没有对原来的类做大的修改
    这里没有在类上遵守「单一职责」, 但是方法遵守「单一职责」
    以后方法多了之后，也需要拆分
 */
class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里面上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "天空上运行....");
    }
}