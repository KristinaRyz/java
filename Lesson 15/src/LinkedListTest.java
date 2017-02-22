import java.util.*;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> linkList= new LinkedList<String>();
		linkList.add("Hello");
		linkList.add("Bye");
		linkList.add("Money");
		linkList.add("Happy");

		/*Integer i = 6; 6 vnutri objecta integer auto boxing
	integer i = new Integer(6); boxing
	Double d = 87.67 auto boxing*/

		linkList.add(2, "Igor");
		System.out.println(linkList);//ili tak .toString()
		linkList.removeFirst();
		System.out.println(linkList);

		String str =linkList.get(3);
		System.out.println(str);

		boolean res = linkList.contains("Money");
		System.out.println(res);


		LinkedList<String> l1= new LinkedList<String>();
		ArrayList<String> l2= new ArrayList<String>();

		l1.add("Alex");
		l1.add("Rivka");
		l1.add("Haim");
		l1.add("Iossi");

		l2.add("Fiat");
		l2.add("Volvo");
		l2.add("Suzuki");
		l2.add("Honda");

		linkList.addAll(l2); //merge arraylist & linkedlist
		System.out.println(linkList);

		linkList.addAll(2, l1);
		System.out.println(linkList);

		List<String> list = linkList.subList(4, 9);//vozvrawaet v vide lista ot indexa do indexa
		System.out.println(list);

	}
}
