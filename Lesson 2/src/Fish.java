
public class Fish extends Animal {
	private String arial;

	public Fish(int age, String name, String kind, String arial){
		this.setAge(age);
		this.setName(name);
		this.setKind(kind);
		this.setArial(arial);

	}

	public String getArial() {
		return arial;
	}

	public void setArial(String arial) {
		if(arial != null)
			this.arial = arial;
	}
	@Override
	
	public void display(){

	}
}
