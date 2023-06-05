package com.jsp.relationship;

public class Mobile {
private String name;
private String brand;
private double price;
private String ram;

//achieve has relationship with sim1 sim2

private Sim1 sim1;
private Sim2 sim2;



public Mobile(String name, String brand,double price, String ram) {
this.name=name;
this.brand=brand;
this.price=price;
this.ram=ram;
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



public double getPrice() {
	return price;
}



public void setPrice(double price) {
	this.price = price;
}



public String getRam() {
	return ram;
}



public void setRam(String ram) {
	this.ram = ram;
}



public Sim1 getSim1() {
	return sim1;
}



public void setSim1(Sim1 sim1) {
	this.sim1 = sim1;
}



public Sim2 getSim2() {
	return sim2;
}



public void setSim2(Sim2 sim2) {
	this.sim2 = sim2;
}
public void printEntireMobileDetails() {
	System.out.println("mobile config");
	System.out.println(name+"is mobile name");
	System.out.println(brand+"is brand ");
	System.out.println(price+"is the cost");
	System.out.println(ram+"is the ram");
	
	if(sim1!=null) {
	sim1.printSim1Deatils();
	}
	else {
		System.out.println("sim1 is not inserted");
	}
	if(sim2!=null) {
		sim2.printSim2Deatils();
	}else {
		System.out.println("sim2 is not inserted");
	}
}

}
