
public class TestString {

	public static void main(String[] args) {
		//sozdanie objecta 2 sposobami
//                               0 1 2 3 4 
		String str = new String("H e l l o"); //operator new
String str1 = "Bye"; // constanta

char sym = str.charAt(1);
System.out.println(sym);

for(int i = 0; i<str.length();i++){
	System.out.println(str.charAt(i));
}

int ind = str.indexOf('e');
System.out.println(ind);// vidaet nomer indexa po ego soderjaniu
	

String str2 = str.substring(2);
System.out.println(str2); //nachinaet so 2 ind i pechataet do konca (beginIndex)

String str3= str.substring(1,4);
System.out.println(str3);

String str4 = str3.concat(" world"); //str3. soedinyaet s str4
System.out.println(str4);

boolean res  = isReverse("hello", "olleh");
System.out.println(res);
	}
	
public static boolean isReverse(String str1, String str2){
	int size1 = str1.length();
	int size2 = str2.length();
	if(size1 != size2)
		return false;
	int i,j;
	for(i=0, j = size2-1; i<size1; i++, j--){
		if(str1.charAt(i) != str2.charAt(j))
			return false;
}
return true;
	

}
}
