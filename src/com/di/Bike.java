package com.di;

public class Bike {

	String color ;
	
	public void showColor(){
		
		System.out.println("Your color is = "+ 
		color);
		
	}
	
	Engine engine;
	
	public Bike(Engine engine){
	
		this.engine = engine;
		System.out.println("I am bike constructor!!");
	}
	
	public void startEngine(){
		
		if(engine==null){
			System.out.println("Unable to start engine !!");
		}else{
			engine.start();
		}
	}
	
}
