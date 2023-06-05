package com.jsp.relationship;

public class Sim1 {

	private String service_provider;
	private long contact_no;
	//constructor
	
	public Sim1(String service_provider,long contact_no) {
		this.service_provider=service_provider;
		this.contact_no=contact_no;
		
		//public setter getters
		
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public long getContact_no() {
		return contact_no;
	}

	
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	
	
	
	//method to print details of sim1
	
	public void printSim1Deatils() {
		
		System.out.println("sim1 is config");
		System.out.println("sim1 service provider name is"+service_provider);
		System.out.println("sim1 contact no is"+contact_no);
	}
	
}
