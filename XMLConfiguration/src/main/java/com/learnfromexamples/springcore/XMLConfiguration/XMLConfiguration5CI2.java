package com.learnfromexamples.springcore.XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.Employee;

public class XMLConfiguration5CI2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans7constructorinjection.xml");

		Employee app = ctx.getBean(Employee.class); // Spring automatically checks the data type and map as per data
													// type. // if both address and age we specified as int value, then
													// based on the order spring fills it

		System.out.println(app);

	}
}
