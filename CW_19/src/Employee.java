
public class Employee extends Person {
	private String company;
	private double salary;

	public Employee(){

	}

	public Employee(String name, int id, int age, String company, double salary){
		super(name, id, age); //(obratilis) kak v person construct
		this.setCompany(company);
		this.setSalary(salary);
	}
	public void setCompany(String company){
		if(company != null)
			this.company = company;
		else  System.out.println("Error: wrong company");
	}
	public void setSalary(double salary){
		if(salary > 0)
			this.salary = salary;
		else System.out.println("Error: wrong salary");		
	}

	public String getCompany(){
		return company;
	}
	public double getSalary(){
		return salary;
	}

	public void display(){
		super.display(); //(obratilis) k person display name. age, id
		System.out.print("Company: " + company);
		System.out.println("\tSalary:" + salary);
	}
}
