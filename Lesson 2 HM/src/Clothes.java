
public class Clothes {

	private int size;
	private String color;
	private String brand;

	public Clothes(){
		//		System.out.println("Constructor");
	}

	public Clothes(int size, String color, String brand){
		this.setSize(size);
		this.setColor(color);
		this.setBrand(brand);
	}

	public void setSize(int size){
		if (size>0)
			this.size = size;
		else
			System.out.print("Error: wrong size" + size);
	} 

	public void setColor(String color){
		if(color != null)
			this.color = color;
		else
			System.out.println("Error: wrong color" + color);
	}
	public void setBrand(String brand){
		if(brand != null)
			this.brand = brand;
		else 
			System.out.println("Error: wrong brand" + brand);
	}

	public int getSize(int size){
		return size;
	}

	public String getColor(String color){
		return color;
	}

	public String getBrand(String brand){
		return brand;
	}

	public void display(){
		System.out.print("Size: " + size);
		System.out.print("\t Color: " + color);
		System.out.println("\t Brand: " + brand);
	}
}


