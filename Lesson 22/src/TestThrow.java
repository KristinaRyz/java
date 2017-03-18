
public class TestThrow {

	public static void main(String[] args) {

		double res = 0;
		boolean isOk = true;

		try {
			res = f3(7,3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			isOk = false;
		}
		if(isOk == true){
			res = finalAction(res);
		System.out.println(res);
		}
		else
			System.out.println("The result is wrong");
	}
	public static double finalAction (double a){
		return a*2;
	}

	public static double f3(double a, double b) throws Exception{
		return f2(a,b);
	}

	public static double f2(double a, double b) throws Exception{
		return f1(a,b);
	}
	public static double f1(double a, double b) throws Exception{
		return divide(a,b);
	}
	public static double divide(double a, double b) throws Exception{
		if(b==0){//esli to vidai owibku
			throw new Exception("Error : division by ZERO");//add throw declaration
		}
		return a/b;

	}
}
