package dao;

public class Car {
	private String model;
	private int year;
	private String color;
	private boolean firstHand;

	public Car(String model, int year, String color, boolean firstHand) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.firstHand = firstHand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFirstHand() {
		return firstHand;
	}

	public void setFirstHand(boolean firstHand) {
		this.firstHand = firstHand;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", firstHand=" + firstHand + "]";
	}



}
