
public class EducBook extends Book {
	private int grant;

	public EducBook() {
		super();
	}

	public EducBook(int isbn, String title, String author, int basePrice, int grant) {
		super(isbn, title, author, basePrice);
		this.grant = grant;
	}

	public int getGrant() {
		return grant;
	}

	public void setGrant(int grant) {
		this.grant = grant;
	}

	@Override
	public String toString() {
		return super.toString() + "\tGrant: " + grant;
	}

	@Override
	public boolean equals(Object obj) {
		EducBook eb = (EducBook) obj;
		if(this.grant == eb.grant)
			return true;
		return false;
	}

	@Override
	public double calculatePrice() {
		double salary = getBasePrice() - grant;
		return salary;
	}

}
