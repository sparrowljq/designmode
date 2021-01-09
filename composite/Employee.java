package com.lzu.edu.cn.designmode.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates=new ArrayList<Employee>();
	}
	public void add(Employee e) {
		subordinates.add(e);
	}
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public String toString() {
		return "雇员[姓名："+name+",部门："+dept+",薪水："+salary+"]";
	}

}
