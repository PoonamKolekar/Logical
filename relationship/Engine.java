package com.jsp.relationship;

public class Engine {
private String horsepower ;
private String cubic_capacity;

public Engine(String horsepower,String cubic_capacity) {
	this.horsepower=horsepower;
	this.cubic_capacity=cubic_capacity;
		
}

public String getHorsepower() {
	return horsepower;
}

public void setHorsepower(String horsepower) {
	this.horsepower = horsepower;
}

public String getCubic_capacity() {
	return cubic_capacity;
}

public void setCubic_capacity(String cubic_capacity) {
	this.cubic_capacity = cubic_capacity;
}

}
