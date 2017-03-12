
public class RangeTest {

	public static void main(String[] args) {
		Range rng = new Range(-5,5);
		RangeIterator iter = new RangeIterator(rng);

		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}


	while(iter.hasPrevious()){
		System.out.println(iter.previous());
	}
	}
	
}