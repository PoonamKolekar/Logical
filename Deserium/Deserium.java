package com.jsp.Deserium;

public class Deserium {

	public static boolean isDeserium (int n) {
		//count the no of digit//
	int temp=n;
	int z=n;
	int count=0;
    int rem =0;
    		
    int sum=0;
		while (temp>0) {
			temp=temp/10;
			
			z=z/10;
			
		}
		
		//main
		while(z>0) {
			int last_digit=z%10;
			for (int i=1;i<=count;i++) {
				count--;
			}
			sum=sum + (last_digit*temp);
		
		//int pro=1;
		//to find the power
		//for (int i=1;i<=count;i++) {
		//	pro=pro*last_digit;
		//}
	//	sum=sum+pro;
		//z=z/10;
		}
	if(sum==n) {
	System.out.println("is disarium");
		}else {
			System.out.println("not disarium");
		}
	return false;
	}
	public static void main (String args[]) {
		System.out.println(isDeserium(153));
		
	
	}
}
