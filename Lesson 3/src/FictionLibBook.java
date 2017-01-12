
public class FictionLibBook extends LibBook{
	private String genre;

	public FictionLibBook() {
		super();
	}
	public FictionLibBook(String title, String author, int isbn, int cutNumber, String genre) {
		super(title, author, isbn, cutNumber);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		String str = super.toString() + "\tGenre : " + genre;
		return str;
	}
	@Override
	public boolean equals(Object obj) {
		FictionLibBook flb = (FictionLibBook) obj;
		if(super.equals(flb) && this.genre.equals(flb.genre))
		return true;
		return false;
		
	}


}
