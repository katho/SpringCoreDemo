package com.grupo4.demo;


//Bean
public class Employee {

	//Attributes
	int eid;
	String ename;
	//String eaddress;
	Address address;
	
	//Methods
	public Employee()
	{
		System.out.println("-- Employee Object Constructed --");
	}

	public Employee(int eid, String ename) {
	
		this.eid = eid;
		this.ename = ename;
		
	}
	
	public Employee(Address address)
	{
		this.address = address;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address adddress) {
		this.address = adddress;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	/*
	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}*/

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + address + "]";
	}
	
	
	//Demo on beans
	public void myInit()
	{
		System.out.println("-- Object Initializaed --");
	}
	
	public void myDestroy()
	{
		System.out.println("-- Object Destroyed --");
	}
}
