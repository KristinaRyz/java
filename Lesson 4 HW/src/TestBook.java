
public class TestBook {

	public static void main(String[] args) {
		ProfBook pb= new ProfBook(123456, "������������ DOT COM", "������ ������", 200, 3);
		double salary = pb.calculatePrice();
		System.out.println(pb + "\tSalary: " + salary+" $");

		BestSeller bs = new BestSeller(1245,"Clean Code", "Robert C. Martin ", 500, 300);
		double salary1 = bs.calculatePrice();
		System.out.println(bs + "\t Salary: " + salary1 + " $");

		EducBook eb = new EducBook(1245, "The Hacker Playbook", " Peter Kim", 200, 100);
		double salary2 = eb.calculatePrice();
		System.out.println(eb + "\t Salary: " + salary2 + " $");
	}

}