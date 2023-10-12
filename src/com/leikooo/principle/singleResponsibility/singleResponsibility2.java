package com.leikooo.principle.singleResponsibility;

/**
 * @author leikooo
 * @create 2023-10-09 20:46
 * @Package com.leikooo.principle.singleResponsibility
 * @Description 单一职原则
 */
public class singleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("火车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}


/*
遵守了单一职责原则，但是花销很大！
改进: 直接修改 vehicle 类
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上运行....");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上运行....");
    }
}
