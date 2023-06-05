package com.jsp.inheritance;

public class VehicleDriver {
public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.name="Mp18";
	b1.Color="black";
	b1.wheel=2;

	b1.color="white";
	b1.price= 10000000;
	System.out.println(b1.Color);
	System.out.println(b1.name);
	System.out.println(b1.price);
	
	System.out.println(b1.Price);
	
}
}
