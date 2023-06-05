package com.jsp.pattern;

public class P43 {
public static void main(String[] args) {
	int n=5;
		for(int i=n;i>=1;i--) {
		int temp=n;
		for(int j=1;j<=i;j++) {
			System.out.print( temp);
			temp--;
		}
		
		System.out.println();
	}
}
}
//54321
//5432
//543
//54
//5
