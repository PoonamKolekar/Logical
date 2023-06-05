package com.jsp.pattern;

public class P44 {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--) {
		for(int sp=1;sp<=n-i;sp++) {
		System.out.print('_');	
		}
		for(int j=i;j>=1;j--) {
			System.out.print('*');
		}
	System.out.println();
	}
	
	
	
}
}
//*****
//_****
//__***
//___**
//____*
