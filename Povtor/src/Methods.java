import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {

		int	ar[] = {1,3,2,5,444,9,6,8,7};

//		System.out.println(Arrays.toString(ar));
//		System.out.println("sumEvens = "+Tests.sumEvensArray(ar));
//
//		int maxInd = Tests.searchMaxInd(ar);
//		System.out.println("maxInd = " + maxInd);
		
		Tests.sortBubble(ar);
		System.out.println(Arrays.toString(ar));
	}



}