
public class RefTest {

	public static void main(String[] args) {
		int a = 5; //[][][][5] ->a
		int b = a; //[][][][5] ->b novie4 bytes

		
		String str1="Hello";//str1 ->[Hello]
		String str2 = str1; // str1 ->[Hello]<-str2  smotrirt tuda je kak i str1, novaya pamyat ne sozdaetsya
	System.out.println(str2);
	str1=null; // str2->[Hello] str1->null
	str2=null;
	}

}
