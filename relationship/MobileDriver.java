package com.jsp.relationship;

public class MobileDriver {
public static void main(String[] args) {
	Mobile m1 =new Mobile("FUSION","moto",40000,"12GB") ;
	m1.setSim1(new Sim1("airtel",874512132l));
	m1.setSim2(new Sim2("jio",4875653211l));
	m1.printEntireMobileDetails();
	
}
}
