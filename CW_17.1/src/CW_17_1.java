
public class CW_17_1 {

	public static void main(String[] args) {
		int[] ar1 = {5,2,6,7,8,8,9,7}; // 1 sposob
		int[] ar2 = ar1;

		for(int i = 0; i < ar1.length; i++){
			System.out.print(ar1[i] + " ");
		} 
		System.out.println();
		for(int i = 0; i < ar2.length; i++){
			System.out.print(ar2[i] + " ");
		}
		//i = 9 //esli ob'yavit posle for = rabotat ne budet, peremennaya rabotaet tolko v predelah cikla (v skopi)
		int[] ar3 = new int [7]; // 2 sposob, i v kagdoi po 0
		System.out.println();
		for(int i = 0; i < ar3.length; i++){
			System.out.print(ar3[i] + " ");
		}
		System.out.println();
		ar3[4] = 9;
		for(int i = 0; i < ar3.length; i++){
			System.out.print(ar3[i] + " ");
		}
	}

}
