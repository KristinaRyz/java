
public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Person pr = new Person(1234,"Haim");
//		System.out.println(pr); // ne nujno pisat String str = pr.toString(); Syso(str);
		
//		System.out.println(pr.clone());//vizov clone, vibor 1 stro4ki
		
		WageEmployee we = new WageEmployee (1234,"Haim","IBM", 5000, 180, 50);
		double salary = we.calculateSalary();
		System.out.println(we.toString() + "\tSalary: " + salary+" $");
	}

}
