package Test;
import dao.Car;
import dao.Person;
import model.ObjectArray;

public class Test {

	public static void main(String[] args) {
		//
				ObjectArray oa = new ObjectArray(3);//3 yzcheiki
				//oa.add(new Car("Ford",2015,"#ffff00",true));
//				Object obj = oa.removeLast();
//				System.out.println(obj);
//				System.out.println(oa.size());
//				System.out.println("------------------------");
//				oa.display();
//				System.out.println("--------------------------");
				
					oa.add(38);
					oa.add("Sasha");
					int[] arr = {2,-8,4};
					oa.add(arr);
					oa.add(2.7128);
					oa.add(new Car("Tavria",1983,"#ff0000", false));//1;01;00
					oa.add(new Person("Viki", 25, false));
					oa.add(new Person ("Sasha", 58, true));
					oa.add("Masha");
				    oa.display();
					
				    System.out.println();
					System.out.println(oa.size());
					/*obj = oa.removeFirst();
					System.out.println(obj);
					System.out.println(oa.size());*/
					oa.addToHead(75);
					oa.display();
					System.out.println(oa.size());
			}
}

