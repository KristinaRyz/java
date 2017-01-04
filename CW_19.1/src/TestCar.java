
public class TestCar {

	public static void main(String[] args) {
		    Car cr1 = new Car();
//			cr1.setModel("Fiat");
////			cr1.setColor("Blue");
//			cr1.setYear(2006);
			
			cr1.display();
			
			Car cr2 = new Car();
			cr2.setModel("Suzuki");
			cr2.setColor("Blue");
			cr2.setYear(2015);	
			
			
			System.out.println();
			cr1.display();
			cr2.display();
			
			int year1 = cr1.getYear();
			int year2 = cr2.getYear();

			if(year1>year2)
				System.out.println(cr1.getModel() + " is newer");
			else if (year1<year2)
				System.out.println(cr2.getModel() + " is newer");
			else 
				System.out.println("equals");
			
			
			
			
//			Car c3 = new Car("Mazda", "Black", 2012);
//			c3.display();
//			
//			
	}
}
	
