
public class BestSeller extends Book{
	private int addPrice;

	public BestSeller() {
		super();
	}

	public BestSeller(int isbn, String title, String author, int basePrice, int addPrice) {
		super(isbn, title, author, basePrice);
		this.addPrice = addPrice;
	}

	public int getAddPrice() {
		return addPrice;
	}

	public void setAddPrice(int addPrice) {
		this.addPrice = addPrice;
	}

	@Override
	public double calculatePrice() {
		double salary = getBasePrice() + addPrice;
		return salary;
	}

}
