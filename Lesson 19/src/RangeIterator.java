import java.util.Iterator;
public class RangeIterator implements Iterator<Integer>{

	private Range range;
	private int position;
	
	public RangeIterator(Range rng){
		this.range = rng;
		position = range.getFrom();
	}
	
	
	
	@Override
	public boolean hasNext() {//vnutri ili za predelami
		if(position <= range.getTo())
			return true;
		return false;
	}

	@Override
	public Integer next() {//dai object gde stoiw i pereidi na sleduuwii
		int current = position; //position zapomnili
		position++;//sdvinuli
		return current;//ili return positionxzd
	}



	public boolean hasPrevious() {
int curret = 
		return false;
	}

	
	}
	


