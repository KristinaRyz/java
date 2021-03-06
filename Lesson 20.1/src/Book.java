
public class Book implements Comparable<Book>{
		private String title;
		private String author;
		private int pages;


		public Book(String title, String author, int pages) {
			super();
			this.title = title;
			this.author = author;
			this.pages = pages;
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
		public int getPages() {
			return pages;
		}
		public void setPages(int pages) {
			this.pages = pages;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
		}
		@Override
		public int compareTo(Book b) {
			return this.title.compareToIgnoreCase(b.title);
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Book){
				Book bk = (Book)obj;
				if(this.author.equalsIgnoreCase(bk.author)&& this.title.equalsIgnoreCase(bk.title)){
					return true;
				}else{
					return false ;
				}
			}else{
				return false;
			}
		}





	}

