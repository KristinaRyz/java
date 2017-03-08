import java.util.*;
public class ListIterator {
public static void main(String[] args) {
	ArrayList<String> arlis = new ArrayList<String>();
	
	arlis.add("Hello");
	arlis.add("Bye");
	arlis.add("Money");
	arlis.add("Happy");
	
	Iterator iter = arlis.iterator();
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
}
}
