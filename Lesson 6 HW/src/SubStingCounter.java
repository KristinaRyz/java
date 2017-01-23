
public class SubStingCounter {

	public static void main(String[] args) {
		String str = "Sweet home, my home home";
		String subs = "home";
System.out.println("Result : "+ subCount(str,subs));
System.out.println("Result : "+ isSubstring(str, subs));

	}
	public static int  subCount(String str, String subs){
		int subsSize = subs.length();
		int strLength = str.length();

		int counter =0;
		for(int i = 0; i<=strLength-subsSize; i++){
			String temp = str.substring(i, i+subsSize);//sdelay iz menya malenkuu stro4ku po takim indexam
			if(subs.equals(temp)){
				counter++;  
			}
				
		}
		return counter;
	}
	public static boolean isSubstring (String str, String subs){
		int subsSize = subs.length();
		int strLength = str.length();

		boolean counter = false;
		for(int i = 0; i<=strLength-subsSize; i++){
			String temp = str.substring(i, i+subsSize);
			if(subs.equals(temp)){
				counter = true;  
			}
				
		}
		return counter;
	}
}