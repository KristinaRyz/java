
public class Pizzeria {

	public static void main(String[] args) {
		
		BasePizza margarita = new BasePizza("white dough", "tomato", "mozarela");
		System.out.println(margarita.toString());
		
		Diabola diabola = new Diabola("white dough", "tomato spicy", "parmezan", "salami", "chili peper");
		System.out.println(diabola.toString());
		
		
	}

}
