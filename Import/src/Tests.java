
public class Tests {

	public static int sumEvensArray(int ar[]){
		int sum = 0;
		for(int i = 0; i<ar.length; i++){
			if(ar[i]%2==0){
				sum += ar[i];
			}
		}
		return sum;
	}

	
	
	public static int searchMaxInd(int ar[]){
		int max = ar[0], maxInd = 0;
		for(int i = 0; i<ar.length; i++){
			if(ar[i]>max){
		    max=ar[i];
			maxInd = i;
			}
		}
		return maxInd;
	}
	
	
	public static void sortBubble (int ar[]){
		int temp;
		for(int i = 0; i<ar.length; i++){
			for(int j =0; j<ar.length-1; j++){
				if(ar[j]>ar[j+1]){
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
	}
	
	
	
}
