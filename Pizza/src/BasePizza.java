
public class BasePizza {

	private String dough;
	private String sause;
	private String cheese;

	public BasePizza(String dough, String sause, String cheese) {
		this.dough = dough;
		this.sause = sause;
		this.cheese = cheese;
	}

	@Override
	public String toString() {
		return "Pizza contains: " + dough + " " + sause +" " + cheese;
	}
	
	
}
