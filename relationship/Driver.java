package com.jsp.relationship;

public class Driver {
public static void main(String[] args) {
	Father f1 =new Father();
	f1.buyland();
	
	
	Son s1= new Son();
	s1.buildHouse();
	s1.buyland();
	
	
	Grandson gs= new Grandson();
	gs.buyland();
	gs.buildHouse();
	gs.buyCar();
	
}
}
