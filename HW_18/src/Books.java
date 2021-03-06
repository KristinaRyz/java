public class Books {

	private String author;
	private String title;
	private int pages;
	private long ISBN;

	public void setAuthor(String author) {
		if(author != null)
			this.author = author;
		else
			System.out.println("Error : wroung author " + author);
	}

	public void setTitle(String title) {
		if(title != null)
			this.title = title;
		else
			System.out.println("Error : wrong title " + title);
	}

	public void setPages(int pages) {
		if(pages > 0)
			this.pages = pages;
		else 
			System.out.println("Error : wrong pages " + pages);
	}

	public void setISBN(long iSBN) {
		if(iSBN > 0)
			ISBN = iSBN;
		else
			System.out.println("Error : wrong ISBN " + iSBN);
	}

	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	public long getISBN() {
		return ISBN;
	}

	public void display() {
		System.out.print("Author " + author);
		System.out.print("\tTitle " + title);
		System.out.print("\tPages " + pages);
		System.out.println("\tIsbn " + ISBN);
	}
}
