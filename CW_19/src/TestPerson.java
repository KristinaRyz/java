public class TestPerson {

	public static void main(String[] args) {
		Person pr1 = new Person(); //ssilka na repson = null NEW - OB'EKT
		pr1.setName("Haim"); // obratilis 4eres ssilky
		pr1.setID(456789);
		pr1.setAge(127);
		System.out.println("Name is " + pr1.getName() + " ID is " + pr1.getId() + " age is " + pr1.getAge());
		System.out.println("ID is " + pr1.getId());
		System.out.println("Age is " + pr1.getAge());
		

		
		Person pr2 = new Person();
		pr2.setName("Rivka");
		pr2.setID(789415);
		pr2.setAge(118);
		

		Person pr3 = null;
		pr3 = pr1;
		pr1.setID(-456);
		pr1.setAge(-5);
		
		System.out.println();
		pr1.display();
		pr2.display();
		pr3.display();
	}

}
