package Test;

import dao.Car;
import dao.Employee;
import dao.Person;
import model.ObjectArray;

public class Test {

	public static void main(String[] args) {
		int[] arr = {2,-8,4};

		ObjectArray oa = new ObjectArray(3);//3 objecta v object
		oa.add(new Car("Ford", 2015, "#ffff00", true));
		Object obj = oa.removeLast();//???
		System.out.println(obj);//napechatal null, potomuchno array pustoi
		System.out.println(oa.size());//napechatal 0
		System.out.println("-------------------");
		oa.display();// esli bilo pusto, to bilo pusto, no potom dobavili if, i pechataet 4to isEmpty
		System.out.println("------------");
		
		oa.add(899999);// 0
		oa.add("Sasha");//1
		oa.add(arr);//2
		oa.add(2.7128);//3
		oa.add(new Car("Tavria", 1983, "#ff0000", false));//4
		oa.add(new Person("Sasha", 58, true));//5
		oa.add("Masha");//6
		
		oa.display();
		System.out.println(oa.size());//est 7 elementov
		//System.out.println(oa.get(3));
		//Object obj = oa.removeLast();//udalili 6 element
		obj = oa.removeLast();
		System.out.println(obj);//Masha udalilas
		System.out.println(oa.size());
		
		
		
		System.out.println("-------------");
		oa.display();
		System.out.println(oa.size());
		obj = oa.removeFirst();
		System.out.println(obj);//Masha udalilas
		System.out.println(oa.size());
		oa.display();
		
		
		System.out.println("-------------");
		//oa.display();
		System.out.println(oa.size());
		oa.addToHead(new Person("David", 28, false));
		oa.display();
		System.out.println(obj);//Masha udalilas
		System.out.println(oa.size());
		
		
//		//
//		ObjectArray oa1 = new ObjectArray();
//		oa1.add(38);
//		oa1.add(new Car("Volga", 1964, "black", true));
//		oa1.add("Masha");
//		oa1.add(new Person("Vasya", 28, true));
//		
//		ObjectArray oa2 = new ObjectArray();
//		oa2.add(83);
//		oa2.add(new Car("Ford", 1964, "black", true));
//		oa2.add("Glasha");
//		oa2.add(new Person("Petya", 78, true));
//		
////		System.out.println("-----Tail------");
////		oa1.mergeTail(oa2);
////		oa1.display();
//		System.out.println("-----Head------");
//		oa1.mergeHead(oa2);
//		oa1.display();
		
		
		Employee e= new Employee("Vasya", 33, true, 12000);
		System.out.println(e);
		
	}


}
