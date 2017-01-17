
public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Person pr = new Person(1234,"Haim");
//		System.out.println(pr); // ne nujno pisat String str = pr.toString(); Syso(str);
		
//		System.out.println(pr.clone());//vizov clone, vibor 1 stro4ki
		
		WageEmployee we = new WageEmployee (1234,"Haim","IBM", 5000, 180, 50);
		double salary = we.calculateSalary();
		System.out.println(we.toString() + "\tSalary: " + salary+" $");
		
		Manager mn = new Manager(23456, "Alon", "Intel", 6000, 3);
		SalesMan sm = new SalesMan(654789, "Dror", "Intel", 5000, 100000, 1);
		
	salary =TestEmployee.calculateEmployeeSalary(we);//vizivaem abstract methods obwii calculateEmloyeeSalary, no poluchaen parametr tot kotorii ukazivaem. 
		System.out.println(salary + " $");
		
		salary =TestEmployee.calculateEmployeeSalary(mn); 
		System.out.println(salary + " $");
		
		salary =TestEmployee.calculateEmployeeSalary(sm);
		System.out.println(salary + " $");
	}
	public static double calculateEmployeeSalary(Employee emp){//vizivau abstract methods
		System.out.println(emp.toString());
		return emp.calculateSalary(); // zdes parametr vedet sebya kak zapisan v svoem klasse
	}

}
