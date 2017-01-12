
public abstract class Employee extends Person {
private String company;
private double baseSalary;

public Employee(int id, String name, String company, double baseSalary) {
	super(id, name);
	this.company = company;
	this.baseSalary = baseSalary;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}
@Override
public String toString () {
	String str = super.toString() + "\tCompany: " + company + "\t BaseSalary: " + baseSalary;
	return str;
}
@Override
public boolean equals(Object obj) {
	Employee emp = (Employee) obj;//ssilka tipa object privodim k ssilke tipa employee 
	if(super.equals(emp) && this.company.equals(emp.company))
	return true;
	return false;
}
public abstract double calculateSalary();


}
