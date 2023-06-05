package com.jsp.fraction;

public class Fraction {
private int numerator;
private int denominator;
 //constructor

public Fraction(int numerator,int denominator) {
	this.numerator= numerator;
	this.denominator= denominator;
	simplify();
	
}
//getters and setter 

public int getNumerator() {
	return numerator;
}

public void setNumerator(int numerator) {
	this.numerator = numerator;
}

public int getDenominator() {
	return denominator;
}

public void setDenominator(int denominator) {
	this.denominator = denominator;
}

//non static method to solve
public void simplify() {
	int gcd = 1;
	int smaller= Math.min(numerator,denominator);
	for(int i=1;i<=smaller;i++) {
		if(numerator%i==0 && denominator%1==0) {
			gcd=i;
		}
	}
numerator=numerator/gcd;
denominator=denominator/gcd;
	
}
public void printSimplifiedFraction() {
	System.out.println(numerator+"/"+ denominator);
}





}
