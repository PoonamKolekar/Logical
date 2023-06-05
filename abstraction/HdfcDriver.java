package com.jsp.abstraction;

public class HdfcDriver {
public static void main(String[] args) {
	Payment payment= new Payment();
	payment.payment();
	payment.transfer();
	payment.checkStatement();
}
}
