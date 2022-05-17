package com.di;

public class Car {
	
Engine engine;
	
	public Car(Engine engine){
	
		this.engine = engine;
		System.out.println("I am car constructor!!");
	}
	
	public void startEngine(){
		
		if(engine==null){
			System.out.println("Unable to start engine !!");
		}else{
			engine.start();
		}
	}

}
