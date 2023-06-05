package com.jsp.fraction;

public class Fraction2driver {
public static void main(String[] args) {
	Fraction2 f1= new Fraction2 (8,4);
	Fraction2 f2= new Fraction2(3,2);
	Fraction2 f3= new Fraction2();
	f3.sumOfTwoFractionInput(f1,f2);
	f3.simplify();
	f3.printSimplifiedFraction();
}
}
