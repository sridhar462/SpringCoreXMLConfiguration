package com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection;

public class Employee {
	private String empName;
	private int age;
	private String address;

	public Employee(String empName, int age, String address) {
		this.empName = empName;
		this.age = age;
		this.address = address;
	}

	public Employee(String empName, String address, int age) {
		this.empName = empName;
		this.address = address;
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", address=" + address + "]";
	}

}
