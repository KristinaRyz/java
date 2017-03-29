package myminimarket.product;

public abstract class Food extends Product {
	private String expDate;
	private boolean isKosher;

	public Food(String name, double price, int code, String munit, String expDate, boolean isKosher) {
		super(name, price, code, munit);
		this.expDate = expDate;
		this.isKosher = isKosher;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public boolean isKosher() {
		return isKosher;
	}

	public void setKosher(boolean isKosher) {
		this.isKosher = isKosher;
	}

	@Override
	public String toString() {
		return super.toString() + expDate + ":" + isKosher + ":";
	}



}
