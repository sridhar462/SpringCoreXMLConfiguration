package com.learnfromexamples.springcore.XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnfromexamples.springcore.modal.Employee;

public class XMLConfiguration {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");

		Employee employee = ctx.getBean(Employee.class);

		System.out.println(employee);
		
		// Getting the bean using name specified in the beans1.xml
		
		Employee emp = (Employee) ctx.getBean("employee");
		
		System.out.println(emp);
		
	}
}
