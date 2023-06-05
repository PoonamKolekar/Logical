package com.jsp.pattern;

public class P48 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int count=i;
		
			for(int sp=1 ;sp<=n-i;sp++) {
				System.out.print("_");
			
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count);
			 count ++;
			}
			System.out.println();
		}
	}
}


//____1
//___23
//__345
//_4567
//56789
