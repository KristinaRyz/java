
public class ArrayTest1 {

	public static void main(String[] args) {
		String[] arStr = new String[3];
		
		String str1 = "Hello";
		arStr[0] = "Hello";
		arStr[1] = str1;
		arStr[2] = new String(str1);//peredali soderjimoe ssilki str1 (Hello) na drugoi Hello potomu 4to NEW
		
		if(str1 == arStr[2])
			System.out.println("Equals");//da, potomu 4to soderjimoe odinakovoe
		System.out.println(arStr[2]);
		
		
	}

}
