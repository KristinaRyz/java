
public class TestString {
	public static void main(String[] args) {

	}
	// HELLO & OLLEH 
	public static boolean isReversed(String str1, String str2){
		int size1 = str1.length();
		int size2 = str2.length();

		if(size1 != size2)
			return false;

		for(int i = 0; i< size1; i++){
			if (str1.charAt(i) != str2.charAt(size2 -1 -i))
				return false;
		}
		return true;
	}
}
