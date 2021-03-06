
public class ProfBook extends Book {
	private int catProf;

	public ProfBook() {
		super();
	}

	public ProfBook(int isbn, String title, String author, int basePrice, int catProf) {
		super(isbn, title, author, basePrice);
		this.catProf = catProf;
	}

	public int getCatProf() {
		return catProf;
	}

	public void setCatProf(int catProf) {
		this.catProf = catProf;
	}

	@Override
	public String toString() {
		return super.toString() + "\t CatProf: " + catProf;
	}

	@Override
	public boolean equals(Object obj) {
		ProfBook pb = (ProfBook) obj;
		if(this.catProf == pb.catProf)
			return true;
		return false;
	}

	@Override
	public double calculatePrice() {
		double salary = getBasePrice() * catProf;
		return salary;
	}

}
