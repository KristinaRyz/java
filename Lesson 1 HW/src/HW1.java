
public class HW1 {
	public static void main(String[] args) {
		int[] ar = {8,10,1,9,2,0,3,7,4,6,5};
		printArray(ar);
		reverseArray(ar);
		int minIndex = searchMinInd(ar);
		System.out.println("Min index: " + minIndex);
		sortBubble(ar);
		System.out.println("SortBubble:");
		printArray(ar);
	}
	public static void reverseArray(int ar[]){
		for(int i=0, j = ar.length-1; i<j; i++, j--){
			//				int temp = ar[j];
			//				ar[j] = ar[i];
			//				ar[i] = temp;
			swap(i,j,ar);
		}
		System.out.println("Revers:\t");
		printArray(ar);
	}
	public static void sortBubble(int ar[]){
		int temp;
		while(maxToEnd(ar)==false){
			for(int j=0; j<ar.length-1; j++){	
				if(ar[j]>ar[j+1]){
					//					temp = ar[j];
					//					ar[j] = ar[j+1];
					//					ar[j+1] = temp;
					swap(j,j+1,ar);
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
	public static int searchMinInd(int ar[]) {
		int min = ar[0], minInd = 0;
		for(int i = 0; i<ar.length; i++){
			if(ar[i]< min){
				min = ar[i];
				minInd = i;
			}
		}
		return minInd;
	}
	private static void swap(int i, int j, int [] ar) {
		int temp = ar[i];
		ar[i]=ar[j];
		ar[j]=temp;

	}		
	public static void printArray(int ar[]){ // size ne nujen, on sam vse znaet
		for(int i = 0;i<ar.length; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}
