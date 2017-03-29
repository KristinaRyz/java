package myminimarket.product;

public class AlcoholProduct extends Food {
private double persent;

public AlcoholProduct(String name, double price, int code, String munit, String expDate, boolean isKosher, double percent) {
	super(name, price, code, munit, expDate, isKosher);
	this.persent = percent;
}

public double getPersent() {
	return persent;
}

public void setPersent(double persent) {
	this.persent = persent;
}

@Override
public String toString() {
	return super.toString() + persent;
}



}
