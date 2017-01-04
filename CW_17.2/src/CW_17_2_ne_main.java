
public class CW_17_2_ne_main {
	
	
	public static void printArray(int ar[]){ // size ne nujen, on sam vse znaet
		for(int i = 0;i<ar.length; i++){
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static int arraySum(int ar[]){
	int sum = 0;
	for(int i = 0; i<ar.length; i++){
		sum = sum + ar[i];
	}
	return sum;
}
}

