import java.util.*;
import java.util.Map.Entry;
public class MapTest {

	public static void main(String[] args) {
		//    <tip key, value>
	//	HashMap<String,Integer> map = new HashMap<String,Integer>();
	//	LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();

		map.put("Volvo", 3);
		map.put("Fiat", 5);
		map.put("Mazda", 3);
		map.put("Toyota", 4);
		map.put("Ferrari", 3);
	
		System.out.println(map);//vizivaet toString classa HashMap
		int i = map.get("Fiat");//polu4aet key, vozvrawaet value
		System.out.println(i);
		//int i1 = map.get("Honda");//unboxing//delaet iz Integer bolwogo, malenkii//polu4aet key, vozvrawaet value
		//esli ne syw key - null
		System.out.println(map.get("Honda"));
		System.out.println(map.size());
		System.out.println(map.remove("Fiat"));//daem key
		System.out.println(map);
		System.out.println(map.remove("Toyota", 5));//daem key i value/ne udalyaet, net takogo
		System.out.println(map);
		System.out.println(map.replace("Volvo", 3, 1));
		System.out.println(map);

		System.out.println(map.replace("Mazda", 4));//daem key i new value
		System.out.println(map);

		System.out.println(map.containsValue("Ferrary"));//owibka v nazvanii  poetomu false
		///////For Iterating/////////
		System.out.println();
		System.out.println("-------For iterating--------");
		Set<Entry<String,Integer>> entries = map.entrySet();//set objectov for Iterator
		for(Entry<String,Integer> e: entries){//delat import java.util.Map//vidai set v kotorom object s 2 polyami(key,value)
			System.out.print("Model :" + e.getKey());
			System.out.println("\t Quantity : " + e.getValue());
		}
		System.out.println();
		System.out.println("----------Only Keys-----------");
		Set<String> keys = map.keySet();//vozvrawaet set key
		for(String k: keys){
			System.out.println(k);}
		System.out.println();
		System.out.println("---------Only values---------");
		Collection<Integer> list = map.values();
		for(int i2: list){
			System.out.println(i2);
		}
	}

}
