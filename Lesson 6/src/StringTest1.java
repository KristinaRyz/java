
public class StringTest1 {
	public static void main(String[] args) {
		String str = "  Zemleroika     ";
		boolean res = str.equalsIgnoreCase("zemleroika");
		res = str.isEmpty();
		String str1 = str.toLowerCase();// vozvrawaet drugoi str malenkimi bukvami
		str1 = str.trim();//vozvrawaet bez probelov vnachale i v konce
		System.out.println(str1);
		str1 = str.toUpperCase();
		System.out.println(str1);
		String str2 = "Hello word and students";
		System.out.println(str2);
		String[] ar = str2.split(" ");
		str2 = str.replace('e', 'a');
		res = str.contains("roi");
		System.out.println(res);
		for(String s: ar) {//dlya kagdogo s iz array ar
		System.out.println(s);} // raspechatai 
		
		int[] ar1 = {4,2,7,5,9,6};
		int sum = 0;
		for(int i:ar1){
			sum=sum+i;
		}
		System.out.println();

	}
	//                                  "Zemleroika"  "leroi"
	public static boolean isSubstring(String str, String subStr){
		int size2 = subStr.length();
		int size1 = str.length();
		for(int i = 0; i<= (size1-size2); i++){
			String s1 = str.substring(i, i+size2); // substring ne beret poslednii symbol, t.e 0,1,2,3,4
			if(s1.equals(subStr))
				return true;
		}
		return false;
	}
}
