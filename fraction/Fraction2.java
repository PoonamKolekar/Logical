package com.jsp.fraction;



	public class Fraction2 {
		private int numerator;
		private int denominator;

	//constructor
		public Fraction2(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
			simplify();
		}
		public Fraction2() {
			
		}

	//public getters and setters
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
		public  void simplify() {
			int gcd=1;
			int smaller=Math.min(numerator, denominator);
			for(int i=1;i<=smaller;i++) {
				if(numerator%i==0 && denominator%i==0) {
					gcd=i;
				}
			}
			numerator=numerator/gcd;
			denominator=denominator/gcd;
		}
		
		public void increment() {
			numerator=numerator+denominator;
			simplify();
		}
		public void sumOfFraction(Fraction2 f2) {
			numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
			denominator=this.denominator*f2.denominator;
			simplify();
		}
		
		public Fraction2 sumOfTwoFractionInput(Fraction2 f1,Fraction2 f2) {
			Fraction2 f3=new Fraction2();
		numerator=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
			denominator=f1.denominator*f2.denominator;
			f3.setNumerator(numerator);
			f3.setDenominator(denominator);
			return f3;
		}
		
		public void printSimplifiedFraction() {
			System.out.println(numerator+"/"+denominator);
		}
		

	}


