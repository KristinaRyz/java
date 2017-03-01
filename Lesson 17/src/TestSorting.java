
import java.util.*;

public class TestSorting {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Kiwi");
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		list.add("Mango");
		System.out.println(list);
		
		Collections.sort(list);
		displayList(list);
		LinkedList<Person> perList = new LinkedList<Person>();
		Person p1 = new Person("Haim", 123, 34);
		Person p2 = new Person("David", 237, 22);
		Person p3 = new Person("Rivka", 129, 21);
		Person p4 = new Person("Iossi", 432, 31);
		Person p5 = new Person("Sarah", 234, 79);
		perList.add(p5);
		perList.add(p3);
		perList.add(p1);
		perList.add(p2);
		perList.add(p4);
		displayList(perList);
		
		Collections.sort(perList, new Comparator<Person>() {
			@Override
			public int compare(Person left, Person right) {
				int id1 = p1.getId();
				int id2 = p2.getId();
				return Integer.signum(id1 - id2);
				//return Integer.signum(left.getId() - right.getId());
			}
		});

//		Collections.sort(perList, (a, b) ->
//		a.getAge() < b.getAge() ? -1 : 
//			a.getId() == b.getId() ? 0 : 1);

		Collections.sort(perList, (a, b) ->
		Integer.signum(a.getId() - b.getId()));

		
		displayList(perList);
		ComparatorPersonByName comp1 = new ComparatorPersonByName();
		Collections.sort(perList, comp1);
		displayList(perList);
		//ComparatorPersonByAge comp2 = new ComparatorPersonByAge();
		Collections.sort(perList, new ComparatorPersonByAge());
		displayList(perList);

	}

	public static void displayList(List<?> list) {
		System.out.println("_________________");
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("_________________");
	}

}
