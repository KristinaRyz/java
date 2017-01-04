
public class ArrayTest {

	public static void main(String[] args) {
		int[] ar = {7,8,9,4,5,6,2}; // 4 byte
		int[] ar1 = ar;//smotrit na masiv ar
		
		for(int i=0;i<ar1.length; i++){
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		byte[] arB = new byte[7];
		for(int i = 0; i<arB.length; i++){
			System.out.print(arB[i]+" ");
		}
		System.out.println();
		
		arB[6] = 9;
		/////////////////////////////
		
		String[] arStr = {"Igor","Alex", "Tali", "Sally"};
		//              0     1      2       3 
		// arStr --> [Igor] [Alex] [Tali] [Sally]
		
		String str1 = arStr[0];// str1 cmotrit na ssilky, na kotoruu smotrit silka ya4eiki arStr[0]
		String str2 = arStr[1];
		
		if(str1 == arStr[0]) //ssilka str1 smotrit na tuge ssilku 4to i arStr[0]
			System.out.println();
	}

}
