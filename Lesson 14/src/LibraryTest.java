import telran.liststest.library.Library;
import telran.liststest.testclasses.Book;

public class LibraryTest {

	public static void main(String[] args) {
		Library lib = new Library("im.Krupskoy", "Donetsk, Artem 120");
		Book bk1 = new Book(12345,"Buratino");
		Book bk2 = new Book(4567, "Chipolino");
		Book bk4 = new Book(7891,"Idiot");
		Book bk3 = new Book(98745, "Neznaika");

		lib.addBook(bk1);
		lib.addBook(bk2);
		lib.addBook(bk3);
		lib.addBook(bk4);

		lib.displayLibrary();
		System.out.println("=====Remove Book======");
		lib.removeBook(4567);
		lib.displayLibrary();
	}

}
