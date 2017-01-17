
public class Car implements Moveable{
	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void move(int speed) {
System.out.println("Car " + model + "rides on highway"+ " whith speed " + speed);		
	}
	
}
