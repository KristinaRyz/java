//povtor DZ po lesson 6
public class Calculator {
	// 45 36 +
	public static void main(String[] args) {
		if(args.length == 0)//pusto
			return;
		String first = args[0];
		int a = Integer.parseInt(first);
		String second = args[1];
		int b = Integer.parseInt(second);
		String action = args[2];
int res = 0;
		switch(action){
case"+":res= a+b; break;
case"/": if(b!=0) res= a/b; break;
case"x":res= a*b; break;
case"-":res= a-b; break;
default: System.out.println("Error : wrong action!");
}
		System.out.println("The resault is "+ res);
	}

}
