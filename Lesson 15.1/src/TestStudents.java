
public class TestStudents {

	public static void main(String[] args) {

		Subject sub1 = new Subject("Computer Algorithms","Building M1, floor 2, room 1"); 
		Subject sub2 = new Subject("Programming Languages","Building M1, floor 2, room 2"); 
		Subject sub3 = new Subject("Database Systems","Building M1, floor 2, room 3"); 

		Student s1 = new Student("Viki", "Computer science");
		Student s2 = new Student("Vitya", "biotehnologie science");
		Student s3 = new Student("Julia", "Physic science");
		
		s1.addSubject(sub1);
		s1.addSubject(sub2);
		s1.addSubject(sub3);
		
		s1.displayStudent();
		
		s2.addSubject(sub2);
		s2.addSubject(sub3);
		s2.addSubject(sub1);
		
		s2.displayStudent();
		
		s3.addSubject(sub3);
		s3.addSubject(sub1);
		s3.addSubject(sub2);
		
		s3.displayStudent();
		
	}

}
