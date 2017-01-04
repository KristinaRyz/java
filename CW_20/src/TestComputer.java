
public class TestComputer {

	public static void main(String[] args) {
		
		Object comp1 = new Computer(8, 500, "Dell");
		//String str = comp1.toString();
		System.out.println(comp1);
		
		Computer comp2 = new Computer(8, 500, "Dell");
		
		boolean res = comp1.equals(comp2);
		System.out.println(res);

		Laptop lp1 = new Laptop(8, 700, "HP",2.5);
		System.out.println(lp1.toString());
		
		Laptop lp2 = new Laptop(8, 700, "HP",2.5);
		res  = lp1.equals(lp2);
		System.out.println(res);
	}

}
