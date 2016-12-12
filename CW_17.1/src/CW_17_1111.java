
public class CW_17_1111 {

	public static void main(String[] args) {
		String str2 = "Hello";
		String str3 = new String("Hello");
		if(str2 == str3) // pravda li smotryat v odnu storonu? net, 2 raznih ob'ekta s odnim nazvaniem 
			System.out.println("Equals");
		
		int a = 3;
		int b = 3;
		if(a==b)
			System.out.println("Equals int");
	}

}
