package com.leikooo.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}


class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("CollegeEmployee  id= " + i);
			list.add(emp);
		}
		return list;
	}
}

// 直接朋友：Employee, CollegeManager
// CollegeEmployee 不是直接朋友是以局部变量的形式出现在方法之中
class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("employee id= " + i);
			list.add(emp);
		}
		return list;
	}

	void printAllEmployee(CollegeManager sub) {
		
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------学院员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总员工类------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
