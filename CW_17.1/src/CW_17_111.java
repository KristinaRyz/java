
public class CW_17_111 {

	public static void main(String[] args) {
		byte[] ar1 = {6,2,1,7,5,9};
		byte[] ar2; // smotrit v null
		ar2 = ar1;
		ar1 = null;
		for(int i = 0; i < ar2.length; i++){
			System.out.print(ar2[i] + " ");

		}

		char[] ar3 = new char[7];
		ar3 [2]= 'O';
		char[] ar4 = ar3;
		ar3 = null;
		System.out.println();
		for(int i = 0; i < ar4.length; i++){
			System.out.print(ar4[i] + " ");
		}
		String[] ar5 = {"Igor","Alex", "Rivka", "Sarah"};
		String[] ar6 = new String[5];
		System.out.println();
		ar6[0] = "Banana";
		ar6[2] = "Kiwi";
		String str1 = "Apple";
		ar6[3] = str1;		
		for(int i = 0; i < ar6.length; i++){
			System.out.print(ar6[i] + " ");
		}
	}
	


}
