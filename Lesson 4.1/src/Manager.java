
public class Manager extends Employee{
private int grude;



public Manager(int id, String name, String company, double baseSalary, int grude) {
	super(id, name, company, baseSalary);
	this.grude = grude;
}

public int getGrude() {
	return grude;
}

public void setGrude(int grude) {
	this.grude = grude;
}

@Override
public String toString() {
	return super.toString() + "\tGrude: " + grude;
}

@Override
public boolean equals(Object obj) {
	Manager m = (Manager) obj;
	if(super.equals(m) && this.grude == m.grude)
	return true;
	return false;
}

@Override
public double calculateSalary() {
	double salary = getBaseSalary() * grude;
	return salary;
}



}
