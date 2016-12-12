import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] ar = {0,10,1,9,2,8,3,7,4,6,5};
		ArraysTests.printArrayReverse(ar);//obratilis 4erez imya
		ArraysTests.printArray(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println();
		
		int evensSum = ArraysTests.arrayEvensSum(ar);
		System.out.println("evensSum = "+evensSum);
		System.out.println();

	    int searchMaxInd = ArraysTests.searchMaxInd(ar);
		System.out.println("maxInd = " + searchMaxInd);
		
		System.out.println();
		
		ArraysTests.sortBubble(ar);
	    ArraysTests.printArray(ar);
		
	}
}