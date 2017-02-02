
public class Bus extends Car {
private int route;

public Bus(String model, String color, int year, int route) {
	super(model, color, year);
	this.route = route;
}

@Override
public String toString() {
	return super.toString() +  "Bus [route=" + route + "]";
}

}
