
public class MainTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Iossi",123,43,"SAP",25000);
		
		WageEmployee wemp = new WageEmployee("Dav", 123, 45, "Ibm", 45623, 180, 56);
		
		wemp.display();
//		emp1.setName("Boris");
//		emp1.setAge(55);
//		emp1.setID(456789365);
//		emp1.setSalary(25000);
//		emp1.setCompany("BBB");
//		
		emp1.display();
		
	}
	

}
