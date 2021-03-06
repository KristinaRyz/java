
public abstract class Book {

	private int isbn;
	private String title;
	private String author;
	private int basePrice;

	public Book() {
		super();
	}

	public Book(int isbn, String title, String author, int basePrice) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.basePrice = basePrice;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	@Override
	public String toString() {
		String str ="ISBN: " + isbn + "\t Title: " + title + "\t Author: " +  author + "\t BasePrice: " + basePrice;
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		Book bk = (Book) obj;
		if(this.isbn == bk.isbn && this.title.equals(bk.title) && this.author.equals(bk.author))
			return true;
		return false;
	}

	public abstract double calculatePrice();
}
