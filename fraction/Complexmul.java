package com.jsp.fraction;

public class Complexmul {
	 private int real;
	 private int imaginary;

	//constructors
	 public Complexmul(int real,int imaginary){
		 this.real=real;
		this.imaginary=imaginary;
	 }
	 //getters setters
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}
	
	public void setImaginary(int imaginary){
		this.imaginary=imaginary;
	}




	//methods
	public void multiply(int real2, int imaginary2) {
		int real=this.real*real2 + this.imaginary*imaginary2*(-1);
		int imaginary=this.real*imaginary2 + this.imaginary*real2;
		this.setReal(real);
		this.setImaginary(imaginary);
		print();
	}
	

		public void print() {
			if(this.imaginary>=0) {
				System.out.println(this.real+"+"+"i"+this.imaginary);
			}else {
				System.out.println(this.real+"-"+"i"+this.imaginary*(-1));
			}
	}
}
