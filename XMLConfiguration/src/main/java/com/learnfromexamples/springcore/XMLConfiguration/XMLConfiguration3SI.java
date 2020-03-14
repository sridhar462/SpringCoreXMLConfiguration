package com.learnfromexamples.springcore.XMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GalleryApp;

public class XMLConfiguration3SI {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans5setterinjection.xml");

		GalleryApp app = ctx.getBean(GalleryApp.class);

		app.getShare().send();

		GalleryApp app1 = (GalleryApp)ctx.getBean("galley");

		app1.getShare().send();

	}
}
