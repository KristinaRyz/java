package com.telran.company.company;

import com.telran.company.employee.Employee;

public class TestCompany {

	public static void main(String[] args) {
		Company c = new Company("Humus LTD","Vaitsman 20, Ramla");
		Employee e1 = new Employee("Haim", 1234, "Manager", 30000);
		Employee e2 = new Employee("Alex", 3456,"Humusman",30000);
		Employee e3 = new Employee("Rivka", 6548, "Top Manager", 50000);
		Employee e4 = new Employee("Iossi", 7894, "Senior Humusman", 60000);
		Employee e5 = new Employee("David", 7895, "SalesMan", 15000);
		
		c.hireEmployee(e1);
		c.hireEmployee(e2);
		c.hireEmployee(e3);
		c.hireEmployee(e4);
		c.hireEmployee(e5);

		c.displayCompany();
		c.fireEmployee(3456);
		c.displayCompany();

	}

}
