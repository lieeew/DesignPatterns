package com.leikooo.principle.singleResponsibility;

/**
 * @author leikooo
 * @create 2023-10-09 20:46
 * @Package com.leikooo.principle.singleResponsibility
 * @Description 单一职原则
 */
public class singleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("火车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}


/**
 * 没符合单一职责原则
 *
 * 飞机不能在公路上运行....
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}