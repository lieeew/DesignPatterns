package com.leikooo.uml;

/**
 * @author leikooo
 * @create 2023-10-12 14:16
 * @Package com.leikooo.uml
 * @Description
 */
public class PersonServiceBean {
    // 类
    private PersonDao personDao;
    // 方法形参
    public void savePerson(Person person) {

    }

    // 方法返回值类型
    public IDCard getIdCard(Integer idCard) {
        return null;
    }
    // 方法里面的变量
    // ps 虽然违反了迪米特 法则, 但是这的确是一种表现形式
    public void modify() {
        Department department = new Department();
    }
}

class Person{


}

class IDCard {


}

class PersonDao {

}

class Department {


}
