
public class Car {
	//data members, properties, 
	private String model; // teper k nim nelzya dobrat'sya
	private String color;
	private int year;

	//default constructor
	public Car(){
		System.out.println("Constructor");
	}
	
	
//	//other constructor
//	public Car(String m, String c, int y){
//		setModel(m);
//		setColor(c);
//		setYear(y);
//		
//	}
//	
	

	// setters
	public void setModel(String m){
		if(m != null)
			model = m;
		else
			System.out.println("Error: wrong model -> " + m);
	}
	public void setColor(String c){
		if(c != null)
			color = c;
		else
			System.out.println("Error: wrong color -> " + c);
	}
	public void setYear(int y) {
		if(y>0 && y<=2017)
			year = y;
		else 
			System.out.println("Error: wrong year -> " + y);

	}
	//Getters
	public String getModel(){
	return model;
}
	public String getColor(){
	return color;
	}
	public int getYear(){
			return year;
		}
	
	//custom methods
		public void display(){
			System.out.print("Model : " + model);
			System.out.print("\tColor: " + color);
			System.out.println("\tYear: " + year);
		}
}
