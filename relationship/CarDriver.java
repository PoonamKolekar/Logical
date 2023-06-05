package com.jsp.relationship;

public class CarDriver {
public static void main(String[] args) {
	Car c1 =new Car("bmw","BMW X","Black",500000);
	c1.printCarDetails();
	System.out.println("=======");
	c1.setEngine(new Engine("335","2993"));
	c1.printCarDetails();
}
}
