
public class WageEmployee extends Employee {
	private double hours; // double eto drobnie i 8 byte
	private double wage; // oplata za 4as
	
	
	
	public WageEmployee() {
		super();
	
	}
	public WageEmployee(String name, int id, int age, String company, double salary, double hours, double wage) {
		super(name, id, age, company, salary);
		this.setHours(hours);
		this.setWage(wage); 
	
	}
	
	
	
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public void display(){
		super.display();
		System.out.print("Hours: " + hours);
		System.out.println("\tWage :" + wage);
		
	}
	

}
