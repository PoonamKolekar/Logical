package com.jsp.pattern;

public class P23 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i--) {
		for(int j=n ;j>n;j++) {
			System.out.print((char)(96+j));
		}
		System.out.println();
	}
}
}
