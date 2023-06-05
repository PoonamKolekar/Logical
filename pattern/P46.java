package com.jsp.pattern;

public class P46 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int sp=1 ;sp<=n-i;sp++) {
			System.out.print("_");
		}
		for(int j=1;j<=i;j++) {
			System.out.print('*');
		}
		System.out.println();
	}
}
}

//____*
//___**
//__***
//_****
//*****
