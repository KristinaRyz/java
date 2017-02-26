 
public class MinimarketTest {

	public static void main(String[] args) {

		Product pr1 = new Product("Mango", 8.5, 789456);
		Product pr2 = new Product("Banan", 8.7, 56123);
		Product pr3 = new Product("Chiken", 32, 98745);
		Product pr4 = new Product("Moloko", 5.7, 32145);
		Product pr5 = new Product("Water", 10.5, 75423);
		
		Minimarket mini = new Minimarket("Kolbo Iossi","Herzel 20");
		
		mini.addProduct(pr1);
		mini.addProduct(pr2);
		mini.addProduct(pr3);
		mini.addProduct(pr4);
		mini.addProduct(pr5);

		mini.displayMinimarket();
		
		

	}

}
