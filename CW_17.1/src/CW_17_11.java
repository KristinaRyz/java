
public class CW_17_11 {

	public static void main(String[] args) {
		int[] ar1 = null; // ssilka ar1 massiva int
		ar1 = new int [8];
		int[] ar2 = ar1;
		ar1 = null;
System.out.println(ar2[3]);

char[] arC = {'A','B','C','D','E'};
for(int i = 0; i < arC.length; i++){
	System.out.print(arC[i] + " ");
	}
	byte[] arB = {1,23,-4,4,-89};
	String[] arStr = {"Banana", "Orange", "Kiwi", "Apple"};
	String str1 = arStr[3]; //str1 smotit na yaz4iku
	arStr[3] = "Grape"; // ya4eiku 3 perenapravili na Grape
	str1 =null; // apple propadet
	}
	

}
