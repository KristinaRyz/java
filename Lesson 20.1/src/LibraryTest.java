
public class LibraryTest {
	

		public static void main(String[] args) {
			Library lib = 
			new Library("Lenina","Ramla,Lenina 12");
			Book bk1 = new Book("Buratino","Tolstoy",120);
			Book bk2 = new Book("Mtsyri","Lermontov",34);
			Book bk3 = new Book("Chippolino","Rodari",110);
			Book bk4 = new Book("Shinel","Gogol",200);
			Book bk5 = new Book("Nos","Gogol",97);
			Book bk6 = new Book("Buratino","Tolstoy",120);
			Book bk7 = new Book("Ananas","Vadym",220);
			lib.addBook(bk6);
			lib.addBook(bk2);
			lib.addBook(bk4);
			lib.addBook(bk1);
			lib.addBook(bk3);
			lib.addBook(bk5);
			lib.addBook(bk7);
			
			lib.display();
			
			System.out.println();
			System.out.println("------remove book---------");
			lib.removeBook("tolstoy", "buratino");
			lib.display();
			System.out.println("------remove book---------");
			lib.removeBook("tolstoy", "buratino");
			lib.display();
			System.out.println("------remove book---------");
			lib.removeBook("tolstoy", "buratino");
			lib.display();
			
			System.out.println("------remove book---------");
			lib.removeBook("tolstoy", "chipolino");
			lib.display();
			
			System.out.println("------Total Books ---------");
			int res = lib.getTotalBooks();
			System.out.println("Total = " + res);
			
		}

	}

