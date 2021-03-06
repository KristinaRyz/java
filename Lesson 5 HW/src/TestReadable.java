
public abstract class TestReadable {

	public static void main(String[] args) {
		WebSite ws = new WebSite("http://newsru.co.il/");
		Book b = new Book ("Java 8.", "Schildt");
		Magazine m = new Magazine("Discovery");

		TestReadable.howIRead(m, 4);
		TestReadable.howIRead(b, 20);
		TestReadable.howIRead(ws, 30);
	}

	public static void howIRead(Readable q, int quantity){
		q.read(quantity);
	}
}
