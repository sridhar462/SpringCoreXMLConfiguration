package com.learnfromexamples.springcore.XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GalleryApp;

public class XMLConfiguration4CI {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans6constructorinjection.xml");

		GalleryApp app = ctx.getBean(GalleryApp.class);

		app.getShare().send();

	}
}
