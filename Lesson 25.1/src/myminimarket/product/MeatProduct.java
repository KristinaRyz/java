package myminimarket.product;

public class MeatProduct extends Food {
private String type;

public MeatProduct(String name, double price, int code, String munit, String expDate, boolean isKosher, String type) {
	super(name, price, code, munit, expDate, isKosher);
	this.type = type;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return super.toString() + type;
}


}
