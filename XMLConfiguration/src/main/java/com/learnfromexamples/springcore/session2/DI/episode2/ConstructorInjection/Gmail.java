package com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection;

public class Gmail implements IShare {

	@Override
	public void send() {
		System.out.println("Hello Gmail !!!");
	}

}
