
public class ArraysTests {

	public static void printArrayReverse(int ar[]){
		for(int i=0, j = ar.length-1; i<j; i++, j--){
			int temp = ar[j];
			ar[j] = ar[i];
			ar[i] = temp;
			System.out.print(ar[i] + " ");
		}
	System.out.println();
	}

}

