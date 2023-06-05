package com.jsp.abstraction;

public class Driver {
public static void main(String[] args) {
	Son s=new Son();
	s.haveDaughter();
	s.M1();
	System.out.println("====");
	Father f=new Son();//upcasting
	f.haveDaughter();
	System.out.println("====");
	Grandfather grandFather=new Son();
			grandFather.haveDaughter();
}
}
