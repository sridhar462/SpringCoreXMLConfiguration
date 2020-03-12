package com.learnfromexamples.springcore.XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnfromexamples.springcore.modal.Company;
import com.learnfromexamples.springcore.modal.Department;

public class XMLConfiguration2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans4.xml");

		Company company = ctx.getBean(Company.class);

		System.out.println(company.getCompanyName());
		
		
		Department dept = ctx.getBean(Department.class);
		System.out.println(dept.getDeptName());
	}
}
