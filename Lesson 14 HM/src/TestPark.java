
public class TestPark {

	public static void main(String[] args) {

		Garage park = new Garage("Star", "bulvar Shevchenko, 25");

		Car c1 = new Car("Suzuki", 2005);
		Car c2 = new Car("Fiat", 2007);
		Car c3 = new Car("Honda", 2009);
		Car c4 = new Car("Tavria", 2008);
		Car c5 = new Car("Lex", 2010);

		park.addCar(c1);
		park.addCar(c2);
		park.addCar(c3);
		park.addCar(c4);
		park.addCar(c5);

		park.displayGarage();

		System.out.println();
		System.out.println("=========Remove car==========");
		park.removeCar("Honda");
		park.displayGarage();
	}

}
