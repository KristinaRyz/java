
public class LibBook extends Book {
	private int cutNumber;



	public LibBook() {
		super();
	}



	//public LibBook(String title, String author, int isbn, int cutNumber) {
	//	super(title, author, isbn);
	//	
	//} // vmesto dopisivaniya smotri dalwe

	public LibBook(String title, String author, int isbn, int cutNumber) {
		super(title, author, isbn);        // costr classa book
		this.cutNumber = cutNumber;       // data members LibBook
	}                   // right click generate constructor using fiels, vibor book s 3 parametrami



	public int getCutNumber() {
		return cutNumber;
	}

	public void setCutNumber(int cutNumber) {
		this.cutNumber = cutNumber;
	}



	@Override
	public String toString() {
		String str = super.toString() + "\tcutNumber : " + cutNumber;
		return str;
	}
	
	public boolean equals(Object obj){
		LibBook lb = (LibBook) obj; // perepisivaem vsegda Object no vot casting delaem roditelya
		if(super.equals(lb) && this.cutNumber == lb.cutNumber)
		return true;
		return false;
		
	}
}
