
public class ThrowTest {

	public static void main(String[] args) {
		double res = 0;

		try {
			res = divide(5,0);//surround try/ catch
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}

		public static double divide(double a, double b) throws Exception{
			if(b==0)//esli to vidai owibku
				throw new Exception("Error : division by ZERO");//add throw declaration
			return a/b;

		}
}
