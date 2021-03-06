import java.util.ArrayList;

import telran.liststest.testclasses.Book;
import telran.liststest.testclasses.Car;//esli postavit * dobavit vse klassi odnogo package
import telran.liststest.testclasses.Person;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		String str ="Hello";
		String str1 =new String ("Bye");
		String str2 = "Money";

		list.add(str);
		list.add(str1);
		list.add(str2);

		Integer i1 = new Integer(7);
		Double d1 = new Double(34.8);
		list.add(i1);
		list.add(d1);
		list.add(str1);

		Car c1 = new Car("Fiat", 2001);
		Person p1 = new Person(45645, "Vasya");
		Book b1 = new Book(45654, "Book");

		list.add(b1);
		list.add(p1);
		list.add(c1);

		for(int i = 0; i< list.size(); i++){//pechataet vse elementi v cikle po index
			System.out.println(list.get(i));
		}
		System.out.println();// print toString
		System.out.println(list.toString()); 

		System.out.println("=====Remove by index====");
		list.remove(5);
		System.out.println(list.toString());
		System.out.println();
		System.out.println("====Find index====");
		int i = list.indexOf(c1);// poisk indexa po elementu
		System.out.println("in index:" + i);
		System.out.println();
		System.out.println("====Remove element====");
		list.remove(b1);
		System.out.println(list.toString());
		System.out.println();
		System.out.println("========Remove all========");
		//		list.clear();
		System.out.println();
		System.out.println("====Contains element=====");
		System.out.println(list.contains(i1));
		System.out.println(list.toString());

		System.out.println();
		System.out.println("===Print list <String> generics ====");
		ArrayList<String> listStrings = new ArrayList<String>();// generics
		listStrings.add(str2);
		System.out.println(listStrings.toString());


	}



}
