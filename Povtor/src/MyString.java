
public class MyString {

	public static void main(String[] args) {

		String ch = new String ("abs");
		char sym = ch.charAt(1);
		System.out.println(sym);



		char chn;
		chn = "abc".charAt(1);
		System.out.println(chn);
		
//		String str = new String("HelloWorld"); 
//		String str2 = str.substring(2);
//		System.out.println(str2); 
//		String str3 = str.substring(2, 5);
//		System.out.println(str3);
		
		String str = new String("HelloWorld"); 
		String search = "ll";//iskomaya podstroka
		String sub = "mm";//zamenitel
		String res = "";//result
		int i;
		do{
			System.out.println(str);
			i=str.indexOf(search);//nawel podstroku
			if(i!=-1){
				res = str.substring(0, i);//izvlek ot 0 do podstroki ll ne vkluchaya ll
				System.out.println(res);
				res = res+sub; // soedenil He+mm
				res = res + str.substring(i+ search.length());//soedinil Hemm s izvlekwei podstrokoi kotoraya na4inaetsya ot i and do konca
				str =res;
			}
		}
			while (i!=-1);
		
	}
	}



