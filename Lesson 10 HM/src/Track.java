
public class Track extends Car {
private int weight;

public Track(String model, String color, int year, int weight) {
	super(model, color, year);
	this.weight = weight;
}

@Override
public String toString() {
	return super.toString() + "Track [weight=" + weight +"]";
}



}
