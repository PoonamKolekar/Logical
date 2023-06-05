package com.jsp.relationship;

public class Car {
private String name;
private String brand;
private String color;
private double Price;
private Engine engine ;


public Car(String name,String brand,String color,double Price) {
this.name=name;
this.brand=brand;
this.color=color;
this.Price=Price;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getPrice() {
	return Price;
}

public void setPrice(double price) {
	this.Price = price;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public void printCarDetails() {
	System.out.println(" car info:");
	System.out.println(name);
	System.out.println(brand);
	System.out.println(color);
	System.out.println(Price);
	
	
	if (engine!=null ) {
		System.out.println("engine Config");
		
		System.out.println(engine.getHorsepower());
		System.out.println(engine.getCubic_capacity());
	
	}else {
		System.out.println("engine not present");
	}
	
	}
	
}
