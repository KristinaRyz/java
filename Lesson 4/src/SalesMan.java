
public class SalesMan extends Employee {
private double totalSales;
private double bonus;


public SalesMan(int id, String name, String company, double baseSalary, double totalSales, double bonus) {
	super(id, name, company, baseSalary);
	this.totalSales = totalSales;
	this.bonus = bonus;
}
public double getTotalSales() {
	return totalSales;
}
public void setTotalSales(double totalSales) {
	this.totalSales = totalSales;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return super.toString() + "\tTotalSales: " + totalSales + "\tBonus:" + bonus;
}
@Override
public boolean equals(Object obj) {
	SalesMan sm = (SalesMan) obj;
	if(super.equals(sm) && this.bonus == sm.bonus)
	return true;
	return false;
}
@Override
public double calculateSalary() {
	double salary = getBaseSalary() + ((bonus * totalSales)/100);
	return salary;
}



}
