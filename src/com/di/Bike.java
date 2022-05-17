package com.di;

public class Bike {

	String color ; 
	/*public void setColor(String color){
		
		this.color = color;
		
	}*/
	
	Bike(String color){
	
		this.color = color;
	}
	
	public void showColor(){
		System.out.println("Your color is = "+color);
	}
	
}
