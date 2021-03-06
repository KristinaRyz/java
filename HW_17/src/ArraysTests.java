

public class ArraysTests {

	public static void printArrayReverse(int ar[]){
		for(int i=0, j = ar.length-1; i<j; i++, j--){
			int temp = ar[j];
			ar[j] = ar[i];
			ar[i] = temp;
		}

	}

	public static void printArray(int ar[]){ // size ne nujen, on sam vse znaet
		for(int i = 0;i<ar.length; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int arrayEvensSum(int ar[]){
		int	sum = 0;
		for(int i = 0; i<ar.length; i++){
			if(ar[i] % 2 == 0){
				sum += ar[i];
			}
		}
		return sum;
	}

	
	public static int searchMaxInd(int ar[]) {
		
		int max = ar[0], maxInd = 0;
		for(int i = 0; i<ar.length; i++){
			if(ar[i]> max){
				max = ar[i];
				maxInd = i;
			}
		}
		return maxInd;

	}
	
	public static void sortBubble(int ar[]){
		int temp;
		while(maxToEnd(ar)==false){
			for(int j=0; j<ar.length-1; j++){	
			if(ar[j]>ar[j+1]){
				temp = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = temp;
			  }
			}
		}
	}
	
	
	private static boolean maxToEnd(int ar[]){
		boolean j = true;
		for(int i=0; i<ar.length - 1; i++){
			if(ar[i]>ar[i+1]){
				j = false;
			}
		}
		return j;
	}


}

