import java.util.*;
public class TestSets {

	public static void main(String[] args) {
		String str1 = "Banana";
		String str2 = "Orange";
		String str3 = "Kiwi";
		String str4 = "Mango";
		String str5 = "Apple";
		String str6 = new String ("Apple");

		System.out.println("Banana : " + str1.hashCode());
		System.out.println("Orange : " + str2.hashCode());
		System.out.println("Kiwi : " + str3.hashCode());
		System.out.println("Mango : " + str4.hashCode());
		System.out.println("Apple : " + str5.hashCode());

		//		HashSet<String> hSet = new HashSet<String>();// v svoem poryadke ystanavlivaet
		//		LinkedHashSet<String> hSet = new LinkedHashSet<String>();// kak mi dobavili tak i dobavlyaet
		TreeSet<String> hSet = new TreeSet<String>();//dobavlyaet po alfavitu

		hSet.add(str1);
		hSet.add(str2);
		hSet.add(str3);
		hSet.add(str4);
		hSet.add(str5);
		boolean res = hSet.add(str6);



		System.out.println(hSet.toString());
		System.out.println(res);
	}

}
