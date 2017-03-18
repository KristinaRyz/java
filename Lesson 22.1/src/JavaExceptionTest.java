
public class JavaExceptionTest {
	public static void main(String[] args) {
		String myStr = null;
		int index = -4;
		while(true){
			try{
				String sub = getSubStr(myStr, index);
				System.out.println(sub);
				break;
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
				myStr = "zemleroika";
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
				if(index<0)
					index++;
				else
				index--;
			}
		}
	}
	//"zemleroika"   4
	public static String getSubStr(String str, int from) throws NullPointerException,StringIndexOutOfBoundsException{
		if(str == null){
			throw new NullPointerException ("STR is NULL"); 
		}
		if(from >= str.length()|| from<0){
			throw new StringIndexOutOfBoundsException("Wrong index");  
		}
		String res = str.substring(from);//polu4aet kuso4ek from 4 simbol ot zemleroika - eroika
		return res;
	}
}
