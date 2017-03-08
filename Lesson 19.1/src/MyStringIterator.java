import java.util.Iterator;
public class MyStringIterator implements Iterator<Character>{

	private String str;
	private int position;

	public MyStringIterator (MyString mstr) {
		this.str = mstr.getStr();
		position = 0;
	}
	@Override
	public boolean hasNext() {
		if(position<str.length())//dlina String
			return true;
		return false;
	}

	@Override
	public Character next() {
		char current = str.charAt(position);//string charAr
		position ++;
		return current;
	}


}
