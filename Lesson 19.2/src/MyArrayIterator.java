import java.util.Iterator;
public class MyArrayIterator implements Iterator<Integer> {

	private MyArray ma = null;//public
	int position = 0;
	
	public MyArrayIterator(MyArray ma){
		this.ma = ma;
	}
	
	@Override
	public boolean hasNext() {
		int[] array = ma.getArray();
		if(position < array.length)
			return true;
		return false;
	}

	@Override
	public Integer next() {
		int[] array = ma.getArray();
		int current = array[position];
		position ++;
		return current;
	}

	
	

}
