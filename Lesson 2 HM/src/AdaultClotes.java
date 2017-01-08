
public class AdaultClotes extends Clothes{
	private String genders;

	public AdaultClotes(){
		//		System.out.println("Constructor");
	}

	public AdaultClotes(int size, String color, String brand, String genders){
		this.setSize(size);
		this.setColor(color);
		this.setBrand(brand);
		this.setGenders(genders);
	}

	public void setGenders(String genders){
		if(genders != null)
			this.genders = genders;
		else
			System.out.println("Error: wrong genders" + genders);
	}

	public String getGenders(String genders){
		return genders;
	}
	@Override
	public void display(){
		super.display();
		System.out.println("Genders: " + genders);
	}

}
