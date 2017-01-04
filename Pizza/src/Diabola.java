
public class Diabola extends BasePizza {
	private String extraMeat;
	private String extraVeggie;
	
	
	public Diabola(String dough, String sause, String cheese, String extraMeat, String extraVeggie) {
		super(dough, sause, cheese);
		this.extraMeat = extraMeat;
		this.extraVeggie = extraVeggie;
	}


	@Override
	public String toString() {
		return super.toString() + " " + extraMeat + " " + extraVeggie;
	}
	
	
	
	
	
	
	
	
	
 
}
