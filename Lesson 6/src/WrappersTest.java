
public class WrappersTest {//obertka

	public static void main(String[] args) {
		int i = 9; // 
		Integer iw = new Integer(7);//primitiv int zasunuli v ssilku// boxing
		//integer iw = 7 // to ge samoe 4to i stoka viwe
		byte b =6;
		Byte bw = new Byte(b);
		Object[] arObj = new Object[5];
		arObj[0] = iw;
		arObj[1] = bw;
		Double dw = new Double(34.98);
		Boolean boolw = new Boolean(true);
		Character cw = new Character('W');
		Integer iwl = 9;//autoboxing
		int a = iwl; // unboxing
		System.out.println(a);
		a = iwl;//autounboxing

		String str = "123";
		String str1 = "456";
		//		str + str1; //contantinacia, prosto sol'ot
		a = Integer.parseInt(str); //static method
		int i1 = Integer.parseInt(str);
		int i2 = Integer.parseInt(str1);
		a = i1+i2;
		System.out.println(a);
		String s1 = new String("9");
		boolean r = Boolean.parseBoolean("true");

	}

}
