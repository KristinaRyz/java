import java.util.*;

public class ComparatorMessagesByNumber
                       implements Comparator<Message>{

	@Override
	public int compare(Message msg1, Message msg2) {
		
		return msg1.getNumber() - msg2.getNumber();
	}

}
