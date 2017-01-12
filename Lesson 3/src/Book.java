
public class Book {
	private String title;
	private String author;
	private int isbn;


	public Book() {
		//	super(); eto stro4ka nevagna
	}


	public Book(String title, String author, int isbn) {
		super();
		this.title = title;
		this.author = author;
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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

public String toString(){
	String str = "Title : " + title + "\tAuthor : " + author + "\tISBN : " + isbn;
return str;
}


@Override
public boolean equals(Object obj) {
	 Book bk = (Book)obj; // casting, bk smotrit na obj, no vidit ves object, ne tolko malenkii kusok
	 if(this.isbn == bk.isbn && this.title.equals(bk.title) && this.author.equals(bk.author))// 
	 return true;
	 
	 return false;
}
	


}
