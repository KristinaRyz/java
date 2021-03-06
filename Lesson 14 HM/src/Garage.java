import java.util.ArrayList;

public class Garage {

	private String name;
	private String address;
	private ArrayList<Car> park = new ArrayList<Car>();


	public Garage(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public void addCar (Car c){
		park.add(c);
	}

	public int carCount (){
		return park.size();
	}

	public void removeCar(String model){
		for(int i = 0; i<park.size(); i++){
			String j = park.get(i).getModel();
			if(j == model){
				park.remove(i);
			}
		}
	}

	public void displayGarage(){
		System.out.println("Garage name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Car count : " + park.size());
		System.out.println("Car list : ");
		for(int i = 0; i < park.size(); i++){
			System.out.println(park.get(i));
		}
	}

}

