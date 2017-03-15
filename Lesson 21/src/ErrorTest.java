
public class ErrorTest {
	public static void main(String[] args) {
		int size = Integer.MAX_VALUE;
		System.out.println("Default size = " + size);
		while(true){
			try{
				byte [] ar = new byte[size];//novii array s razmerom Max_Value
				break;
			}
			catch(Error e){
				System.out.println("Error : " + e.getMessage());
				size--;
			}
		}
		//	System.out.println("End of program");
		System.out.println("Alocated size = " + size);
	}
}