
package test;
import dao.Car;
import dao.Person;
import model.ObjectArray;

public class Test {

	public static void main(String[] args) {
		//
		ObjectArray oa = new ObjectArray(3);//3 yzcheiki
		int[] arr = {2,-8,4};
		

//		oa.add(38);//0
//		oa.add("Sasha");//1
//		oa.add(arr);//2
//		oa.add(2.7128);//3
//		oa.add(new Car("Tavria",1983,"#ff0000", false));//1;01;00//4
//		oa.add(new Person("Viki", 25, false));//5
//		oa.add(new Person ("Sasha", 58, true));//6
//		oa.add("Masha");//7
//		oa.display();//pokajet vse elementi
//		System.out.println(oa.size());//pokajet kol-vo elementov
		
		oa.add(0);//0
		oa.add(1);//1
		oa.add(2);//2
		oa.add(3);//3
		oa.add(4);//4
		oa.add(5);//5
		oa.add(6);//6
		oa.add(7);//7
		oa.display();//pokajet vse elementi
		System.out.println(oa.size());//pokajet kol-vo elementov
		
		
//-		System.out.println("----addToIndex-----");
//        Object obj = oa.addToIndex(7894,2);
//		System.out.println(obj);
//		System.out.println(oa.size());
//		oa.display();
		
		
		
//+		System.out.println("-----removeLast------");
//		Object obj = oa.removeLast();
//		System.out.println(obj);
//		System.out.println(oa.size());
//		oa.display();
		
		
//+		System.out.println("------Remove------");
//		oa.remove(4);
//		oa.display();
		
		System.out.println("----RemoveFirst-----"); // udalyaet 0 no poslednii kopiruet
//        System.out.println(oa.size());
		Object obj = oa.removeFirst();
//	    System.out.println(obj);
//		System.out.println(oa.size());
		oa.display();
		System.out.println(oa.size());
		
//-		System.out.println();
//	System.out.println("------merge-----");
//		Object[] arr1 = new Object[2];
//		arr1[0] = new Car("suzuki", 2004, "blue", true);
//		arr1[1] = new Person("Natali", 20, false);
//		oa.merge(arr1);
//		System.out.println("-----");
//		System.out.println(oa.size());
//		oa.display();
		
	
		
	}


}
