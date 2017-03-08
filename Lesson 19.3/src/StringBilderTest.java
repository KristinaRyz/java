
public class StringBilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");//mutable
		str.append(" Word");//dopiwet
		System.out.println(str);
		
		String str1 = new String("Hello");
		str1.concat(" World");
		System.out.println(str1);
		
		
		String str3 = str.toString();
		
		str.delete(3, 7);
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder(str1) // iz String sdelat StringBuilder
				
		
	}

}
