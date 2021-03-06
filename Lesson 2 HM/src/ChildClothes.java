
public class ChildClothes extends Clothes {
	private int age;

	public ChildClothes(){
		//	System.out.println("Constructor");
	}

	public ChildClothes(int size, String color, String brand, int age){
		this.setSize(size);
		this.setColor(color);
		this.setBrand(brand);
		this.setAge(age);
	}

	public void setAge(int age){
		if( age >= 0)
			this.age = age;
		else 
			System.out.println("Error: wrong age " + age);
	}

	public int getAge(int age){
		return age;
	}
	@Override
	public void display(){
		super.display();
		System.out.print("Age: " + age);
	}
}
