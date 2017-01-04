
public class TestMovie {

	public static void main(String[] args) {
		
Movie m1 = new Movie("Titanic", "Cameron", 1999);
System.out.println(m1.toString());

Movie m2 = new Movie("Titanic", "Cameron", 1999);
System.out.println(m2.toString());

boolean res = m1.equals(m2);
System.out.println(res);
}

}
