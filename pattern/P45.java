package com.jsp.pattern;

public class P45 {
	public static void main(String[] args) {
		
	
int n=5;
for(int i=n;i>=1;i--) {
	for(int sp=1;sp<=n-i;sp++) {
		System.out.print(" ");	
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
	System.out.println();
	}
	
	
	
}
}
//54321
//4321
// 321
//  21
//   1
