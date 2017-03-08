
public class TestMyString {

	public static void main(String[] args) {
		MyString mstr = new MyString("Hello!");
		MyStringIterator iter = new MyStringIterator(mstr);//stroim object 


		while(iter.hasNext()){
			System.out.print(iter.next());
		}

	}

}
