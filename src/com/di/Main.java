package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Bike bike = ac.getBean("bike",Bike.class);
		
		bike.startEngine();
		bike.showColor();
		
		Bike bike2 = ac.getBean("bike",Bike.class);
		
		bike2.color="RED";
		
		bike.startEngine();
		
		

	}

}
