
public class Laptop extends Computer {
    private double weight;
   
	
	public Laptop(int memory, int disk,
			String company, double weight) {
		super(memory, disk, company);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		String str = super.toString() + " Weigth : " + weight;  // a esli bolwe parametrov??
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		Laptop lp = (Laptop)obj;
		if(super.equals(lp) 
				&& this.weight == lp.weight){
			return true;
		}
		
		return false;
	}
    
    
}
