
public class MyArrayTest {

	public static void main(String[] args) {
		int[] array= {9,7,4,2,5,3,6,1};
		MyArray ma = new MyArray(array);//v object peredali array//ssilra nazivaetsa ma
		MyArrayIterator mari= new MyArrayIterator(ma);
		
		while(mari.hasNext()){
			System.out.println(mari.next());
		}

	}

}
