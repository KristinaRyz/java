
public class Calculator {

	public static void main(String[] args) {//["23","34","+"]

		int args0=Integer.parseInt(args[0]);
		int args1=Integer.parseInt(args[1]);
		String action = args[2];
		System.out.println("Result: "+args0+" "+action+" "+ args1+" = " +calculate(args0,args1,action));
	}

	public static int calculate(int first,int second, String action){

		switch(action){
		case "+":
			return first+second;
		case "-":
			return first-second;
		case "/":
			if(second==0){
				System.out.println("You can't devide by zero");
				return 0;
			}else{
				return first/second;
			}
		default:
			System.out.println(action+" - unsupported action");
			return 0;

		}
	}
}