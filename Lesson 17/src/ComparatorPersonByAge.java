
import java.util.Comparator;

public class ComparatorPersonByAge
implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2){
		int age1 = p1.getAge();
		int age2 = p2.getAge();
		return Integer.signum(age1 - age2);
	}

}
