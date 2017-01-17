
public class WageEmployee extends Employee{
private double hours;
private int wage;

public WageEmployee(int id, String name, String company, int baseSalary, double hours, int wage) {
	super(id, name, company, baseSalary);
	this.hours = hours;
	this.wage = wage;
}
public double getHours() {
	return hours;
}
public void setHours(double hours) {
	this.hours = hours;
}
public int getWage() {
	return wage;
}
public void setWage(int wage) {
	this.wage = wage;
}

public String toString(){
	String str = super.toString() + "\tHours: " + hours + "\tWage: " + wage;
	return str;
}
@Override
public boolean equals(Object obj) {
	WageEmployee wemp = (WageEmployee) obj;
	if(super.equals(wemp) && this.wage == wemp.wage)
	return true;
	return false;
}
@Override
public double calculateSalary() {
	double salary = getBaseSalary() + (hours*wage);
	return salary;
}



}
