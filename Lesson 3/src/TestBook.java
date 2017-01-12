
public class TestBook {

	public static void main(String[] args) {
		FictionLibBook flb = new FictionLibBook("Buratino", "Tolstoy", 1234567, 1, "Fairtale");
		String str = flb.toString();
		System.out.println(str);
	
	FictionLibBook flb1 = new FictionLibBook("Buratino", "Tolstoy", 1234567, 1, "Fairtale");

	FictionLibBook flb2 = flb;
	boolean res = flb.equals(flb1);
	System.out.println(res);
	
	Object obj = flb1; // silka obj klass Object
	Book bk = flb1; // silka bk klass book
	LibBook lbk = flb1;
	
	}
}
