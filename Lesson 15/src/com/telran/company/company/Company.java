
package com.telran.company.company;

import java.util.*;

import com.telran.company.employee.Employee;

public class Company {
	private String name;
	private String address;
	private LinkedList<Employee> staff = new LinkedList<Employee>();

	public Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void hireEmployee(Employee emp){
		staff.add(emp);
	}

	public boolean fireEmployee(int id){
		for(int i=0; i<staff.size(); i++){
			int empId = staff.get(i).getId();
			if (empId == id){
				staff.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void  displayCompany(){
		System.out.println("Company name: " + name);
		System.out.println("Adress : " + address);
		int staffCount  = staff.size();
		System.out.println("Total staf : " + staffCount);
		System.out.println("-----------------------");
		for(int i=0; i<staffCount;i++){
			System.out.println((i+1)+"." + staff.get(i));
		}
	}
	}


