package com.jsp.pattern;

public class P33 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if(j%2==0) {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
		}System.out.println();
	}
}
}
//1
//10
//101
//1010
//10101
