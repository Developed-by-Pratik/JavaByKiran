package com.tasks.encapsulation;

public class Demo {
	
	private int ssn;
	private String empName;
	private int empAge;
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.setEmpName("Pratik");
		obj.setSsn(112233);
		obj.setEmpAge(23);
		
		System.out.println("Name :" + obj.getEmpName());
		System.out.println("SSN :" + obj.getSsn());
		System.out.println("Age :" + obj.getEmpAge());
	}
	
}
